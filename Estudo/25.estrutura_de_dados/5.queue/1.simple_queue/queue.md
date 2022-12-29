<!--
queue data structure  - Estrutura de dados em fila

-FIFO -> First In First Out

A estrutura de fila representa uma fila do mundo real. 
Imagine uma fila de padaria. O primeiro a chegar, será o primeiro a ser atendido.



Em uma fila temos:

Head -> Cabeça da fila (começo)
Tail -> Calda da fila  (final)


Principais methods:

.offer() -> Adiciona um elemento ao final da fila
.poll() -> Retira o primeiro elemento da fila
.peek() -> Quem é o primeiro da fila.



Quando uma pessoa entra na fila, ela entra no FINAL(tail) da fila.

No java, não podemos instanciar uma classe Queue. Isso porque, Queue é uma interface e não uma Class.

Para usar a estrutura de fila(queue), eu vou usar uma linked list.

Syntax:
    Queue<String> fila = new LinkedList<>();
    Queue<String> fila = new LinkedList<String>();     Dá no mesmo.

Importe:
    import java.util.LinkedList;
    import java.util.Queue;

"Estou criando uma estrutura de fila, que vai armazenar dados do tipo String, e o nome dessa estrutura vai ser 'fila'. "

Como Queue não é uma Class, e sim uma Interface.... Eu preciso instanciar uma class que implements a Interface Queue.

E a class LinkedList faz isso.

Eu instancio uma LinkedList, que é uma Class.
Sacou??


Sempre que eu quiser criar uma fila, eu vinculo ela com a class LinkedList;

------------------------------------------------------------------------------------------------------------------------------------------
1- Crie uma fila de personagens

    -Crie uma fila
    -Import a interface Queue e a class LinkedList
    -add(); 4 personagens
    -Imprima todos que estao na fila.  -> Use o nome da fila apenas
    -Imprima o total de personagens na fila.
    -Remova o primeiro da fila
    -Imprima o total de personagens na fila.
    -Imprima todos que estao na fila.


        System.out.println("Fila atual: "+fila);
        System.out.println("Total de personagens na fila: "+fila.size());
        System.out.println(fila.poll() + " foi atendido.");
        System.out.println("Total de personagens na fila: "+fila.size());
        System.out.println("Fila atual: "+fila);
------------------------------------------------------------------------------------------------------------------------------------------


-->