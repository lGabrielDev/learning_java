<h1 align="center">
    Polymorphism
    <img src="https://static.vecteezy.com/system/resources/previews/009/336/632/original/cartoon-colorful-chameleon-element-png.png" alt="image icon" width="90px" align="center">
</h1>

## Pilares da POO <img src="https://cdn-icons-png.flaticon.com/512/2058/2058008.png" alt="image icon" width="32px" align="center">

- Encapsulation
- Inheritance(Herança)
- Abstraction
- **Polymorphism**

<hr>
<br>

## Polymorphism
Polymorphism significa "many forms" (várias formas). Um method pode ter várias formas. Existem dois tipos de polimorfismo:

- `@Override `(Sobrepor) --> Podemos sobreescrever um method da superClass na classe filha.
  
<br>

- `Overload` (Sobrecarga) --> Podemos criar methods com nomes iguais, desde que eles tenham parâmetros diferentes. Igual quando criamos vários constructors (quantidade de parametros diferentes ou tipo dos parametros diferente).

<hr>
<br>

## @Override - Sobrepor o method do pai

1. Crie uma class "Animal" com apenas 1 method.

    ```java
        public class Animal {
        //attributes
        
        //methods
        public String barulhoDeAnimal(){
            return "Barulho de animal padraozin...";
        };
    }
    ```
    Vamos criar classes filhas que vão herdar esse method. Porém, esse method será diferente em cada class filha.

<br>

2. Crie 3 classes filhas, que vão herdar da class pai "Animal", e sobreponha o method `barulhoAnimal();`
    
    ### Class Dog
    ```java
    public class Dog extends Animal{
        //attributes
        
        //Override methods
        @Override
        public String barulhoDeAnimal() {
            return "Au AU AU! I'm a dog!";
        }
    }
    ```

    💡 Como boa prática, sempre é bom colocar o `@Override` para identificar que aquele method está sendo SOBREESCRITO. Ou seja, é um method da class pai.
    
    <br>

    ### Class Cat
    ```java
    public class Cat extends Animal{
        //attributes

        //Override methods
        @Override
        public String barulhoDeAnimal() {
            return "Meow... I'm a cat!";
        }  
    }
    ```
    <br>

    ### Class Pig
    ```java
    public class Pig extends Animal{
        //attributes

        //methods
        @Override
        public String barulhoDeAnimal() {
            return "fon fon...I'm a pig!";
        }
    }
    ```
    <br>

    💡 A própria IDE te ajuda a implementar os `@Override` methods :bulb:

    <br>
    <br>

 3. Crie um objeto de cada class, inclusive da superClass "Animal", e imprima os methods. O method vai fazer uma coisa diferente em cada objeto. Isso é polimorfismo rapá!

    ```java
    public class Programa{
        public static void main(String[] args){
            Animal a1 = new Animal();
            Dog d1 = new Dog();
            Cat c1 = new Cat();
            Pig p1 = new Pig();

            System.out.println(a1.barulhoDeAnimal());
            System.out.println(d1.barulhoDeAnimal());
            System.out.println(c1.barulhoDeAnimal());
            System.out.println(p1.barulhoDeAnimal());
        }
    }
    ```
    💡 Se quiséssemos que o method fizesse a mesma coisa do pai, era só não sobrepor o method e aproveitar a herança.

<hr>
<br>


## Overload - Escrevendo methods com nomes iguais
Podemos ter methods com nomes iguais,  desde que eles tenham parâmetros diferentes.

Como vimos antes, na criação dos constructors, podemos ter o mesmo method com nomes iguais. Basta que esses methods tenham uma quantidade de parâmetros diferente ou tenham tipos de parâmetros diferente.


<br>

1. Crie uma class "Cachorro" com 3 methods com o mesmo nome:

    ```java
    public class Cachorro {
        //attributes

        //methods
        public String mensagem(){
            return String.format("Olá, sou um cachorro.");
        }

        public String mensagem(String name){
            return String.format("Olá, sou o cachorro %s.",name);
        }

        public String mensagem(String name, Integer age){
            return String.format("Olá, sou o cachorro %s e tenho %d anos de idade.",name,age);
        }

        public String mensagem(String name, Integer age, String color){
            return String.format("Olá, sou o cachorro %s, tenho %d anos de idade e minha cor é %s.",name,age,color);
        }
    }
    ```

<br>

2. Crie um objeto do tipo "Cachorro" e chame o method, passando parâmetros diferentes.

    ```java
        public class Programa{
        public static void main(String[] args) {
            Cachorro c1 = new Cachorro();

            System.out.println(c1.mensagem());
            System.out.println(c1.mensagem("Jake"));
            System.out.println(c1.mensagem("Jake",4));
            System.out.println(c1.mensagem("Jake",4,"Grey"));
        }
    }
    ```
    Funciona igualzin o constructor method. Podemos criar vários, desde que eles tenham parâmetros diferentes.

<br>
<hr>

## Criando uma array para armazenar objetos diferentes.
Imagine que temos objetos das classes "Moto", "Carro", "Bike", e queremos armazenar esses objetos em uma array. Como são objetos diferentes não vai dar certo. Uma array pode armazenar apenas 1 tipo de objeto.

Para fazer isso, esses objetos têm que ter uma classe pai em comum. Vamos criar a class "Veiculos". 

- Se criarmos uma array do tipo "Moto" só vamos conseguir armazenar objetos "Moto"...
- Se criarmos uma array do tipo "Carro" só vamos conseguir armazenar objetos "Carro"...
- Se criarmos uma array do tipo "Bike" só vamos conseguir armazenar objetos "Bike"...

Agora, se criarmos uma array "Veicúlos", vamos conseguir armazenar as classes filhas de boas.

<br>

1. Crie a class "Veiculos"

    ```java
        public class Veiculos {
        //attributes
        
        //methods
        public String acelerar(){
            return "Veicúlo acelerando...";
        }
    }
    ```

<br>

2. Crie as classes filhas

    ### Class Carro

    ```java
    public class Carro extends Veiculos{
        //attributes
    
        //@Override methods
        @Override
        public String acelerar() {
            return "Vrumm... Carro acelerando!";
        }
    } 
    ```
    <br>

    ### Class Moto
    ```java
    public class Moto extends Veiculos{
        //attributes
    
        //@Override methods
        @Override
        public String acelerar() {
            return "Ratata!! Cortando de giro!!";
        }
    }
    ```

    <br>

    ### Class Bike

    ```java
    public class Bike extends Veiculos{
    //attributes

        //@Override methods
        @Override
        public String acelerar() {
            return "Pedalando sem parar!";
        }
    }
    ```

<br>

3. Crie um objeto de cada Class, e depois crie uma array para armazenar esses objetos.

    ```java
    public class Programa{
        public static void main(String[] args) {
            Carro c1 = new Carro();
            Moto m1 = new Moto();
            Bike b1 = new Bike();

            Veiculos[] listaDeVeiculos = {c1,m1,b1}; // Se ligou???

            for(Veiculos i : listaDeVeiculos){
                System.out.println(i.acelerar());
            }
        }
    }
    ```

    - "Carro" é um "Veículo", por isso conseguimos armazenar na array.
    - "Moto" é um "Veículo", por isso conseguimos armazenar na array.
    - "Bike" é um "Veículo", por isso conseguimos armazenar na array.

📖 Imagine as possibilidades?? Podemos criar listas/arrays com objetos "diferentes". Claro, desde que eles herdem do mesmo pai.

<hr>
<br>

## Declarando a classe pai e atribuindo a classe filha
Podemos criar um objeto filho através do objeto pai.

```java
public class Programa{
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Bike b1 = new Bike();


        Veiculos c2 = new Carro();
        Veiculos m2 = new Moto();
        Veiculos b2 = new Bike();
    }
}
```

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/20.equals/equals.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>