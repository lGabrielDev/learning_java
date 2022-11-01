import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){
        String caminho = "C:/Users/Gabriel/Desktop/praticando.csv";

        List<Usuario> lista = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha = br.readLine();
            linha = br.readLine();

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
