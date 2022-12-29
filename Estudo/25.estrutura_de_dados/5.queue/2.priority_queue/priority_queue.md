<h1 align="center">
    Priority queue (fila de prioridade)
    <img src="https://cdn-icons-png.flaticon.com/512/2137/2137598.png" alt="image icon" width="60px" align="center">
</h1>

PriorityQueue é uma estrutura de fila com prioridade. Funciona igualzinho uma fila, mas aqui vamos ter uma preferência do menor par ao maior:

- String --> A,B,C,...
- Integer --> 1,2,3,4...

Sempre que removermos com o `.poll()`, vai ser respeitado a ordem do menor primeiro.
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
Queue<String> filaDoPao = new PriorityQueue<>();
```

:bulb: Primeiro informamor a interface, depois informamos a class que vamos usar.

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
    public class Pessoa implements Comparable<Pessoa> // Perceba que precisamos repetir o nome da class "<Pessoa>"
    ```

<br>

2. Como implementamos uma interface, precisamos chamar todos os **abstract methods** dessa interface. Essa interface possui apenas 1 abstract method. Sobreescreva o method `.compareTo()`.

    ```java
    //methods implementados da interface "Comparable"
    @Override
    public int compareTo(Pessoa o) {
        if(this.age > o.age){ // Se o objeto atual tiver a idade maior, ele terá prioridade
            return -1; // -1 é menor que 0 e 1, portanto vai ter prioridade
        }
        else if(this.age == o.age){
            return 0;
        }
        else{
            return 1;
        }
    }
    ```

    É dentro desse method que vamos setar qual será o attribute que vamos usar como prioridade na nossa fila. Nesse caso, usamos idade.

    Poderíamos usar o attribute "name" da mesma forma. A prioridade seria ordem alfabetica.

    - `-1` --> Menor valor, tem prioridade.
    - `0` --> Prioridade neutra. Será atendido quem chegou primeiro. Padraozin.
    - `1` --> Maior valor, não tem prioridade.

Se quiséssemos fazer ao contrário, quem tiver a menor idade vai ser atendido primeiro, é só inverter os números ou  inverter o operador `>`. Easy! :sunglasses:
<!--




3- Precisamos implementar uma interface chamada "Comparable".
-implements a interface Comparable.
   public class Personagem implements Comparable<Personagem>

Perceba que eu implemento o "Comparable" e digo <O que eu quero comparar>



    @Override
    public int compareTo(Personagem o) {
        
        return 0;
    }

O parâmetro tem que ser da mesma classe. Eu estou comparando.

TEM QUE SEGUIR EXATAMENTE ESSE ORDEM:
se for > retorna -1;
se for < retorna 1;
se for == retorna 0;



5- Vamos escrever o corpo desse method.
    @Override
    public int compareTo(Personagem o) {
        if(this.idade > o.idade){
            return -1;
        }
        else if(this.idade < o.idade){
            return 1;
        }
            return 0;  
    }




Nesse caso, eu estabeleci qual vai ser o atributo que eu vou comparar...
Que vai ser a "idade".
Quem tiver mais idade vai ter prioridade. "-1"

Se eu colocasse ao contrário...
    @Override
    public int compareTo(Personagem o) {
        if(this.idade > o.idade){
            return 1;
        }
        else if(this.idade < o.idade){
            return -1;
        }
            return 0;  
    }

Quem tivesse menos idade ia ter prioridade.



6-Crie uma PriorityQueue no method main;

    Queue<Personagem> filaPersonagem = new PriorityQueue<>();

7- Importe import:
   import java.util.PriorityQueue;
    import java.util.Queue;

8- Use o method .offer() e adicione 4 personagens.
Crie o objeto Personagem dentro do .offer();

        filaPersonagem.offer(new Personagem("Naruto",20));
        filaPersonagem.offer(new Personagem("Boruto",14));
        filaPersonagem.offer(new Personagem("Tsunade",44));
        filaPersonagem.offer(new Personagem("Jiraya",50));

9-Faça o atendimento/retire da fila 1 por 1.
        for(int i=0; i<5 ; i++){
            System.out.println("Pessoas na fila: "+filaPersonagem.size());
            System.out.println(filaPersonagem.poll().nome+" Foi atendido.");
        }

EASY!!!

Sacou?? Voce escolhe a sua prioridade.


-->

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/25.estrutura_de_dados/6.linked_list/linked_list.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>