<h1 align="center">
    Object-Oriented Programming 
    <img src="https://cdn-icons-png.flaticon.com/512/4248/4248159.png" alt="image icon" width="90px" align="center"> <br>
    (Programação orientado a objetos)
</h1>

Java é uma linguagem orientada a objetos. Aos olhos do java, tudo pode ser considerado um objeto.

Todo objeto contêm:
- **attributes** --> Características de um objeto.
- **methods** --> Ações que esse objeto pode fazer.

Esses objetos são criados a partir de uma class. Um objeto é uma instância de uma class.

<hr>
<br>

## Class <img  src="https://cdn-icons-png.flaticon.com/512/7627/7627943.png" alt="blueprint icon" width="30px" align="center">
- é o molde que cria os objetos.
  
- é a Blueprint dos objetos
  
- Define os attributes and methods que os objetos dessa class terão.

- Uma Class nada mais é do que um arquivo `.java`. Então, o nome da Class terá o mesmo nome do arquivo `.java`

- Nome de Class escrevemos em MAIÚSCULO `Carros.java`

![image](https://qph.cf2.quoracdn.net/main-qimg-c55aa8a9aaecb3c0d472d9bb769af176-lq)

Quando criamos um objeto, estamos "instanciado" uma class em forma de um objeto.

<br>

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="center">

- **Class/Interface/Enum** --> Letras MAIÚSCULAS.
- **object/attributes/methods** --> letras minúsculas.


<hr>
<br>


## Criando uma Class
✏️ Crie uma **Class** "Carro" com os seguintes attributes and methods:

```java
//attributes
private String marca = "fiat";
private String modelo = "uno";
private String color = "Black";
private Integer year = 2020;
private Double price = 55.000d;

//constructors
...

//getters and setters
...

//methods
public static void acelerar(){
    sysout("Voce está dirigindo o carro");
}

public static void frear(){
    sysout("Voce freiou o carro");
}
```

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="left">

Como boa prática, sempre deixamos nossos attributes como `private` e os encapsulamos com os `getters and setters`.


Beleza, criamos nossa Class. Vamos criar nossos objetos.

<hr>
<br>

## Criando um objeto
Vamos criar um objeto do tipo **Carro**

Sempre que vamos criar um objeto, vamos criar na Class onde se encontra o `main method`.

### Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="25px" align="center">

```java
ClassName objeto = new ClassName();
```

- `ClassName objeto` --> Estamos declarando um objeto da class tal.

- `new` --> Estamos instanciando o objeto. Quando escrevemos `new`, o computador reserva um espaço na memória ram para esse objeto.

- `ClassName()` --> Estamos chamando o method constructor.

<br>

📖 Sempre que criamos um objeto, é chamado o method constructor.


<br>

✏️ Crie 2 objetos da class **Cars** e imprima todos os attributes.


⚠️ Antes de utilizar uma Class, precisamos importar o package dessa Class. A própria *IDE* nos ajuda, clicando na 💡

```java
import main.java.br.com.leekbiel.projeto.classes.Cars;
```

```java
public class App{
    public static void main(String[] args){

        //car 1 --> Preenchendo os attributes pelos methods 'setters()'
        Car c1 = new Car();
            c1.setMarca("FIAT");
            c1.setModelo("UNO");
            c1.setColor("RED");
            c1.setYear(2018);
            c1.setPrice(70000d);


        //car 2 --> Preenchendo os attributes direto no constructor()
        Car c2 = new Car(
            "chevrolet",
            "b45",
            "Grey",
            2022,
            140000d
        );


        System.out.println(" **** Carros comprados: ****");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
```

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/12.packages/index.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>