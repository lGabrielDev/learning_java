# Input and Output

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="pessoa inputando dados com o teclado" width ="50px" align="center">

**Input** -> Entrada de dados

**Output** -> Saída de dados

<hr>
<br>

## Java Output (Saída de dados) <img src="https://cdn-icons-png.flaticon.com/512/3488/3488822.png" alt="pessoa inputando dados com o teclado" width ="50px" align="center">

Saída de dados do computador para o usuário.

```java
System.out.println();   //imprime na tela e quebra linha
System.out.print();     //imprime na tela na mesma linha
System.out.printf();    //imprime na tela de forma formatada 
```

<hr>
<br>

## Java Input (Entrada de dados) <img src="https://cdn-icons-png.flaticon.com/512/5205/5205407.png" alt="pessoa inputando dados com o teclado" width ="50px" align="center">

O usuário vai inputar dados para o computador.

Vamos usar um objeto da class **Scanner**

<br>

### Exercício 1 
:pencil2: Crie um programa que some 2 números digitados pelo usuário.

1. Importe a class **Scanner**:
   
    ```java
    import java.util.Scanner;
    ```
<br>

2. Instancie um objeto da class **Scanner**:

    ```java
    Scanner scan = new Scanner(System.in);
    ```

<br>

3. Crie o programinha:

    ```java
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            Integer number1 = 0;
            Integer number2 = 0;
            Integer soma = 0;

            System.out.print("Digite um número: ");
            number1 = scan.nextInt();

            System.out.print("Digite outro número: ");
            number2 = scan.nextInt();
            soma = number1 + number2;

            System.out.printf("\n%d + %d = %d",number1,number2,soma);
            
            scan.close();
        }
    ```

    :warning: Sempre feche um objeto Scanner.` objectName.close();`

<hr>
<br>



### Exercicio 2
:pencil2: Deixe o programa mais complexo: 

- Crie um output com 4 opcoes para o usuario fazer:

1. Soma
2. Subtração
3. Multiplicação
4. Divisão

    :bulb: Use o switch() com o do{} while()

<br>

- Trate os erros de input. Se o usuario escrever uma String vai dar pau.
  
  :bulb:Use o do while com try catch

    ```java
    do{
        try{}
        catch(){}
    }
    while();
    ```
<br>


:bulb: Sempre que entrar no catch, resete o buffer do input `scan.nextLine();`

<br>

Não se afobe. Vai tratando com o `do while` de pouco em pouco. Trate primeiro o primeiro input, depois o segundo, etc.. Um de cada vez.

<br>

#### Passo a passo para tratar os inputs
Vamos tratar os erros de input um por um. Vamos tratar nessa ordem:


1. Trate o input do number1 (Se o usuário inputar uma String)
2. Trate o input do number2 (Se o usuário inputar uma String)
3. Trate o input da operacao matemática (Se o usuário inputar uma String ou escolher uma opcao inválida)
4. Faça um loop para rodar o programa novamente, se o usuário quiser.


<br>
<br>

#### Código completo:

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Integer number1 = 0;
        Integer number2 = 0;
        Integer resultado = 0;
        Integer opcaoEscolhida = 0;
        Boolean opcaoCorreta = true;
        Boolean reiniciarPrograma = true;

        do{
            // Inputando o primeiro number
            do{
                try{
                    System.out.println("\n\n***** Programa iniciado *****");
                    System.out.print("\nDigite o primeiro número: ");
                    number1 = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Valor inválido. Por favor, insira um number.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(!(opcaoCorreta));


            // Inputando o segundo number
            do{
                try{
                    System.out.print("Digite o segundo número: ");
                    number2 = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Valor inválido. Por favor, insira um number.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(!(opcaoCorreta));


            // Escolha da operação matemática
            do{
                try{
                    System.out.println("\nQual operação matemática deseja fazer?");
                    System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
                    opcaoEscolhida = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Opção incorreta. Por favor, escolha novamente.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(opcaoCorreta == false || opcaoEscolhida < 1 || opcaoEscolhida > 4);

            switch(opcaoEscolhida){
                case 1:
                    resultado = number1 + number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d + %d = %d",number1,number2,resultado);
                    break;
                case 2:
                    resultado = number1 - number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d - %d = %d",number1,number2,resultado);
                    break;
                case 3:
                    resultado = number1 * number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d * %d = %d",number1,number2,resultado);
                    break;
                case 4:
                    resultado = number1 / number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d / %d = %d",number1,number2,resultado);
                    break;
                default:
                    System.out.println("Opção incorreta. Por favor, escolha novamente.\n");
                    opcaoCorreta = false;
                    break;
            }

            // Rodar o programa novamente
            do{
                try{
                    System.out.println("\n\n\nDeseja fazer outra operação?");
                    System.out.println("1- Sim\n2- Não");
                    opcaoEscolhida = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Opção inválida.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                } 
            }
            while(opcaoCorreta == false || opcaoEscolhida > 2);

            if(opcaoEscolhida == 1){
                reiniciarPrograma = true;
            }
            else if(opcaoEscolhida == 2){
                reiniciarPrograma = false;
                System.out.println("\nPrograma finalizado");
            }        
        }
        while(reiniciarPrograma == true);
        scan.close();   
    }
```
<hr>
<br>

### Exercício 3

:pencil2:

<!--


2-
-Crie um programa onde o usuario vai responder algumas perguntas e no final será exibida uma mensagem com as respostas.

Perguntas:

-Qual seu elo? 
-Input
Se a resposta for:
Bronze  -> Elo baixo
Prata   -> Elo baixo
Gold    -> Elo baixo
Platina -> Elo baixo
Diamante -> Elo alto
Mestre -> Elo alto
Challenger -> Picudo



-Qual seu tier(1,2,3,4 ou 5)? (int)
-Input

-Qual seu champion favorito? (String)
-Input

//Frase contendo todas as respotas acima:
"Seu elo is <elo> <tier> e seu campeao favorito is <champion>"


-Feche o objeto Scanner criado.
objectname.close();
    




Quando eu estou trabalhando com loops e input de usuario, e o programa nao funcionar direito...

As vezes pode ser por que voce não limpou o scanner.
use o .nextLine(); quando precisar.
------------------------------------------------------------------------------------------------------------------------------------------

Diferença entre .next() and nextLine();

.next(); -> Retorna a primeira palavra digitada apenas;

.nextLine(); -> Retorna a linha inteira digitada. BEM MELHOR;

SEMPRE USE O nextLine();


-Crie um programa onde o usuario vai digitar uma frase e depois imprima essa frase.

-Use primeiro o .next();
-Troque para o .nextLine();

	Scanner scan = new Scanner(System.in);
	String frase;

	System.out.print("Escreva uma frase: ");
	fraseDigitada = scan.nextLine();
	System.out.println(fraseDigitada);

    
Se a minha variable vai receber mais de 1 palavra, eu vou usar o nextLine();

-troque para next. Viu?? Pegou apenas a primeira palavra.
------------------------------------------------------------------------------------------------------------------------------------------
Quando eu dou um input de int e depois dou um input de String, vai dar bosta.

Isso porque....
Sempre que eu digito um integer/double,etc... e dou "enter", é como se eu tivesse digitado assim:

17
\n

Exemplo:
1-
Crie um programa onde vai perguntar a idade e depois o nome do usuario.

	Scanner scan = new Scanner(System.in);
	int idade;
	String nome;

	System.out.print("Digite sua idade: ");
	idade = scan.nextInt();
	System.out.println("Voce tem "+idade+" anos de idade");

	System.out.print("Digite seu nome: ");
	nome = scan.nextLine();
	System.out.print("Olá "+ nome);

Viu que deu ruim?? O nextLine(), considerou a quebra de linha (\n) do nextInt anterior.

Pra resolver esse problema é fácil.

-Consuma aquele \n usando o .nextLine();
	Scanner scan = new Scanner(System.in);
        int idade;
        String nome;

        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();
        System.out.println("Voce tem "+idade+" anos de idade");

        System.out.print("Digite seu nome: ");
        scan.nextLine();
        nome = scan.nextLine();
        System.out.print("Olá "+ nome);


Se ligou??
Eu consumo aquele \n do nextInt() anterior.

Resumindo:
Deu pau no seu input, COMA o "\n" usando o .nextLine() antes do input;
	scan.nextLine();  			-> Comendo o \n
	nome = scan.nextLine();		-> Inputando




2- Coloque mais 2 perguntas no programa:
	-Numero favorito: 
	-Esporte favorito?


Resumindo:
	Inputou um dado do tipo numero(int,double,float,short,etc...) , coma o /n;
-->



<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/tree/main/Estudo/3.1.input_output/input_output.md"><img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right"></a>****