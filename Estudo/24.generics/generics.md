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
Assim como trabalhamos com generic attributes/variables nas clases, podemos trabalhar com generic attributes nos methods. 

💡 Para trabalharmos com generics variables nos methods, precisamos criá-las antes do retorno do method.`<T>`. 

### ✏️ Praticando: ✏️

#### Task 1

✏️ Crie um method generic para printar todas as positions/indexes de uma array.

<br>

```java
public class InsaneMethods {
    //attributes

    //print all positions
    public static <T> void printAll(T[] insaneList){
        for(T i : insaneList){
            System.out.println(i);
        }
        System.out.println();
    } 
    //criamos a variable generic antes do retorno e depois utilizamos essa variable como parametro.
}

//Main Class
public class App{
    public static void main(String[] args){
       Integer[] list1 = {4,9,8,5,6}; 
       String[] list2 = {"arroz", "batata", "carne", "doce"}; 
       Character[] list3 = {'c','c','&'};
       
       InsaneMethods.printAll(list1);
       InsaneMethods.printAll(list2);
       InsaneMethods.printAll(list3);
    }
}
```

📖 Percebe a vantagem? Ao invés de criarmos vários methods para atender parametros diferentes, criamos apenas 1 method. Isso é generics rapá!


<br>
<hr>

#### Task 2

✏️ Imagine que voce queira criar um method para somar 2 números.

Se você parar pra pensar, você teria que criar 1 method para cada datatype

```java
public class InsaneMethods {
    //attributes

    //sum 2 numbers - Integer
    public static Integer sum(Integer n1, Integer n2){
        return n1 + n2;
    }

    //sum 2 numbers - Float
    public static Float sum(Float n1, Float n2){
        return n1 + n2;
    }

    //sum 2 numbers - Double
    public static Double sum(Double n1, Double n2){
        return n1 + n2;
    }
}


//main class
public class App{
    public static void main(String[] args){
        System.out.println(InsaneMethods.sum(5, 5));
        System.out.println(InsaneMethods.sum(5d, 5d));
        System.out.println(InsaneMethods.sum(5f, 5f)); 
    }
}
```

<br>

Olha o trabalhão... Teríamos que criar um method para atender cada tipo de argumento que o usuário passasse.

Para resolver esse problema, basta trabalharmos com uma variable generica no method.

```java
public class InsaneMethods {
    //attributes

    //sum 2 numbers - generic datatype
    public static <T extends Number> Double sum(T n1, T n2){ //Importante lembrar que não é possível utilizar os operadores aritméticos/matemáticos com classes genéricas. Por isso, retornamos um Double.
        return n1.doubleValue() + n2.doubleValue(); //primeiro transformamos as classes genericas em alguma classe de número. Só depois, conseguimos somar. Esses methods foram herdados da Class pai "Number". Eles transformam um numero generic em Double.
    }
}

//Main Class
public class App{
    public static void main(String[] args){
        
        System.out.println(InsaneMethods.sum(5, 5));
        System.out.println(InsaneMethods.sum(5d, 5d));
        System.out.println(InsaneMethods.sum(5f, 5f));
        System.out.println(InsaneMethods.sum(5l, 5l));
        System.out.println(InsaneMethods.sum(5f, 5d));
        //etc...
    }
}
```

💡 Para trabalharmos com generics variables nos methods, precisamos criá-las antes do retorno do method.`<T>`. 

<br>

📖 Percebeu? Para evitar duplicar methods, simplesmente trabalhamos com methods genericos.

<br>
<hr>

#### Task 3

✏️ Crie um method generic para retornar a primeira position de uma array. *Aqui, vamos precisar retornar um objeto generic.*

```java
public class InsaneMethods {
    //attributes

    //print all positions
    public static <T> T firstPosition(T[] insaneList){
        return insaneList[0];
    }
    
}

//Main Class
public class App{
    public static void main(String[] args){
       Integer[] list1 = {4,9,8,5,6}; 
       String[] list2 = {"arroz", "batata", "carne", "doce"}; 
       Character[] list3 = {'c','c','&'};
       
       System.out.println(InsaneMethods.firstPosition(list1) + "\n");
       System.out.println(InsaneMethods.firstPosition(list2) + "\n");
       System.out.println(InsaneMethods.firstPosition(list3));
    }
}
```


<br>
<hr>

#### Task 4

✏️ Crie um method para somar uma array/varios numeros.

```java
//utilizando varargs ...
@SafeVarargs //annotation para nao dar pau no varargs
public static <T extends Number> Double sum(T... insaneNumbers){ // ... podemos passar qualquer tamamnho de array
    Double result = 0d;
    for(T i : insaneNumbers){
        result += i.doubleValue(); //transformamos o objeto genérico em um double. Só dá pra usar operadores matemáticos com primitive datatypes(double, long, int, float, etc...)
    }
    return result;
} 


//ou


//utilizando arrays simples
public static <T extends Number> Double sum(T[] insaneNumbers){
    Double result = 0d;
    for(T i : insaneNumbers){
        result += i.doubleValue();
    }

    return result;
} 
```
  
📖 Poderíamos fazer da mesma forma com uma `List<T>`.
    
<br>
<br>

## Relembrando <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- `generic Class`:
    - Sempre que uma Class tiver um attribute generic, precisamos informar lá em cima na Class.
    - Sempre que instanciarmos essa Class, precisamos informar qual a Class dos generic attributes.

<br>

- `generic method` -->  Sempre que temos um method que vai trabalhar com uma variable generica, precisamos criar essa variable generica **antes do retorno do method**.


<!-- Next page button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/1.array(vetores)/1.array.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>