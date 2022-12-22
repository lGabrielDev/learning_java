<!--
modifiers

São os modificadores de acesso.

Indica a visibilidade dos atributos e methods de uma Class.



modifiers:

default -> Visíveis pra todas as classes do mesmo package.

public -> Os atributes/methods podem ser acessados por todas as class de qualquer pacote.

private -> Os atributes/methods só podem ser acessados pela class que o criou.

protected -> Os atributes/methods podem ser acessados por classes do mesmo package ou por suas classes filhas.




-Teste cada um dos modifiers(default,public,private,protected)
-Crie 2 packages

    package 1
        contendo a class do programa main
    package 2
        contendo uma class "Mensagem" com 4 atributos.
            //attributes
            String atributeDefault;
            public String attributePublic;
            protected String attributeProtected;
            private String attributePrivate;


-Teste cada um dos modifiers no method main;
-Crie um objeto "Mensagem" e tente acessar cada um dos atributos.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
(A partir daqui, não precisa ler. Vá para o proximo resumo.)




1- Crie o mesmo projeto da aula passada:
-Crie 1 projeto
-Crie 2 class dentro de src:
    .Uma class contendo os atributos e methods
    .Outra class para criar os objetos e rodar nosso programa.

2- Crie  os atributos e methods:

// atributos
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

// methods

void status(){
    System.out.format("Marca:  %s\nCor:  %s\nPonta:  %f\nCarga:  %d\nEstá tampada?:  %b\n",marca,cor,ponta,carga,temTampa);
}

void rabiscar(){
    if(this.tampada == true){
        System.out.println("Erro. Caneta está tampada.");
    } else{
        System.out.println("Rabisco feito com sucesso!");
    }




4- Coloque os modifiers (public,private,protect)
// atributos
    public String marca;
    public String cor;
    private double ponta;
    private int carga;
    private boolean tampada;







5- Na Class Index
-Crie o method main
-Crie um objeto da class "Caneta"

6-Dentro do method main, atribue os valores aos atributos desse objeto

//      criando o objeto
        Caneta caneta1 = new Caneta();

//      atribuindo valores aos atributos
        caneta1.marca = "Adidas";
        caneta1.cor = "Rosa";
        caneta1.ponta = 0.95;
        caneta1.carga = 50;
        caneta1.tampada = false;

Perceba, que só deu pra atribuir valor ao atributo que tem o modifier "public".


public -> Qualquer classe pode acessá-lo.
private -> Apenas a class atual pode acessá-lo

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


Exemplo 2:

1-
    Vamos criar 2 class:
    .Class "App" -> Vai conter nosso method main e vai rodar o programa
    .Class "FestaVip" -> Vamos criar os atributos e methods.


2-Na class "FestaVip" crie os atributos e methods:
// atributes
int quantidadeCafe = 100;
int quantidadeSalgado = 200;

// methods
    void beberCafe(){
        System.out.println("Bebeu 1 copo de café.");
    }

    void comerSalgado(){
        System.out.println("Comeu 5 salgados.");
    }


3- Crie 1 objeto na class Index > main method >
FestaVip festa1 = new FestaVip();

4-Imprima os atributos desse objeto:
System.out.println(festa1.quantidadeCafe);
System.out.println(festa1.quantidadeSalgado);


5- Vá na class "FestaVip" e coloque o modifier private nesses atributos;

private int quantidadeCafe = 100;
private int quantidadeSalgado = 200;


Viu?? Você ja não consegue mais acessar esses atributos...
Eles estão privates. Só podem ser acessado pela class atual.



6- Agora, chame os methods criados.
festa1.beberCafe();
festa1.comerSalgado();

7- Coloque o modifier private

private void beberCafe(){
    System.out.println("Bebeu 1 copo de café.");
}


private void comerSalgado(){
    System.out.println("Comeu 5 salgados.");
}


Viu?? Mesma coisa... Eles são privates, só podem ser acessados pela classe atual.

Para acessar methods privates eu simplesmente crio um outro method public e coloco os methods private dentro.

public void entrarNaFesta(){
    beberCafe();
    comerSalgado();
}

8- Retorne o method
festa1.entrarNaFesta();

Viu?? Mesmo os method beberCafe(),comerSalgado() sendo private, eu consegui acessá-los.



Sempre utilize os modifiers (modificadores de acesso) nos meus atributos e methods.

Sempre optando em deixar em private. Se houver a necessidade você coloca como public.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
default

Entendendo melhor....

-Crie um projeto 
-Projeto > src (source) > crie 2 pacotes (pastas);
    ."package1"
    ."package2"

-package1 > crie 2 Class
    ."Acesso1"
    ."Acesso2"

-package2 > crie 1 Class
    ."Acesso3"



-Na Class "Acesso2" crie 2 atributos:

int horas = 3;
int minutos = 40;

1- Vá na Class "Acesso1":
    -Crie o method main
    -Crie um objeto da Class "Acesso2"
        Acesso2 objeto = new Acesso2();

    -Tente acessar os atributos desse objeto:
        System.out.println(objeto.horas);
        System.out.println(objeto.minutos);

Deu certo, né?? Isso porque os atributos estão como default.

--------------------------------------------------------------------------------
public
-Vá na Class Acesso2 e troque os atributos de default para public.
-Tente acessar esses atributos no Acesso1
objeto.horas
objeto.minuto

Também deu certo.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------














-->