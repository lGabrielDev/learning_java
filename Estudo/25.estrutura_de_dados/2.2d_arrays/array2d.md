<h1 align="center">
    Array 2d
    <img src="https://cdn-icons-png.flaticon.com/512/5519/5519708.png" alt="image icon" width="60px" align="center">
    <img src="https://cdn-icons-png.flaticon.com/512/5519/5519708.png" alt="image icon" width="60px" align="center">
</h1>

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">

**2d Array** ou **Multidimensional Arrays** são arrays dentro de uma array.

Funciona igualzinho uma array, normal. Mas aqui, vamos ter `[] []`.

- O primeiro `[]` representa uma array
- O segundo `[]` representa a posicao dessa array

Primeiro vamos informar quantas arrays vai ter na estrutura, e depois informamos a quantidade de posicoes(index) de cada array.

Igual uma array simples, podemos criar uma array 2d de 2 formas:

<br>

## Formas de criar uma array 2d

### Definindo o comprimento dentro do `[][]` e depois attribuindo os valores
Primeiro dizemos quantas arrays vao ser, e depois passamos quantas posicoes(indexes) vao ter essas arrays.

```java
String[][] names = new String[3][2]; // temos 3 arrays, cada uma contendo 2 positions/indexes

names[0][0] = "Marcelo"; // Acessamos a primeira array, 0 , na posicao 0.
names[0][1] = "Paulo";

names[1][0] = "Patrícia"; // Acessamos a array 1, na posicao 0.
names[1][1] = "Amanda";

names[2][0] = "Rodrigo"; // Acessamos a array 2, na posicao 0.
names[2][1] = "Kleber";

System.out.println(Arrays.deepToString(names));
```

:bulb: Para imprimir todas as posições de uma 2d array, usamos o method `Arrays.deepToString();` da class "Arrays". igualzin quando queremos mostrar todos os attributes de um objeto. Só que aqui, queremos mostrar todas as arrays e todas as posicoes de cada array.

Essa class "Arrays" têm vários methods interessantes. Ordenar, preencher, etc...

<br>
<br>

### Definindo os valores diretamente `{ {}, {} , {} }`:
Igualzin na array normal, podemos setar os valores diretamente:

```java
String[][] names = {
    {"Paloma","Kleber","Adalberto"}, // possui 3 posicoes/index
    {"João","Amanda"}, // possui 2 posicoes/index
    {"Paulo"} // possui apenas 1 posicao/index
};

System.out.println(Arrays.deepToString(names));
```

:bulb:O legal de fazer desse jeito, é que podemos ter um número diferente de positions/indexes para cada array.

<hr>
<br>

## Acessando um index(position) de uma array 2d
Basta dizer qual é array `[]` e depois informar a posicao que voce quer `[]` ... Easy!

```java
String[][] names = {
    {"Paloma","André"},
    {"Roberta","Carlos"},
    {"Rodrigo"}
};

System.out.println(names[0][1]); // André
System.out.println(names[1][0]); // Roberta
System.out.println(names[2][0]); // Rodrigo
```

:warning: Uma array sempre começa com index `0`.


Quando criamos uma array, é como se tivessemos criado um armário com 5 gavetas. Podemos colocar um valor em cada gaveta.

- Se criamos uma array para armazenar objetos Integer, só vai dar para colocar Integers.

- Se criamos uma array para armazenar objetos String, só vai dar para colocar String.

- Se criamos uma array para armazenar objetos "Carro", só vai dar para colocar "Carro".

<hr>
<br>

### loopando todos os index[] de uma array 2d com o `for`
Basta usarmos o tamanho da array ,`.length`, como condição no for

- No loop de fora , `i`, percorremos todas as arrays
- No loop de dentro, `j`, percorremos cada posicao da array

```java
public class Programa{
    public static void main(String[] args){
        String[][] names = {
            {"Paloma","André"},
            {"Roberta","Carlos"},
            {"Rodrigo"}
        };
        
        //percorrendo todas as arrays
        for(int i = 0; i<names.length; i++){
            System.out.println("Array "+ (i+1) + ":");
            //percorrendo todas as positions de cada array
            for(int j = 0; j<names[i].length; j++){
                System.out.println(names[i][j]);
            }
        }
    }   
}
```


:bulb: Como boas práticas, usamos o `i` para o primeiro loop, e o `j` para o segundo loop.

- names.length -> quantas arrays tem.
- names[0].length -> quantas posicoes tem na array 0.
- names[1].length -> quantas posicoes tem na array 1.


<br>

:warning: Não dá para loopar array 2d com o `for each`. Use o `for` padraozin mesmo.


<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/3.array_list/array_list.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>