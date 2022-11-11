import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){
        String caminho = "C:/Users/Gabriel/Desktop/praticando.csv";
        File arquivo = new File(caminho);

        List<Usuario> lista = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            //removendo o cabeçalho do arquivo
            String linha = br.readLine();
            linha = br.readLine();

            //lendo o arquivo completo
            while(linha != null){
                String[] informacoes = linha.split(";");
                String name = informacoes[0];
                Integer age = Integer.parseInt(informacoes[1]);
                Double value = Double.parseDouble(informacoes[2]);

                Usuario usuario = new Usuario(name, age, value);

                lista.add(usuario);

                linha = br.readLine();
            }

            for(Usuario i : lista){
                System.out.println(i.toString());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }  
}
