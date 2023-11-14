<h1 align="center">
    HashMap
    <img src="https://cdn-icons-png.flaticon.com/512/3540/3540804.png" alt="image icon" width="60px" align="center">
</h1>


Como vimos antes, em uma ArrayList acessamos os items através do  index/position.

Aqui na estrutura **HashMap**, acessamos os items através da **key/value**. Ou seja, cada item da estrutura vai receber dois objetos:

- `key` --> identificacao desse item
- `value` --> valor desse item


⚠️ Cuidado ao adicionar items com keys iguais. Se tiverem values diferentes, vai permanecer o último inserido.

<hr>
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
Map<Integer,String> listaDePessoas = new HashMap<>();
```
Perceba que cada item vai ter dois objetos:

- `Key` --> Chave única de identificação. Não é permitido chaves duplicadas.
- `Value` --> Valor dessa chave.

💡 Bem parecido com a primary key do Postgres.

<hr>
<br>

## Adicionando items na estrutura
Para adicionar items, vamos usar o method `.put()`.

✏️ Crie uma estrutura que vai armazenar objetos "Pessoa"
```java
Map<Integer,Pessoa> lista = new HashMap<>();
lista.put(1, new Pessoa("Pedro"));
lista.put(2, new Pessoa("Amanda"));
lista.put(3, new Pessoa("Camila"));
lista.put(4, new Pessoa("Rodolfo"));
// Primeiro passamos a key, depois o value(objeto).
```
<hr>
<br>

## Acessando um item `.get()`
Sempre vamos acessar um item **através da key**.

```java
Map<Integer,Pessoa> lista = new HashMap<>();
lista.put(1, new Pessoa("Pedro"));
lista.put(2, new Pessoa("Amanda"));
lista.put(3, new Pessoa("Camila"));
lista.put(4, new Pessoa("Rodolfo"));

System.out.println(lista.get(2)); // Amanda
System.out.println(lista.get(4)); // Rodolfo
```

<hr>
<br>

## Removendo um item
Aqui também, vamos remover **através da key**.
```java
Map<Integer,Pessoa> lista = new HashMap<>();
lista.put(1, new Pessoa("Pedro"));
lista.put(2, new Pessoa("Amanda"));
lista.put(3, new Pessoa("Camila"));
lista.put(4, new Pessoa("Rodolfo"));

lista.remove(2);
System.out.println(lista.toString());
System.out.println(lista.size()); // 3
```

<hr>
<br>

## Loopando todos os items com o `for each`
Na estrutura **HashMap**, podemos mostrar **todas as keys** ou **todos os values**.

Vamos usar os methods
- `.keySet()` --> keys
- `.values()` --> values

### Mostrando todas as keys
```java
for(Integer i : lista.keySet()){ // Perceba que passamos o datatytpe do primeiro objeto do item (key)
    System.out.println(i);
}

// ou
System.out.println(lista.keySet());
```

<br>


### Mostrando todos os values
```java
for(Pessoa i : lista.values()){ // Perceba que passamos o datatytpe do segundo objeto do item (value)
    System.out.println(i);
}

//ou

System.out.println(lista.values());
```

<br>

### Mostrando as key e os values, juntos

```java
System.out.println(lista.toString()); //padraozin, OU

for(Long i : lista.keySet()){
    System.out.println(String.format("%d --> %s", i ,lista.get(i))); //Acessamos cada key e depois acessamos o value dessa key
}
```

⚠️ Não dá para usar o `for` normal, obviamente, porque aqui não tem positions/index.

Existem vários outros methods, mas não é necessário usar agora. Quando precisarmos, usaremos.


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/BLABLABLA">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>