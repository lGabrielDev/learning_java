import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App{
    //method main
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcaoEscolhida = 0;
        boolean escolhaCerta = true;


        
        do{
            do{
                System.out.println("****-------------------****");
                System.out.println("Escolha a opcao que deseja:");
                System.out.println("1- Criar arquivo");
                System.out.println("2- Ler arquivo");
                System.out.println("3- Sair do programa");
                System.out.println("****-------------------****");
                
                    try{
                        opcaoEscolhida =  scan.nextInt();
                        escolhaCerta = true;
        
                    }
                    catch(Exception e){
                        System.out.println("Opcao inválida");
                        System.out.println("Digite um número");
                        scan.nextLine();
                    }
            }
            while(escolhaCerta == false);
            
            

            switch(opcaoEscolhida){
                case 1:
                    salvarArquivo();
                    break;
                case 2:
                    lerArquivo();
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        while(opcaoEscolhida > 3 || opcaoEscolhida < 1);
    
        scan.close();
    }

    //Salvar arquivo
    public static void salvarArquivo(){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----------------------------------");
        System.out.println("Informe o conteúdo do arquivo:");
        String conteudoDoArquivo = scan.nextLine();

        System.out.println("-----------------------------------");
        System.out.println("Informe o nome do arquivo:");
        String nomeDoArquivo = scan.nextLine();

        
        String caminhoDoArquivo = "C:/Users/Gabriel/Desktop/"+nomeDoArquivo+".txt";


        try{
            File arquivo = new File(caminhoDoArquivo);
            FileWriter editarArquivoPadrao = new FileWriter(arquivo,false);
            BufferedWriter editarArquivoOtimizado = new BufferedWriter(editarArquivoPadrao);
            editarArquivoOtimizado.write(conteudoDoArquivo);
            editarArquivoOtimizado.close();

            System.out.println("-----------------------------------\n");
            System.out.println("Arquivo salvo com sucesso!\nCaminho do arquivo descrito abaixo:");
            System.out.println(caminhoDoArquivo);
            System.out.println("-----------------------------------\n");
        }
        catch(IOException e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
        scan.close();
    }

    //Ler arquivo
    public static void lerArquivo(){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n-----------------------------------");
        System.out.println("Digite o nome do arquivo que deseja ler:");

        String nomeDoArquivo = scan.next();
        String caminhoDoArquivo = "C:/Users/Gabriel/Desktop/"+nomeDoArquivo+".txt";

        try{
            FileReader fr = new FileReader(caminhoDoArquivo);
            BufferedReader lerArquivo = new BufferedReader(fr);

            String linha = lerArquivo.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = lerArquivo.readLine();
            }
            lerArquivo.close();
        }
        catch(IOException e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
        scan.close();
    }
}
