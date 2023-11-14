<h1 align="center">
    ArrayList 2d
    <img src="https://cdn-icons-png.flaticon.com/512/4394/4394574.png" alt="image icon" width="60px" align="center">
    <img src="https://cdn-icons-png.flaticon.com/512/4394/4394574.png" alt="image icon" width="60px" align="center">
</h1>


Aqui, vamos ter uma estrutura que armazena listas. Vamos ter uma lista de listas.

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
List<List<String>> listaBolada = new ArrayList<>();
//Estamos criando uma lista, que vai armazenar listas do tipo String.

List<List<Integer>> listaDeNumbers = new ArrayList<>();
//Estamos criando uma lista, que vai armazenar listas do tipo Integer.

//etc...
```

<br>
<br>

✏️ Praticando :pencil2:

1. Crie 3 listas do tipo String.
   ```java
    //primeira lista
    List<String> comidas = new ArrayList<>();
    comidas.add("Pizza");
    comidas.add("Pastel");
    comidas.add("Hamburger");

    //segunda lista
    List<String> pessoas = new ArrayList<>();
    pessoas.add("Amanda");
    pessoas.add("Débora");
    pessoas.add("Alexandre");

    //terceira lista
    List<String> jogos = new ArrayList<>();
    jogos.add("FIFA");
    jogos.add("CS GO");
    jogos.add("League of Legends");
   ```

<br>

2. Agora, vamos criar uma estrutura para armazenar essas listas:

    ```java
    //"armário" para armazenar essas listas
    List<List<String>> armárioDeListas = new ArrayList<>();
    armárioDeListas.add(comidas);
    armárioDeListas.add(pessoas);
    armárioDeListas.add(jogos);
    //Essa estrutura de listas, vai armazenar listas do tipo String
    ```


<br>

1. Imprima alguns items de cada lista:

    ```java
    //imprimindo cada item de cada lista
    System.out.println(armárioDeListas.get(0).get(1)); // Pastel
    System.out.println(armárioDeListas.get(1).get(1)); // Débora
    System.out.println(armárioDeListas.get(2).get(1)); // CS GO
    ```
    Primeiro acessamos a lista que queremos, depois o item/index dessa lista.


<hr>
<br>

## Percorrendo todas os items das listas com o `for`
Funciona igualzinho a uma array 2d. Easy!

```java
//Percorremos cada lista
for(int i = 0; i<armárioDeListas.size(); i++){
    System.out.println("Lista " + (i+1));
    //percorrendo cada item da lista
    for(int j = 0; j<armárioDeListas.get(i).size(); j++){
        System.out.println(armárioDeListas.get(i).get(j));
    }
    System.out.println();
}
```

<br>
<br>

## Percorrendo todas os items das listas com o `for each`
```java
//Lopando todos os items de cada lista
for(List<String> i : armárioDeListas){
    System.out.println(i.toString());
}
```
<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/4.stack/stack.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>