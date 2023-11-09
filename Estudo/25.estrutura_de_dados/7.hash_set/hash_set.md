<h1 align="center">
    HashSet
    <img src="https://cdn-icons-png.flaticon.com/512/3535/3535654.png" alt="image icon" width="60px" align="center">
</h1>

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">

- `ArrayList` -> Acessamos os items através das positions/index e permite valores duplicados.
- `HashSet`   -> Não têm index, acessamos os items pelos seus valores, e não permite valores duplicados.

Na estrutura de dados **HashSet**, não temos indexes e não podemos inserir dados duplicados. 

Para remover ou consultar essa estrutura, fazemos isso através dos valores e não das positions/index.

Imagina que você colocou chocolates dentro de um saco. Estão todos em um **conjunto(set)** e não têm uma ordem desses chocolates. Eles estão juntos, mas misturados. Se quisermos retirar tal chocolate, precisamos informar qual é o valor desse chocolate.

<hr>
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">
```java
Set<String> jogadores = new HashSet<>();
jogadores.add("Roberto");
jogadores.add("Camila");
jogadores.add("Patrícia");
jogadores.add("Patrícia"); // Não vai considerar valor duplicado
jogadores.add("Patrícia"); // Não vai considerar valor duplicado

System.out.println(jogadores.toString()); // [Roberto, Camila, Patrícia]
System.out.println(jogadores.size()); // 3
    
//usando o for each para imprimir todos os items. O for normal não dá, pois aqui não temos posicoes.
for(String i : jogadores){
    System.out.println(i);
}
```
:bulb: Primeiro passamos a interface "Set" e depois a class "HashSet".

:warning: Aqui, não temos o method `.get()`. Obviamente porque aqui não temos posicoes/index. Acessamos os items através dos valores.

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/8.hash_map/hash_map.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>