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

- Nome de Class, escrevemos em MAIÚSCULO `Carros.java`

![image](https://qph.cf2.quoracdn.net/main-qimg-c55aa8a9aaecb3c0d472d9bb769af176-lq)

Quando criamos um objeto, estamos "instanciado" uma class em forma de um objeto.

<br>

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="center">

- **Class/Interface/Enum** --> Letras MAIÚSCULAS.
- **object/attributes/methods** --> letras minúsculas.


<hr>
<br>


## Criando uma Class
:pencil2: Crie uma **Class** "Carro" com os seguintes attributes and methods:

```java
//attributes
private String marca = "fiat";
private String modelo = "uno";
private String color = "Black";
private int year = 2020;
private int price = 50000;

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

Como boa prática, sempre deixamos nossos attributes como `private` e encapsulamos com os `getters and setters`.


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
<br>

:pencil2: Crie 2 objetos da class **Cars** e imprima todos os attributes.


:warning: Antes de utilizar uma Class, precisamos importar o package dessa Class. A própria *IDE* nos ajuda, clicando na :bulb:

```java
import main.java.br.com.leekbiel.projeto.classes.Cars;
```

```java
public static void main(String[] args){
    Cars car1 = new Cars();
    Cars car2 = new Cars("Ferrari","f450","red",2022,5000000);

    System.out.println(car1.toString());
    System.out.println("\n\n"+car2.toString());
}  
```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/12.packages/index.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>