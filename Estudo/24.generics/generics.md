<h1 align="center">
    Generics &lt;&gt;
    <img src="https://cdn-icons-png.flaticon.com/512/2453/2453764.png" alt="image icon" width="90px" align="center">
</h1>


Uma generic class é uma classe que representa qualquer outra classe. Como o próprio nome sugere, é uma class genérica.

Podemos criar esse generic class de duas formas:

- No pŕoprio method, antes do retorno.
- Na classe.

<hr>
<br>

## Generic methods

Geralmente usamos um method generic, quando podemos receber nesse method vários tipos de datatype.

:warning: Criamos a class generic `<>` antes do retorno.


1. Crie 4 estruturas arrays com diferentes datatypes:

    ```java
    public class Main{
        
        //main() method
        public  static  void  main (String[] args)  {
            Integer[] numbers = {10, 50, 60, 200};
            Double[] numbersQuebrados = {10.25, 50.30, 60.80, 200.10};
            Character[] letters = {'a', 'b', 'c', 'd', 'e'};
            String[] heroes = {"batman", "naruto", "goku"};
        }
    }
    ```

<br>

2. Crie um method para imprimir todas as positions da array "numbers"

    ```java
    public class Main{

        //main() method
        public  static  void  main (String[] args)  {
            Integer[] numbers = {10, 50, 60, 200};
            Double[] numbersQuebrados = {10.25, 50.30, 60.80, 200.10};
            Character[] letters = {'a', 'b', 'c', 'd', 'e'};
            String[] heroes = {"batman", "naruto", "goku"};

            Main.printAllPositions(numbers); // funcionou!
            Main.printAllPositions(numbersQuebrados); // deu ruim...
            Main.printAllPositions(letters); // deu ruim...
            Main.printAllPositions(heroes); // deu ruim...
        }

        //method para imprimir todas as positions
        public static void printAllPositions(Integer[] array){
            for(Integer i : array){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    ```

    Perceba que nesse method só é possível passar como argumento uma array do tipo "Integer". Qualquer outro tipo de array não vai funcionar. Nesse caso, teríamos que criar methods com parâmetros diferentes:

    ```java
        //methods para imprimir todas as positions de uma array
        public static void printAllPositions(Integer[] array){}
        public static void printAllPositions(Double[] array){}
        public static void printAllPositions(Character[] array){}
        public static void printAllPositions(String[] array){}
    ```


    :bulb: Aí que entra a **class generics**. Para sermos mais inteligentes, vamos criar apenas 1 method. O datatype do parâmetro desse method vai ser de uma **generic class**.
    
    <br>

 3. Antes do retorno do method, crie uma generic class `<>`. Como boas práticas, o nome dessa class é `T` (*datatype*).

    ```java
    public class Main{

        //main() method
        public  static  void  main (String[] args)  {
            Integer[] numbers = {10, 50, 60, 200};
            Double[] numbersQuebrados = {10.25, 50.30, 60.80, 200.10};
            Character[] letters = {'a', 'b', 'c', 'd', 'e'};
            String[] heroes = {"batman", "naruto", "goku"};

            Main.printAllPositions(numbers); // funcionou!
            Main.printAllPositions(numbersQuebrados); /// funcionou!
            Main.printAllPositions(letters); // funcionou!
            Main.printAllPositions(heroes); // funcionou!
        }

        //methods para imprimir todas as positions de uma array
        public static <T> void printAllPositions(T[] array){
            for(T i : array){
                System.out.print(i + " ");
            }
            //pulando uma linha
            System.out.println();
        } 
    }
    ```
<br>

4. Crie outro method para imprimir a primeira posicao de uma array. Como queremos atender todo tipo de array, use a class generics `<>`:

    ```java
    public class Main{

        //main() method
        public  static  void  main (String[] args)  {
            Integer[] numbers = {10, 50, 60, 200};
            Double[] numbersQuebrados = {10.25, 50.30, 60.80, 200.10};
            Character[] letters = {'a', 'b', 'c', 'd', 'e'};
            String[] heroes = {"batman", "naruto", "goku"};

            System.out.println(Main.printFirstPosition(numbers));
            System.out.println(Main.printFirstPosition(numbersQuebrados));
            System.out.println(Main.printFirstPosition(letters));
            System.out.println(Main.printFirstPosition(heroes));
        
        }

        //method para printar a primeira posicao de uma array
        public static <T> T printFirstPosition(T[] array){
            return array[0];
        }
    }
    ```

    Perceba que o retorno pode ser genérico, ou seja, de qualquer datatype. O parâmetro também... Podemos passar uma array de qualquer datatype.

    :bulb: Funciona com arraylist também, ou qualquer outra estrutura. Generics é nice :sunglasses:



<hr>
<br>

## Generic classes
Quando não sabemos ao certo qual é o datatype/Class de um attribute, usamos uma class genérica.

1. Crie uma class "Pessoa" com apenas 2 attributes. Um deles vai ser da Class genérica.

    ```java
        public class Pessoa <T> { //Criamos a generic class <T>
        //attributes
        private String name;
        private T favoriteColor; // Esse attribute/objeto é da class generics, ou seja, esse attribute pode ser de qualquer Class

        //constructors
        public Pessoa(String name, T favoriteColor){
            this.name = name;
            this.favoriteColor = favoriteColor;
        }

        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public T getFavoriteColor(){
            return this.favoriteColor;
        }

        public void setFavoriteColor(T favoriteColor){
            this.favoriteColor = favoriteColor;
        }
    }

    // O nosso attribute "favoriteColor" pode ser de qualquer class.

    // Se quiséssemos que ele fosse de somente algumas classes, poderíamos especificar:

    // public class Pessoa <T extends ClasseTal>. Ou seja, Esse attribute pode ser de qualquer classe que seja filha da classeTal.
    ```


<br>

2. Crie 3 objetos "Pessoa", cada um com o attribute "favoriteColor" com datatype diferente.

    ```java
    Pessoa<String> p1 = new Pessoa<>("Camila","Blue");
    Pessoa<Integer> p2 = new Pessoa<>("Camila",2);
    Pessoa<Character> p3 = new Pessoa<>("Camila",'B');

    // O primeiro parametro é o attribute "name". Como esse attribute já possui uma class definida, não precisamos informar a class.

    // O segundo parametro é o attribute "favoriteColor". Como esse attribute é da class generics, precisamos definir a class desse attribute <>.
    ```

    Se ligou? Se um dos parameters for de uma class generics, precisamos definir a class desse attribute <>.

    Funciona igual uma `ArrayList`.

    ```java
    Pessoa<String> p1 = new Pessoa<>("Camila","Blue");

    List<String> lista = new ArrayList<>();
    ```


<br>
<br>

## Criando multiple generic classes
Podemos criar várias generics classes. Vai funcionar igualzin... Na hora de criarmos os objetos dessa class, precisamos espeficiar o datatype desses attributes generics.

```java
// criando a class Pessoa

public class Pessoa <T,V> { // Criamos 2 generic classes
    //attributes
    private String name;
    private T favoriteColor; // Esse attribute pode ser de qualquer Class
    private V medalhas; // Esse attribute pode ser de qualquer Class

    //constructors
    public Pessoa(String name, T favoriteColor, V medalhas){
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.medalhas = medalhas;
    }
}
```


```java
Pessoa<String, String> p1 = new Pessoa<>("Gabriel","Orange","quartenta");
Pessoa<String, Integer> p2 = new Pessoa<>("Paulo","Red",40);
//Quando criamos o objeto, precisamos especificar a class desses attributes que são de uma class generic.
```
<br>

Um exemplo, é a estrutura **HashMap**:

```java
Map<Integer,String> lista = new HashMap<>();
```

<hr>
<br>

## Limitando as classes generics - bounded types
Nós podemos restringir de quais classes um attributo pode pertencer. 

1. Crie novamente uma class "Pessoa" com 2 attributes. Um deles vai ser da class generics.

    ```java
        public class Pessoa <T> {
        //attributes
        private String name;
        private T favoriteNumber;

        //constructors
        public Pessoa(String name, T favoriteNumber){
            this.name = name;
            this.favoriteNumber = favoriteNumber;
        }

    }
    ```

    Como é uma class genérica, na hora de criar um objeto podemos passar qualquer objeto no argumento (String,Cachorro,Integer,etc...)

    ```java
    Pessoa<String> p1 = new Pessoa<>("Camila","4");
    Pessoa<Double> p2 = new Pessoa<>("Pedro",4.40);
    ```

    <br>

2. Especifique essa classe generic. O attribute "favoriteNumber" só poderá receber integer and doubles.

    ```java
    public class Pessoa <T extends Number>
    ```

    Perceba que agora não é possível passar outro valor como argumento, a nao ser classes filhas da class "Number".

    ```java
    Pessoa<Integer> p1 = new Pessoa<>("Camila",4);
    Pessoa<Double> p2 = new Pessoa<>("Pedro",4.40);
    ```

    Conseguimos passar a class "Integer" and "Double" , porque elas são classes filhas da class "Number".

<hr>
<br>

### Exercitando

:pencil2: Crie 3 classes:
- "Animal" .
- "Dog" que extends "Animal" .
- "Cat" que extends "Animal" .

*Não precisa criar attributes ou constructors... *


:pencil2: Crie novamente uma class "Pessoa". Essa class vai possuir apenas 2 attributes:

- "name" --> Nome da pessoa
- "pet" --> Objeto da classe generics.

    ```java
    public class Pessoa <T extends Animal> { // Essa classe generic só poderá ser uma class filha da Class "Animal"
        //attributes
        private String name;
        private T pet;

        //constructor
        public Pessoa(String name, T pet){
            this.name = name;
            this.pet = pet;
        }
    }
    ```
    <br>



    ```java
    Pessoa<Dog> p1 = new Pessoa<>("Camila",new Dog());
    Pessoa<Cat> p2 = new Pessoa<>("Pedro",new Cat());

    //Conseguimos setar a class "Dog" e "Cat"  porque elas são classes que extends a class "Animal".
    ```




<hr>
<br>

## Relembrando <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- `generic method` -->  Criamos a generic class na descrição do method, antes do retorno.

- `generic Class` --> Criamos as generics classes na descrição da class.

<br>
<br>

<!-- Next page button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/1.array(vetores)/1.array.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>