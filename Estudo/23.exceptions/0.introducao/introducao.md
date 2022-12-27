<!--
Exception
São os erros que acontecem no meu programa.
Sempre que um erro(exception) ocorre, meu programa é finalizado e os códigos depois do erro não são executados.

Um exemplo simples seria dividir um número por 0.

-Crie um sysout e divida um numero por 0.
    System.out.println(10/0);
-Rode o programa:

    Exception in thread "main" java.lang.ArithmeticException: / by zero
            at main.java.br.com.leekbiel.projeto.App.main(App.java:5) 

Sempre lemos a exception de baixo pra cima.
A linha de baixo informa o package onde ocorreu > qual foi a classe > qual o method > linha que aconteceu o erro.

Na linha de cima, mostra o package/diretório (java.lang.) > e mostra qual a classe da exception (ArithmeticException)

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
(Apenas leia)

NullPointerException
Acontece quando eu esqueco de colocar o "= new ClassName()";
    Cliente c1 = null;

Aqui, o meu objeto "c1" da class "Cliente" tem valor null. Vai dar pau.
Para resolver, vamos colocar o new:

    Cliente c1 = new Cliente();

SEMPRE QUE EU CRIAR UM OBJETO, EU PRECISO COLOCAR O NEW.
    Class object = new Class();



-Crie uma class "Cliente" e coloque 2 attributes(não precisa deixar private):
    String nome;
    int age;

-Na class do programa, crie um objeto dessa Class.
    Cliente c1 = new Cliente();

-Sete o valor de um atributo, e imprima na tela:
    c1.nome = "Gabriel";
    System.out.println(c1.nome);

-Rode o programa.
-remova o "new" do objeto criado por null.
    Cliente c1 = null;

O erro apareceu! Sacou??
Essa exception acontece porque algum objeto está null;

Sempre colocar o new ao criar um objeto.


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Exception tree (árvore)
-Olhe a imagem "exception_tree.png"
A hierarquia começa com "Throwable" pai de todas.

Errors -> geralmente são erros da máquina do usuário.

Exceptions
    Checked exceptions -> Erros que o java reconhece enquanto eu estou codando/compilando meu código.
    
    Unchecked exceptions(runtime) -> Erros que acontecem quando eu executo meu programa.


-->