import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.*;


public class Programa{
    public static void main(String[] args){
        //variables de input do usuario
        String caminho;
        String caractereSeparador;
        Scanner scan = new Scanner(System.in);
        //variables para lopar o programa
        Boolean arquivoEncontrado = false, opcaoCorreta = false;
        Integer opcaoEscolhida = 0;
        //Criando os objetos Path and File para modificar o arquivo antigo
        File arquivoBaguncado;
        Path arquivoNovo = Paths.get("./arquivo_novo.txt");
        String linhaAtual = "";
        String[] camposSeparados;
        
        do{
            try{
                //O usuario vai inputar o caminho do arquivo e o separador(geralmente ";" ou ",")
                System.out.print("\n\nDigite o caminho do arquivo: ");
                caminho = scan.nextLine();
                arquivoBaguncado = new File(caminho);
    
                System.out.print("Digite o separador: ");
                caractereSeparador = scan.nextLine();
                
                BufferedReader br = new BufferedReader(new FileReader(arquivoBaguncado));
                BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoNovo.toFile(),false));
                //Remover cabeçalho do arquivo
                linhaAtual = br.readLine();
                linhaAtual = br.readLine();
                //Criar arquivo novo. Caso o arquivo já exista, o conteúdo dele será SOBREESCRITO.
                if(Files.notExists(arquivoNovo)){
                    Files.createFile(arquivoNovo);
                }
                //Loop para escrever cada linha do arquivo
                while(linhaAtual != null){
                    camposSeparados = linhaAtual.split(caractereSeparador);
                    for(int i = 0; i<camposSeparados.length; i++){
                        bw.write(String.format("%-60s",camposSeparados[i]));
                    }
                    bw.write("\n");
                    linhaAtual = br.readLine();
                }
                bw.close();
                br.close();
                arquivoEncontrado = true;
                System.out.println("\nArquivo alterado com sucesso!\n\n");
                //Usuario vai escolher se deseja rodar o programa novamente
                //Se o usuario inputar uma opcao inválida ou inputar uma String, vamos lopar.
                do{
                    try{
                        System.out.println("Deseja tratar outro arquivo? ");
                        System.out.println("\n1- Sim\n2- Não");
                        opcaoEscolhida = scan.nextInt();
    
                        switch(opcaoEscolhida){
                            case 1:
                                arquivoEncontrado = false;
                                scan.nextLine();
                                opcaoCorreta = true;
                                break;
                            case 2:
                                arquivoEncontrado = true;
                                System.out.println("Programa finalizado.");
                                opcaoCorreta = true;
                                break;
                            default:
                                System.out.println("Opção inválida!\n");
                                opcaoCorreta = false;
                                break;
                        }
                    }
                    catch(InputMismatchException e){
                        System.out.println("Opção inválida! Por favor, digite um número.\n");
                        scan.nextLine();
                        opcaoCorreta = false;
                    }
                }
                while(opcaoCorreta == false);
            }
            catch(Exception e){
                System.out.println("\nErro. Arquivo não encontrado.\n\n"); 
                arquivoEncontrado = false;
            }
        }
        while(arquivoEncontrado == false);
        scan.close();
    }
}