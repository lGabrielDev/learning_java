<h1 align="center">
    Generics &lt;&gt;
    <img src="https://cdn-icons-png.flaticon.com/512/2453/2453764.png" alt="image icon" width="90px" align="center">
</h1>


## Generic class

Uma **Generic class** é, como o próprio nome já diz, uma classe genérica. Usamos uma generic class quando não queremos especificar o tipo de dado de um objeto.


### Criando um attribute generic
Quando não queremos especificar a class/datatype de um attriute, nós setamos esse attribute como Generic. Assim, só quando formos instanciar um objeto dessa class, precisamos dizer qual será a class/datatype desse attribute.


1. Crie uma class "Person", onde 1 dos attributes é do tipo Generic. Ou seja, não tem uma class específica. Nós só vamos decidir qual a class que vamos utilizar, quando instanciarmos um objeto dessa class.


    ```java
    public class Person <T>{ //informamos que nessa class "Person" vai existir um attribute de class generic.
        
        //attribute
        private String name;
        private T color; //Criamos um attribute de class generic. Esse attribute pode receber qualquer Class(Integer,Double,String,Cachorro,etc...)

        //constructors
        public Person(){}

        public Person(String name, T color){
            this.name = name;
            this.color = color;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public T getColor(){
            return this.color;
        }

        public void setColor(T color){
            this.color = color;
        }
    }
    ```
    📖 Sempre que criamos um attribute generic, precisamos informar lá em cima que a Class irá conter attributes generics.


    <br>

2. Crie/instancie 1 objeto dessa class e especifique qual a class que vamos utilizar no attribute generic.

    ```java
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("Adolfo", "zica"); //o attribute generic vai receber uma String
        Person<Long> p2 = new Person<>("Paloma", 44l); //o attribute generic vai receber um Long
        Person<Boolean> p3 = new Person<>("Paloma", true); //o attribute generic vai receber um Long
    }
    ```

    <br>

    Perceba que a forma de mencionar a class do attribute generic é igualzinho como se estivéssimos setando uma `List<>`, um `Map<>`, etc...

    ```java
    List<Double> numbers = new ArrayList<>(); //possui apenas 1 generic attribute

    Map<Integer,String> lista = new HashMap<>(); //possui 2 generic attributes
    
    Person<Double> p2 = new Person<>("Paloma", 44d); //o attribute generic vai receber um Double
    ```

    📖 Sempre que instanciamos uma class que contêm attributes generics, precisamos dizer qual a Class desse attribute.


<br>
<br>

### Criando um attribute generic mais específico.

Digamos que queremos criar um attribute de class generic que possua apenas numbers. Pra isso, é só dizer que a class generic que vamos utilizar vai extends a class **Number**. Ou seja, nessa class generic só vamos aceitar Classes que sejam filhas da Class **Number**.

<br>

1. Crie uma class "Person", onde 1 dos attributes é do tipo Generic. Só permitiremos Classes que herdam/sejam filhas da Class `Number`.`
    
    ```java
    public class Person <T, V extends Number>{ //informamos que nessa class "Person" vai existir attributes generics:
        // T --> Class generic (Todas as Classes)
        // V --> Class generic (Apenas Classes que herdam/são filhas da Class Number - Integer/Long/Double,etc...)

        //attribute
        private String name;
        private T color; //Criamos um attribute de class generic.
        private V salary; //Criamos um attribute de class generic
        

        //constructors
        public Person(){}

        public Person(String name, T color, V salary){
            this.name = name;
            this.color = color;
            this.salary = salary;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public T getColor(){
            return this.color;
        }

        public void setColor(T color){
            this.color = color;
        }

        public V getSalary(){
            return this.salary;
        }

        public void setSalary(V salary){
            this.salary = salary;
        }
    }
    ```

    

    📖 Os nomes das classes generic que nós usamos `(T,V)` poderiam ter qualquer outro nome. Por convenção, usamos "**T**" para a primeira generic class, e "**V**" para a segunda generic class. Lembrando que poderíamos ter várias generic classes.

    <br>

2. Crie/instancie 1 objeto dessa class e especifique quais as Classes que vamos utilizar nos generic attributes.

    ```java
    public static void main(String[] args) {
        Person<String, Integer> p1 = new Person<>("Rodrigo", "Grey", 5); //O primeiro attribute generic recebe "String", o segundo attribute generic recebe "Integer";
        Person<Double, Double> p2 = new Person<>("Rodrigo", 5d, 5d); //O primeiro attribute generic recebe "Double", o segundo attribute generic recebe "Double";
        Person<String, Float> p3 = new Person<>("Rodrigo", "Grey", 5f); // etc...
        Person<String, Long> p4 = new Person<>("Rodrigo", "Grey", 5l); // etc...
    }
    ```

    📖 Se ligou? Se um dos parameters for de uma class generics, precisamos definir a class desse attribute `<>`.

    <br>

### <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center"> Relembrando:

- Sempre que uma Class tiver um attribute generic, precisamos informar lá em cima na Class.
- Sempre que instanciarmos essa Class, precisamos informar qual a Class dos generic attributes.

<hr>
<br>


## Generic methods
Assim como generic attributes, também temos os generic methods. Ao invés de setar um parâmetro com determinada Class, podemos setar um parâmetro de Class Generic.

Imagine que voce queira criar um method que imprima 4x uma mensagem. Você teria que criar um method para cada datatype certo?

```java
public abstract class PrintMethods {
    
    //method para printar uma String
    public static void print4Times(String text){
        for(int i = 0; i<4 ;i++){
            System.out.println(text);
        }
    }


    //etc...
}

public class App {
    public static void main(String[] args) {
        PrintMethods.print4Times("a"); //ok
        PrintMethods.print4Times(55); //argumento errado
        PrintMethods.print4Times(66d); //argumento errado
    }
}
```

Olha o trabalhão... Teríamos que criar um method para atender cada tipo de argumento que o usuário passar.

Para resolver esse problema, basta criar 1 único method onde o parâmetro terá uma generic Class.

```java
public static <T> void print4Times(T text){ //Quando chamarmos esse method, vamos passar um objeto de QUALQUER class
    for(int i = 0; i<4 ;i++){
        System.out.println(text);
    }
}


public class App {
    public static void main(String[] args) {
        PrintMethods.print4Times("a"); //ok
        PrintMethods.print4Times(55);  //ok
        PrintMethods.print4Times(66d); //ok
    }
}
```

💡 Sempre precisamos informar, antes do retorno, que o method possui parâmetros generics `<T>`. 

<br>
<br>

### Praticando ✏️

1. Crie um method generic para printar todas as positions/indexes de uma array.

    ```java
    public abstract class PrintMethods {
        
        //print all array positions
        public static <T> void printAll(T[] lista){ //vamos passar como argumento uma array qualquer.
            for(T i : lista){
                System.out.println(i);
            }
        }
    }
    ```

    ```java
        public class App {
        public static void main(String[] args) {
            String[] names = {"Carlos", "Jack", "Jake", "Patricia"};
            Integer[] numbers = {1,50,600,800,63};
            Person[] persons = {
                new Person("Amanda", 44),
                new Person("Rosana", 22),
                new Person("Jose", 70)
            };
            


            PrintMethods.printAll(names);
            PrintMethods.printAll(numbers);
            PrintMethods.printAll(persons);
        }
    }
    ```

<br>
<br>

2. Crie um method generic para retornar a primeira position de uma array. *Aqui, vamos precisar retornar um objeto generic.*

    ```java
    //print the first position of an array
    public static <T> T printFirstIndex(T[] lista){ //perceba que vamos retornar um objeto de qualquer class.
        return lista[0];
    } 
    ```

    ```java
        public class App {
        public static void main(String[] args) {
            String[] names = {"Carlos", "Amanda", "Patrick", "Batman"};
            Integer[] numbers = {4,6,8,9,10};

            System.out.println(PrintMethods.printFirstIndex(names));
            System.out.println(PrintMethods.printFirstIndex(numbers));
        }
    }
    ```

<br>
<br>

3. Crie um method para somar 2 numeros genericos. Nao importa se voce passar Double/Integer/Long/Float, o method sempre vai retornar um Double.

    ```java
    public abstract class PrintMethods {
        //sum 2 numbers
        public static <T extends Number> Double sum(T n1, T n2){
            return n1.doubleValue() + n2.doubleValue(); //esses methods foram herdados da Class pai "Number". Eles transformam um numero generic em Double.
        }
    }
    ```

    ```java
    public class App {
        public static void main(String[] args) {
            Integer n1 = 50;
            Long n2 = 40l;

            System.out.println(PrintMethods.sum(n1, n2)); //perceba que somamos um "Integer" + "Long". Zica né? 
        }
    }
    ```

    <br>
    <br>

    4. Crie um method para somar uma array/varios numeros.

        ```java
        public abstract class PrintMethods {
            //sum 2 numbers --> Usando '...' como array
            @SafeVarargs //annotation para nao dar pau nas varargs '...'
            public static <T extends Number> Double sum(T... numbers){
                Double result = 0d;

                for(T i : numbers){
                    result += i.doubleValue();  
                }
                return result;
            }

            //OU

            //sum 2 numbers --> Usando array[] normal
            public static <T extends Number> Double sum(T[] numbers){
            Double result = 0d;

            for(T i : numbers){
                result += i.doubleValue();  
                }
                return result;
            }
        }
        ```

## Relembrando <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- `generic Class`:
    - Sempre que uma Class tiver um attribute generic, precisamos informar lá em cima na Class.
    - Sempre que instanciarmos essa Class, precisamos informar qual a Class dos generic attributes.

<br>

- `generic method` -->  Sempre que temos um method que possui parâmetros generics, precisamos informar **antes do retorno do method**.




<!-- Next page button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/1.array(vetores)/1.array.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>