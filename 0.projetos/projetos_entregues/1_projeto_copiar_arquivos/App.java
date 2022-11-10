import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Path arquivo = Paths.get("/home/gabriel/Desktop/projeto_copiar_arquivo/copiar_arquivo/material_de_apoio/arquivo.txt");
        Path arquivoNovo = Paths.get(arquivo.getParent().toString() + "/arquivoNovo.txt");
        
        try{
            Files.copy(arquivo, arquivoNovo);
            System.out.println("Arquivo copiado com sucesso!");
        }
        catch(Exception e){
            System.out.println("Erro. Arquivo não encontrado.");
        }
    }
}
