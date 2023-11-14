package main.java.com.studyCompany;
import java.util.ArrayList;

public class StackNaMao <T> {
    //attributes
    private ArrayList<T> pilha; //podemos criar uma pilha de qualquer Classe.
    private Integer topo;//quem esta no topo da nossa pilha
    private Integer tamanhoDaPilha;


    //constructor
    public StackNaMao(Integer tamanhoDaPilha){
        this.topo = -1; //Sempre que criarmos uma pilha, o topo dessa pilha começa em -1. Assim, sabemos que a pilha está vazia. Se no topo da pilha tiver 0 ou mais, quer dizer que existe algum item na pilha.
        this.tamanhoDaPilha = tamanhoDaPilha; //usuario escolhe o tamanho da pilha
        this.pilha = new ArrayList<>();//Iniciamos o objeto para nao dar nenhum problema
    }


    //getters and setters
    public Integer getTamanhoDaPilha(){
        return tamanhoDaPilha;
    }

     public ArrayList<T> getPilha() {
        return pilha;
    }


    // **** STACK METHDOS ****

    //isEmpty
    public Boolean isEmpty(){
        return topo == -1; //forma mais simples de retornar um booleano.
        //poderia ser assim:
        // if(topo == -1){
        //     return true;
        // }
        // return false;
    }


   

    //isFull
    public Boolean isFull(){
        return topo == (tamanhoDaPilha -1);
        //poderia ser assim:
        // if(topo == (pilha.size() -1)){
        //     return true;
        // }
        // return false;
    }


    //peek --> Mostra quem está no topo da pilha
    public T peek(){
        if(isEmpty()){
            return null; // Ao invés de retornar null, poderíamos ter lancado uma exception
        }
        return this.pilha.get(topo); //Retornamos quem esta no topo da nossa lista
    }


    //push --> Adiciona 1 item no topo da pilha
    public T push(T itemParaColocarNaPilha){
        if(isFull()){
            throw new RuntimeException("The stack is full! Remove an item if you want push this item.");
        }
        this.topo ++;
        this.pilha.add(itemParaColocarNaPilha); //adicionamos esse item na pilha
        return itemParaColocarNaPilha; //retornamos esse item
    }

    
    //pop --> remove quem tiver no topo da pilha
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("You cannot 'pop' an item because the stack is empty");
        }
        T itemDoTopo = this.pilha.get(topo); //salvamos o item antes de remover. Assim, conseguimos informar para o usuario o item que foi removido.
        this.pilha.remove((int) topo); //removemos o item do topo. Poderíamos ter removido pelo index. 'this.pilha.remove((int) topo);' --> esse method remove() temos que passar como argumento um int primitive. Por isso precisamos castar.
        topo --; //a pilha está menor
        return itemDoTopo;
        
    }



    //list all items
    public String listarLivros(){
        if(isEmpty()){
            return "Stack is empty";
        }

        String stringBooks = "";

        for(int i=(this.pilha.size()-1); i>=0; i--){ //listamos de forma reversa. Assim, conseguimos visualizar melhor a ordem da pilha
            stringBooks += this.pilha.get(i) + "\n";
        }
        return stringBooks;
    }
}
