<!--

Por padrão, sempre que eu crio um objeto do tipo primitivo GLOBAL ele vêm com valores padrao.


int,double,float(qualquer type de número) -> 0
boolean -> false
String -> null


Tem que ser primitivo (letra minuscula)

Sempre que eu criar um objeto/variable do tipo String, se eu não der valor, ele terá o valor null
Sempre que eu criar um objeto/variable do tipo int, se eu não der valor, ele terá o valor 0
Sempre que eu criar um objeto/variable do tipo boolean, se eu não der valor, ele terá o valor false


lembrando que o java atribui valores somente para variables GLOBAIS.
Se eu criar uma variable local em um method e não atribuir valor, vai dar erro.


-Crie variables GLOBAIS:

    public class App{
        static int number3;
        static double number6;
        static boolean number7;
        static String number8;

        public static void main(String[] args){
        }
    }
Esse "static" no attribute, é porque eu nao quero criar um objeto para imprimir esse attribute.

-Imprima cada uma das variables globais


Viu?? Elas automaticamente já recebem um valor padrao.

Mas elas só receberam, porque são variables GLOBAIS.


-Agora crie as variables primitivas dentro do method main e imprima;


Aparece uma mensagem de erro. Eu preciso inicialiar a variable com algum valor.

Se ligou??


Se eu crio uma variable global eu não preciso colocar valor, pois o java automaticamente atribue o valor padrao.


Agora, se essa variable é local, eu PRECISO colocar um valor de inicialização.
    
-->