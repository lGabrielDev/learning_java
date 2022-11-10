import java.io.*;

public class App {
    public static void main(String[] args) throws Exception{
        String caminho = "caminho/arquivo.txt";
        String linhaAtual = "";

        try{
            BufferedReader br = new BufferedReader(new FileReader("caminho/arquivo.txt"));

            linhaAtual = br.readLine();
            while(linhaAtual != null){
                System.out.println(linhaAtual);
                linhaAtual = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
    }
}
