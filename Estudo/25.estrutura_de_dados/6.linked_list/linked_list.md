

<!--
LinkedList

A LinkedList , assim como a ArrayList, é uma coleção que pode conter vários objetos do mesmo type.
Linkedlist e ArrayList implementam o mesmo List interface.

Isso quer dizer que eu posso adicionar itens,remover itens,alterar itens,e limpar a lista.


A diferenca é que no LinkedList eu tenho alguns methods adicionais:

addFirst()
addLast()
removeFirst()
removeLast()
getFirst()
getLast()

LinkedList É PAIA
USE SEMPRE ArrayList!!

A ArrayList é mais rápida.


O LinkedList pode funcionar como stack e como queue.
Dá pra usar os 2 tipos com LinkedList.

Vai depender de como eu vou adicionar e remover os elementos:
    push/pop -> Stack (Estrutura de pilha)
    offer/poll -> Queue (Estrutura de fila)

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

ArrayList

Eu posso escrever apenas assim:
    List<String> nomes = new ArrayList<>();

Aí é só importar o List e o ArrayList
    import java.util.List;
    import java.util.ArrayList;



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Criando um ArrayList do type de uma classe que eu criei.


-Crie uma class "Endereco"
    //attributes
    public String country;
    public String city;
}

-Deixe os atributos como public, para poder acessar os atributos de qualquer pacote.

-No seu programa main, crie uma ArrayList
    List<Endereco> enderecos = new ArrayList<Endereco>();

-Importe a class List e Arraylist
    import java.util.List;
    import java.util.ArrayList;


Como eu não tenho nenhum objeto criado da class "Endereco", eu não vou conseguir add nenhum objeto para a lista.


-Crie um construtor para a class Endereco com todos os atributos;

-Crie 3 objetos da Class Endereco:
        Endereco e1 = new Endereco("Rua Clementina",44,"Bairro das flores");

        Endereco e2 = new Endereco("Rua Norte",70,"Bairro das Gortígias");

        Endereco e3 = new Endereco("Rua Ceará",81,"Bairro das Rosas");

-adicione na Lista todos os objetos.
        enderecos.add(e1);
        enderecos.add(e2);
        enderecos.add(e3);


    Perceba que, como o type da minha list é uma class Endereco, eu coloco o objeto. Não vou colocar String, int , etc.....

    Se é do tipo "Endereco", eu coloco o objeto.

    Se ligou??



    Eu posso criar uma lista de Integers...
    Eu posso criar uma lista de Strings...
    E também posso criar uma lista de objetos.....
    Ai eu posso escolher qual atributo desse objeto eu vou mostrar.

    Imagina que eu quero criar uma lista de objetos "Pessoa";

    Essa lista, nao vai permitir adicionar Strings, Integers, etc...
    Eu vou adicionar à lista apenas objetos do tipo "Pessoa";

    Se ligou??


-Traga o bairro do primeiro objeto da list:
    System.out.println(enderecos.get(0).bairro);

    Perceba que eu acesso a lista > acesso a posicao 0 > e acesso o atributo desse meu objeto.


-Traga o bairro de cada objeto da lista:
    for(int i = 0; i<enderecos.size(); i++){
        System.out.println(enderecos.get(i).bairro);
    }   

    Se eu usar o for each, eu faço assim:
        for(Endereco i: pessoas){
            System.out.println(i.rua);
        }

Easy!!
-->