<h1 align="center">
  Casting (fundição)
  <img src="https://cdn-icons-png.flaticon.com/512/5568/5568571.png" alt="" width="90px" align="center">
</h1>

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">

Casting é quando você faz a alteração de um **primitive datatype to another primitive datatype**

Ex: Mudar de short para int, mudar de int para double, mudar de int para long, etc...


Existem 2 formas de fazer essa conversão:

- automatically -> converting a smaller type to a larger type size
  `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`

    <br>

- manually -> converting a larger type to a smaller size type
  `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

  <br>

  Essa ordem representa quantos bytes eles ocupam da memoria do computador.
    Sendo o `byte` o que ocupa menos, e o `double` o que ocupa mais.


<hr>
<br>

## automatically

Se estamos tentando fazer a conversão de um primitive datatype menor para um maior, a conversão é feita automaticamente.

```java
short number1 = 55;
long number2 = number1;
```


```java
int number1 = 50;
double number2 = number1;
```


Estamos transformando um primitive datatype **menor para um maior**.
A converão é feita automaticamente. Easy!


<hr>
<br>

## manually

Se estamos tentando fazer a conversão de um primitive datatype MAIOR para um menor, precisamos fazer a conversão de forma manual.


Basta castar, usando o `(primitive type)` antes da variable.
```java
int number1 = 50;
short number2 = (short) number1;
```

```java
double number1 = 50.2;
int number2 = (int) number1;

System.out.println(number2);
50  // result
```

<br>

Só pensar assim:

"Dá pra transformar numero inteiro(`int`) em numero decimal(`double`)?"

10 -> 10.0 (sim)

<br>

"Agora... Não dá pra transformar numero decimal para numero inteiro"

10.5 -> X (não)

Aqui, precisamos castar.

10.5 -> 10

<hr>
<br>

## Transformando **String to number** and **number to String**


### String to number

```java
String texto = "55";

Integer number1 = Integer.parseInt(texto);
Double number2 = Double.parseDouble(texto);
Float number3 = Float.parseFloat(texto);
```
<br>
<br>


### number to String

```java
double number1 = 50;
int number2 = 50;

String number3 = String.valueOf(number1);
String number4 = String.valueOf(number2);
```

<br>
<br>


<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/4.3.padrao_inicializacao/padrao_inicializacao.md"><img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right"></a>