import java.io.*;
import java.nio.file.*;


public class Programa{
    public static void main(String[] args){
        String caminho = "caminho/arquivo.txt";
        String conteudo = "Conteúdo do arquivo";
        Path arquivo = Paths.get(caminho);

        try{
            Files.write(arquivo, conteudo.getBytes());
        }
        catch(IOException e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
    }
}
