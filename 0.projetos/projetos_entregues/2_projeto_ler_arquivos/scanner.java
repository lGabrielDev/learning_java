import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        String caminho = "caminho/arquivo.txt";
        File arquivo = new File(caminho);
        Scanner scan = new Scanner(arquivo);

        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
