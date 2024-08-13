<h1 align="center">
    Priority queue (fila de prioridade)
    <img src="https://cdn-icons-png.flaticon.com/512/2137/2137598.png" alt="image icon" width="60px" align="center">
</h1>

*PriorityQueue* é uma estrutura de fila com prioridade. Funciona igualzinho uma fila, mas aqui vamos ter uma preferência do menor para o maior:

- String --> A,B,C,...
- Integer --> 1,2,3,4...

Sempre que removermos com o `.poll()`, vai ser respeitado a ordem do menor primeiro.
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
Queue<String> filaDoPao = new PriorityQueue<>();
```

💡 Primeiro informamor a interface, depois informamos a class que vamos usar.

<br>
<br>

## Estrutura de fila com prioridade -> String

```java
Queue<String> filaDoPao = new PriorityQueue<>();

filaDoPao.offer("Camila");
filaDoPao.offer("Zetsu");
filaDoPao.offer("Amanda");

System.out.println(filaDoPao.poll()); // Ammanda foi atendida e removida da fila
System.out.println(filaDoPao.poll()); // Camila foi atendida e removida da fila
System.out.println(filaDoPao.poll()); // Zetsu foi atendida e removida da fila

// Foi priorizado a ordem alfabetica do menor para o maior. Se fosse number, o menor valor também seria prioridade.

```

<br>

## Estrutura de fila com prioridade -> Integer
```java
Queue<Integer> filaDeNumbers = new PriorityQueue<>();
filaDeNumbers.offer(500);
filaDeNumbers.offer(9);
filaDeNumbers.offer(300);

System.out.println(filaDeNumbers.poll()); // 9 foi atendido/removido
System.out.println(filaDeNumbers.poll()); // 300 foi atendido/removido
System.out.println(filaDeNumbers.poll()); // 500 foi atendido/removido
```

<hr>
<br>


## Estrutura de fila com prioridade --> Objeto com vários attributes
- Beleza, uma estrutura de fila com prioridade do tipo String fica fácil.. Primeiro atendemos "A", depois "B", etc... Ordem alfabética.
  
- Beleza, uma estrutura de fila com prioridade do tipo Integer fica fácil.. Primeiro atendemos 1, depois o 2, depois o 3 , etc... Do menor para o maior.

Mas e se tivéssemos uma **PriorityQueue** de objetos? Um objeto tem vários attributes. Qual seria o attribute usado como prioridade??

Nós precisamos definir. Se não, vai dar uma exception. O próprio java diz para nós  implementarmos a class "Comparable".

<br>

1. Implemente a interface "Comparable" na class dos objetos que estão na fila.

    ```java
    public class Pessoa implements Comparable <Person> // Como essa interface usa generics<>, precisamos informar qual é essa classe genérica. Nesse caso, vamos comparar a class "Person"
    ```

<br>

2. Como implementamos uma interface, precisamos chamar todos os **abstract methods(methods sem corpo)** dessa interface. Essa interface possui apenas 1 abstract method. Sobreescreva o method `.compareTo()`.

    ```java
    //methods implementados da interface "Comparable"
    @Override
    public int compareTo(Person p2) {
        if(this.age > p2.age){
            return -1; //-1 é a maior prioridade
        }
        else if(this.age < p2.age){
            return 1;
        }
        return 0;
    }
    //Nesse caso, as pessoas de MAIOR idade vao ser atendidas primeiro (-1)
    ```

    É dentro desse method que vamos setar qual será o attribute que vamos usar como prioridade na nossa fila. Nesse caso, usamos idade.

    Poderíamos usar o attribute "name" da mesma forma. A prioridade seria ordem alfabetica.

    - `-1` --> Prioridade na fila. Vai ser atendido primeiro.
    - `1` --> Não tem prioridade.
    - `0` --> Prioridade neutra. Será atendido quem chegou primeiro. Padraozin.

Se quiséssemos fazer ao contrário, quem tivesse a menor idade seria atendido primeiro, era só inverter os números ou inverter o operador `>`. Easy! 😎

⚠️ -1 é a prioridade.

<br>
<br>

### Comparando um attribute String
Para comparar o attribute name por exemplo, vamos utilizar o method `compareTo()` da Class String.

```java
@Override
public int compareTo(Person p2) {
    return p2.name.compareTo(this.name); //Ordem alfabetica -> A, B, C...
}

//or


public int compareTo(Person p2) { //Ordem reversa -> Z, Y, X...
    return p2.name.compareTo(this.name);
}
```

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/6.linked_list/linked_list.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>