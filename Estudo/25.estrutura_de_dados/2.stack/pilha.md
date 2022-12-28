<!--
Stack Data Structure - Estrutura de dados em forma de pilha

-LIFO -> Last-In First-Out
O último livro que eu colocar, é o primeiro livro a retirar;

Imagina uma pilha de livros, um em cima do outro.
Se eu coloco mais um livro no top dessa pilha, eu estou "empilhando".
Se eu retiro um livro do top dessa pilha, eu estou "desempilhando".
Se eu quiser remover o livro la de baixo, eu preciso antes remover todos os de cima.
Veja a imagem "pilha.png"  

methods fundamentais da Stack(Pilha):

push()    ->  Coloca um elemento na pilha
pop()     ->  Remove um elemento na pilha.
peek()    ->  Verifica qual o elemento que tá no topo da pilha
isFull()  ->  Check if stack is full.
isEmpty() ->  Check if stack is empty.



Sytnax:

    Stack<String> jogos = new Stack<String>();

"Estou criando uma estrutura 'Stack' que pode armazenar dados do tipo <String>, e o nome do objeto Stack é 'jogos' ".



----------------------------------------------------------------------------------------------------------------------------------------
Criando uma estrutura Stack com vetor simples.

Criando uma estrutura de pilha(Stack) com ajuda do package java.util fica fácil.
Mas, e se precisássemos criar um vetor de pilha em outras linguagens??

Vamos aprender a fazer no BRAÇO!!

1-Crie uma Class "Pilha" onde vamos criar todos esses methods no braço.


push()    ->  Coloca um elemento na pilha
pop()     ->  Remove um elemento na pilha.
peek()    ->  Verifica qual o elemento está no topo da pilha
isFull()  ->  Check if stack is full.
isEmpty() ->  Check if stack is empty.


2-Crie 2 atributos:

    public class Pilha {
        //attributes
        String[] personagens;
        Integer top;
    }

O primeiro atributo corresponde a minha pilha de personagens.
O segundo atributo corresponde a posicao atual do topo.

Se a posicao 0 é a primeira posicao da pilha de personagens, a posicao -1 é a posicao da pilha vazia.



3-Crie um constructor para setar os valores dos atributos:

    public Pilha(){
        personagens = new String[10];
        top = -1;
    }   


Aqui temos um vetor de index[10]. Ou seja, uma array de 10 posicoes.
Como não coloquei nenhum personagem na minha pilha, a posicao atual do topo é -1. Sacou??


Agora já podemos saber se a pilha está vazia ou não.

4-Crie o method isEmpty();

    public boolean isEmpty(){
        return (top == -1);
    }

    Se a posicao do topo for -1, quer dizer que minha stack(pilha) está vazia.





5- Crie o method isFull();

    public boolean isFull(){
            return (top == 9);
        }

    Perceba que minha stack tem 10 posicoes (0,1,2,3,4,5,6,7,8,9);
    O raciocínio é...quantidade de posicoes da pilha - 1, pois o 0 conta. Sacou??

    Eu poderia escrever assim:

    public boolean isFull(){
        return (top == personagens.length - 1);
    }
    
    O raciocinio é o mesmo. Se o top (posica atual do topo) tiver o valor 9, quer dizer que a pilha está cheia.





6- Crie o method push();
    public void push(String nome){
        top++;
        personagens[top] = nome; 
    }

Assim que eu uso o method push, a posicao atual(top) q era -1 passa a ser 0.
E minha pilha na posicao atual (0) recebe o parametro(nome do personagem).

Se eu usar denovo...
A posicao atual(top) q era 0 passa a ser 1.
E minha pilha na posicao atual (1) recebe o parametro(nome do personagem).
Sacou??


7-Crie o method pop();
    public String pop(){
        String p;
        p = personagens[top];
        top--;
        return p;
    }

Com o pop , queremos saber quem eu removi, e em qual posicao o atual(top) estamos.

.Crio uma variable que vai receber o valor da posicao atual.
.retornar a variavel (valor da minha posicao atual).
.Posicao atual(top) vai descer 1 posicao.

.Imagine que sua pilha tem 2 posicoes preenchidas. 
Se eu usar o pop, a posicao atual passa a ser 0.
.Se eu der um sysout nesse method pop(); vai aparecer na tela o valor da .posicao que eu removi. Sacou??


8- Crie o method peek(posicao atual do topo)

    public String peek(){
        return nomes[top];
    }

Eu retorno o valor da posicao atual.



-Crie um objeto no method main e teste cada um dos methods.


Vamos melhorar nossos methods da pilha.



9- Coloque um throw new no push(); e no pop();
Se eu tentar colocar um personagem com a pilha isfull, vai dar uma exception.

Se eu tentar remover um personagem com a pilha isEmpty, vai dar uma exception.

Como eu vou adicionar elemento na minha stack, se ela está cheia??
Como eu vou remover elemento da minha stack, se ela está vazia??
Se ligou??


public void push(String nome){
    if(isFull()){
        throw new RuntimeException();
    }
    top++;
    personagens[top] = nome; 
}



    public String pop(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        String p;
        p = personagens[top];
        top--;
        return p;
    }

Se ligou??


10- Use o mesmo procedimento no method da posicao atual(top).

Como eu vou informar que está no topo, se minha pilha está vazia??

    public String peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        return personagens[top];
    }

<Código completo no final>
----------------------------------------------------------------------------------------------------------------------------------------
Agora vai ficar mais safe.

Vamos usar a estrutura de pilha do java.util. rs

Stack(Pilha) Data Structure

Syntax:
    Stack<String> jogos = new Stack<String>();  ou
    Stack<Type> stacks = new Stack<>();

importe:
    import java.util.Stack;


   
Crie um objeto e use todos os methods.

push();
pop();
peek();    -> Retorna o valor de quem está no topo.
search();  -> Retorna em qual posicao está o valor procurado.
isEmpty();


Eu posso usar todos os outros methods de uma array.

contains();, get();, add();, etc...

Isso porque a class Stack extends de Array...Sacou??































Código completo:


public class Pilha {
    //attributes
    String personagens[];
    int top;

    //constructor
    public Pilha(){
        personagens = new String[10];
        top = -1;
    }
    
    
    //methods
    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == personagens.length - 1);
    }

    public void push(String nome){
        if(isFull()){
            throw new RuntimeException();
        }
        top++;
        personagens[top] = nome; 
    }

    public String pop(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        String p;
        p = personagens[top];
        top--;
        return p;
    }

    public String peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        return personagens[top];
    }
}






-->