<h1 align="center">
    Stack (pilha/coisas empilhadas)
    <img src="https://cdn-icons-png.flaticon.com/512/3389/3389081.png" alt="image icon" width="60px" align="center">
</h1>

**Stack** é uma estrutura de dados em formato de pilha (coisas empilhadas).

Nessa estrutura, usamos o sistema **LIFO** --> Last-In First-Out.

O último item que colocarmos na pilha, vai ser o primeiro a ser retirado.

💡 Imagine uma pilha de livros. Se quisermos retirar o livro que está lá em baixo, precisamos **desempilhar** todos os de cima.
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
Stack<String> livros = new Stack<>();
//etc...
```

Estamos criando uma estrutura de pilha, que vai armazenar objetos do tipo String.

<hr>
<br>

## Principais methods

- `push()`    ->  Coloca um elemento na pilha
- `pop()`     ->  Remove um elemento da pilha.
- `peek()`    ->  Verifica qual o elemento que tá no topo da pilha.
- `isFull()`  ->  Check if stack is full.
- `isEmpty()` ->  Check if stack is empty.

```java
Stack<String> livros = new Stack<>();

//adicionando items na pilha
livros.push("Harry Potter");
livros.push("E não sobrou nenhum!");
livros.push("Eragon");
livros.push("Cemitério");

//imprimindo todos os items
System.out.println(livros.toString());

//quem está no topo?
System.out.println(livros.peek()); //Cemitério

//a pilha está vazia?
System.out.println(livros.isEmpty()); // false

//desempilhando 1 livro
livros.pop(); // Removendo quem está no topo - "Cemitério"

//quem está no topo?
System.out.println(livros.peek()); //Eragon

System.out.println(); // pulando uma linha

//percorrendo todos os items da pilha com o for
for(int i = 0; i<livros.size(); i++){
    System.out.println(livros.get(i));
}

//percorrendo todos os items da pilha com o for each
for(String i : livros){
    System.out.println(i);
}
```

💡 Lembrando que nós podemos usar todos os outros methods da interface `List` (`.contains();`, `.get();`, etc...). Isso, porque a class "Stack" `extends` a class "Vector", e a class "Vector" `implements` a interface "List".

<hr>
<br>

## Criando uma estrutura de stack(pilha) na mão

*Use apenas quando for pedido. Vamos usar a pilha que o Java faz mesmo!*
 
Para ver a classe "PilhaBolada" criada na mão, clique [aqui](https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/4.stack/PilhaBolada.java) .


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/5.queue/1.simple_queue/queue.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>
