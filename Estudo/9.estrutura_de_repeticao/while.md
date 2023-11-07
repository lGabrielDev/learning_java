<h1 align="center">
    Loops
    <img src="https://cdn-icons-png.flaticon.com/512/510/510884.png" alt="image icon" width="90px" align="center">
</h1>

A estrutura de repetição (loops) são usados para repetir um bloco de código.


- [`while`](#while)
- [`do while`](#do-while)
- [`for`](#for)
- [`for each`](#for-each)

<hr>
<br>

## while
Enquanto a condição for true, o bloco de código vai se repetir. Quando a condição der false, o loop encerra.

### Syntax: <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="20px" align="center">
```java
while(condition){
    // code block to be executed;
}
```
<br>

### Exercício 1
:pencil2: Imprima uma mensagem 4 vezes, utilizando o `while` loop.

```java
public static void main(String[] args){
        Integer i = 0;
        do{
            i++;
            System.out.println("Salve gurizada!");
        }
        while(i < 4);
    }
```

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="left">

Como boa prática, damos o nome ao contador de `i`. Sempre que loopar, o contador vai receber **+1**.

<br>

:pencil2: Faça a mesma coisa, utilizando o `for` loop.

```java
for(int i=0; i<4; i++){
    System.out.println("Salve gurizada!");
}
```
<hr>
<br>

## do while
Funciona bem parecido com o `while`. 

Porém aqui, mesmo se a condicao for false, o bloco de código vai ser executado pelo menos 1 vez.

> "Faça tal coisa... Se a condicao for true, faça denovo..." - lGabrielDev


Imagina um programa de um jogo. O jogo precisa rodar pelo menos uma vez. Se o usuário quiser jogar novamente, o loop acontece.

<br>

### Syntax: <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="20px" align="center">

```java
do {
    // code block to be executed
}
while (condition);
```
<br>


<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="left">

Sempre que estiver trabalhando com loops, crie variables booleanas.

<br>
<hr>
<br>

## for
No `for` loop, criamos o contador `i` direto na condition.

### Syntax: <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="20px" align="center">
```java
for(int i=0; i<5 ; i++){
    //block of code to be executed
}
```

<br>
<br>

### Exercício 1
:pencil2: Imprima na tela os números:
- 1,2,3...50;

```java
for(int i = 0; i<50; i++){
    System.out.println(i+1);
}
```

<br>

- 50,49,48 ...1;

```java
for(int i = 50; i>0; i--){
    System.out.println(i);
}
```

<hr>
<br>

## for each
Funciona igual o `for`, mas aqui escrevemos de uma forma mais simples. Geralmente usamos para percorrer arrays/arraylists.


### Exercício 1
:pencil2:Crie uma array do tipo String, adicione 3 nomes de animais e imprima todas as positions.

```java
String[] animals = {"leão","tigre","Rato"};

for(String i : animals){
    System.out.println(i);
}
//String --> informamos o datatype dessa array/lista. 
// i --> Criamos uma variable/objeto correspondendo a cada posicao dessa array/list
// animals --> Informamos qual é a array/list
```

Perceba que esse contador `i` é a posicao da minha array.

- i --> animals[0];
- i --> animals[1];
- i --> animals[2]; etc...

<br>

### Exercício 2
:pencil2: Faça o mesmo exercício acima, mas com uma arraylist:

```java
List<String> animals = new ArrayList<>();
animals.add("leao");
animals.add("tigre");
animals.add("rato");

for(String i : animals){
    System.out.println(i);
}
```

<hr>
<br>

## nested loops (loop aninhado)
Nested loop é um loop dentro de outro loop.

É um `for` dentro de outro.

Quando estamos trabalhando com um loop dentro de outro, precisamos dar nomes diferentes aos contadores. O contador do primeiro loop chamamos de `i`, e o contador do segundo loop chamamos de `j`.

- O primeiro contador --> `i`
- O segundo contador --> `j`

<br>

### Exercício 1
:pencil2: Imprima o exemplo abaixo, utilizando o loop aninhado:
```txt
week1
    day 1
    day 2
    day 3
Week2
    day 1
    day 2
    day 3
Week3
    day 1
    day 2
    day 3
Week4
    day 1
    day 2
    day 3
```

```java
public static void main(String[] args){
        Integer week = 4;
        Integer days = 3;

        for(int i=0; i<week; i++){
            System.out.println("Week "+(i+1));
            for(int j=0; j<days; j++){
                System.out.println("\tday "+(j+1));
            }
        }
    }  
```
Como nosso contador começa em **0**, tivemos que somar mais **1**.

<br>

### Exercício 2
:pencil2: Faça um programa que vai imprimir um character. O usuário vai decidir:

- Qual o character
- Quantas colunas
- Quantas linhas

    ```bash
    dale    dale    dale    dale    dale    dale    dale    dale    dale    dale
    dale    dale    dale    dale    dale    dale    dale    dale    dale    dale
    dale    dale    dale    dale    dale    dale    dale    dale    dale    dale
    ```

    ```java
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //input do usuário
        System.out.print("Character: ");
        String character = scan.next();

        System.out.print("Columns: ");
        Integer columns = scan.nextInt();

        System.out.print("Rows: ");
        Integer rows = scan.nextInt();

        scan.close();

        for(int i = 0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(character + "  ");
            }
            System.out.println("");
        }
    } 
    ```

    ✏️ Trate os erros de input com o: 
    ```java
    do{
        try{

        }
        catch(){

        }
    }
    while();
    ```

<hr>
<br>

## Relembrando <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- `while` or `do while` --> usado quando não temos um número específico de vezes que queremos loopar;

- `for` --> usado quando temos um número de vezes definido;


Imagine um programa onde se o usuario errar o login, vai aparecer uma mensagem de erro pra ele. Um usuário pode errar várias vezes... Entao, vou usar o `while` or `do while`.

Se queremos apenas 3 tentativas de login, vamos usar o `for`.


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/11.oop/oop.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>