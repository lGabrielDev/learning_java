import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class App {
    public static void main(String[] args) throws Exception{
        String caminho = "caminho/arquivo1.txt";

        Path arquivo = Paths.get(caminho);
        
        try{
            List<String> linhasDoArquivo = Files.readAllLines(arquivo); 

            for(int i = 0; i < linhasDoArquivo.size(); i++){
                System.out.println(linhasDoArquivo.get(i));
            }
        }
        catch(Exception e){
            System.out.println("Erro.");
        }
    }
}
