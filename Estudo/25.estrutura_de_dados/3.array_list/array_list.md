<h1 align="center">
    ArrayList
    <img src="https://cdn-icons-png.flaticon.com/512/4394/4394574.png" alt="image icon" width="60px" align="center">
</h1>


## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">
Diferente da array normal, aqui podemos manipular nossos objetos. Podemos remove ou adicionar objetos, sem precisar criar outra ArrayList. Na array normal, não é possível.

- `Array` --> Possui um tamanho fixo. Uma vez colocado os objetos, não é possível removê-los ou adicionar mais objetos.
- `ArrayList` --> Possui um tamanho flexível. Podemos adicionar ou remover objetos em qualquer momento.

<hr>
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">
Sempre setamos primeiro a interface e depois a classe que vamos usar.

```java
List<String> colors = new ArrayList<>();
//Interface, datatype da estrutura, nome do objeto , classe que vamos usar
```
:bulb: Usamos primeiro a **interface**. Se quisermos alterar o tipo da estrutura, conseguimos sem problemas:

```java
List<String> colors = new ArrayList<>();
List<String> colors = new LinkedList<>();
```

:warning: Não esqueca de importar o package da classe:
```java
import java.util.List;
import java.util.ArrayList;
```


Quando criamos um objeto ArrayList, conseguimos usar vários methods para manipular os objetos da nossa estrutura.

<hr>
<br>

## Adicionando items na ArrayList - `.add()`
```java
List<String> colors = new ArrayList<>();
colors.add("blue");
colors.add("yellow");
colors.add("purple");
colors.add("red");

System.out.println(colors.toString()); //ou apenas, System.out.println(colors);
System.out.println(colors.size()); // tamanho da array
```

:bulb: Para achar o comprimento de uma lista, vamos usar o `.size()`. Funciona da mesma forma que o `.length()`. 

<hr>
<br>

## Acessando um item da nossa ArrayList `.get()`:
Funciona igualzinho uma array. Aqui, também vamos ter os index/posicoes da array:
```java
List<String> colors = new ArrayList<>();
colors.add("blue");
colors.add("yellow");
colors.add("purple");
colors.add("red");

System.out.println(colors.get(0));
System.out.println(colors.get(1));
System.out.println(colors.get(2));
```

:bulb: Lembrando que a posicao de uma array sempre começa em index `0`.

<hr>
<br>

## Removendo um item da nossa ArrayList `.remove()`;
```java
List<String> colors = new ArrayList<>();
colors.add("blue");
colors.add("yellow");
colors.add("purple");
colors.add("red");

System.out.println(colors.toString()); // "blue","yellow","purple","red";

colors.remove(0); //Passando o index/posicao
colors.remove("yellow"); // passando o objeto

System.out.println(colors.toString());
```

:bulb: Perceba que podemos passar tanto o **index/posicao** quanto o **nome do objeto**.

<hr>
<br>

## Modificando um item/index da lista `.set()`
```java
List<String> names = new ArrayList<>();
names.add("Paulo");
names.add("Camila");
names.add("Debora");

System.out.println(names.toString());

//alterando o valor de um dos items
names.set(1,"goku");

System.out.println(names.toString());
```

<hr>
<br>

## loopando todos os index[] de uma ArrayList com o `for`
Padraozin... Só que aqui na ArrayList sempre usamos o `.size();` ao invés de `.length()`.
```java
List<String> colors = new ArrayList<>();
colors.add("blue");
colors.add("yellow");
colors.add("purple");
colors.add("red");

for(int i = 0; i < colors.size(); i++){
    System.out.println(colors.get(i));
}
```

<hr>
<br>

## loopando todos os index[] de uma ArrayList com o `for each`
Padraozin...

```java
List<String> colors = new ArrayList<>();
colors.add("blue");
colors.add("yellow");
colors.add("purple");
colors.add("red");

for(String i : colors){
    System.err.println(i);
}
/*
Datatype da estrutura, contador representando uma posicao da lista, nome da array
*/
```

<hr>
<br>

## Criando uma arrayList com outros objetos
Uma estrutura ArrayList sempre vai ter o datatype de um objeto. Se for datatype primitive, temos que usar wrapper classes:
- Integer
- Double
- Boolean
- etc...

### Integer
```java
List<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(200);
numbers.add(45);

System.out.println(numbers.toString());
System.out.println(numbers.size());
```
<br>

### Outros objetos
```java
List<Pessoas> lista = new ArrayList<>();
        
lista.add(new Pessoas("Carlos"));
lista.add(new Pessoas("Amanda"));
lista.add(new Pessoas("Roberto"));
```
Etc... Podemos criar uma lista de qualquer tipo de objeto.

<hr>
<br>

## Ordenando uma ArrayList

Basta usarmos a class "Collections"

### String
```java
List<String> names = new ArrayList<>();
names.add("Zidane");
names.add("Paulo");
names.add("Amanda");
names.add("Bruno");

//ordenamos em ordem crescente (A,B,C,etc...)
Collections.sort(names); 

//imprimindo todas os indexes da lista
for(String i : names){
    System.out.println(i);
}
```
<br>

### Integer
```java
 List<Integer> numbers = new ArrayList<>();
numbers.add(50);
numbers.add(100);
numbers.add(90);
numbers.add(33);

//ordenamos em ordem crescente (1,2,3,etc...)
Collections.sort(numbers);

//imprimindo todas os indexes da lista
for(Integer i : numbers){
    System.out.println(i);
}
```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/3.array_list/array_list2d.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>