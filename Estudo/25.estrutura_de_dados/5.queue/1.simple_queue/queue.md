<h1 align="center">
    Queue (fila)
    <img src="https://cdn-icons-png.flaticon.com/512/5978/5978598.png" alt="image icon" width="60px" align="center">
</h1>

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">

**Queue** é uma estrutura de dados em forma de fila. Representa uma fila do mundo real.

- **FIFO** --> First In First Out

O primeiro a entrar na fila, será o primeiro a ser atendido. O primeiro que entrar na fila do pão, será o primeiro a ser atendido.

- **head** (cabeça) --> começo da fila.
- **tail** (rabo) --> final da fila.


<hr>
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">
Para criar uma estrututra de fila, vamos usar a class **LinkedList();**

```java
Queue<String> filaDoPao = new LinkedList<>();
Queue<Integer> numeroDeAtendimento = new LinkedList<>();
Queue<Pessoa> filaDaPizzaria = new LinkedList<>();
```

:bulb: Como sempre, primeiro passamos a interface, depois a classe que vamos usar.

<hr>
<br>

## Principais methods <img src="https://cdn-icons-png.flaticon.com/512/1774/1774106.png" alt="imagem" width="50px" align="center">

- `.offer()` -> Adiciona um objeto no começo da fila.
- `.poll()` -> Retira o primeiro objeto da fila.
- `.peek()` -> Retorna quem é o primeiro da fila.


<br>
<br>

### Praticando

:pencil2: Crie 4 objetos "Pessoas" e coloque na lista.

```java
Pessoa p1 = new Pessoa("Roberta");

Queue<Pessoa> filaDoPao = new LinkedList<>();

filaDoPao.offer(p1); // Adicionando na fila um objeto "Pessoa" já criado.
filaDoPao.offer(new Pessoa("Carlos")); // Criando um objeto "Pessoa" na hora de adicionar na fila.
filaDoPao.offer(new Pessoa("Patrícia")); // Criando um objeto "Pessoa" na hora de adicionar na fila.

System.out.println(filaDoPao.toString());// Mostrando todos da fila
System.out.println(filaDoPao.peek()); // Roberta é a primeira da fila

filaDoPao.poll(); // removendo/atendendo o primeiro da fila
System.out.println(filaDoPao.peek()); // Carlos é o primeiro da fila
System.out.println(filaDoPao.toString());// Mostrando todos da fila
```

<hr>
<br>

## Removendo todos os objetos da fila com o `while`
Basta criar um `while` loop. Enquanto tiver objetos na fila, vamos remover o primeiro da fila.
```java
Queue<Pessoa> filaDoPao = new LinkedList<>();
filaDoPao.offer(new Pessoa("Camila"));
filaDoPao.offer(new Pessoa("Pedro"));
filaDoPao.offer(new Pessoa("Adolfo"));
filaDoPao.offer(new Pessoa("Carla"));

while(filaDoPao.isEmpty() == false){
    System.out.println(filaDoPao.poll() + " foi removido(a) da fila.");
}
```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/5.queue/2.priority_queue/priority_queue.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>