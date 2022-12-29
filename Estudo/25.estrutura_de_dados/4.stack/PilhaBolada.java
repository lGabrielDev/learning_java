package main.java.br.com.leekbiel.projeto.classes;

public class PilhaBolada {
    //attributes
    String[] personagens; // representa a nossa pilha
    Integer topo; // representa a posição atual do topo

    //constructor
    public PilhaBolada(){
        this.personagens = new String[2]; // Definimos o tamanho da array
        this.topo = -1; //Se eu coloco um item na pilha, ele tem posicao 0. Logo, a posicao "-1" quer dizer que a pilha está vazia.
    }


    //methods da pilha

    //.isempty() --> Verificar se a pilha está vazia.
    public Boolean isEmpty(){
        if(this.topo == -1){
            return true;
        }
        else{
            return false;
        }
    }
        

    //.isFull() --> Verificar se a pilha está cheia.
    public Boolean isFull(){
        if(this.topo == (personagens.length-1)){ // this.topo == 9. Como a posição 10 não existe (0,1,2,3,4,5,6,7,8,9), a ultima posicao é a 9.
            return true;
        }
        else{
            return false;
        }
    }


    //.peek() --> Verificar quem está no topo da pilha
    public String peek(){
        return personagens[topo];
    }


    //.push() --> Inserir mais um objeto na pilha
    public void push(String personagem){
        if(isFull()){
            throw new RuntimeException("A pilha está cheia. Não é possível adicionar mais nenhum item.");
        }
        else{
            topo ++;
            personagens[topo] = personagem;
        }
    }


    //.pop() --> Remove quem está no topo da pilha.
    public String pop(){
        if(isEmpty()){
            throw new RuntimeException("A pilha está vazia. Não há o que remover.");
        }
        else{
            String p = personagens[topo];
            topo --;
            return p; //retornamos 
        }
    }
}
