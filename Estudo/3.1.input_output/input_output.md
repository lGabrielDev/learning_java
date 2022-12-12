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

- Trate os erros de input. Se o usuario escrever uma **String** vai dar pau.
  
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

:pencil2: Faça um programa onde o usuário vai responder 3 perguntas e no final será printado as respostas dele na tela.

As perguntas vão ser:

- Qual seu elo? (Bronze,Silver,Gold,Platine,Diamond,Master,Challenger) -> **<span style="color:#DC60A6">String</span>**
- Qual seu tier? (1,2,3,4,5) **<span style="color:#DC60A6">Integer</span>**
- Qual seu campeão favorito? **<span style="color:#DC60A6">String</span>**

O resultado vai ser algo assim:

Seu elo é <span style="color:tomato;">&lt;elo&gt;</span> <span style="color:tomato;">&lt;tier&gt;</span> e seu campeão favorito é <span style="color:tomato;">&lt;champion&gt;</span>. <br>
Seu elo é <span style="color:tomato">Silver</span> <span style="color:tomato">3</span> e seu campeão favorito é <span style="color:tomato">Ezreal</span>.

<br>

Código completo:

<br>

```java
public class Programa{
    public static void main(String[] args){
        String elo = "a";
        Integer tier = 0;
        String favoriteChampion = "a";

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu elo: ");
        elo = scan.nextLine();

        System.out.print("Digite seu tier: ");
        tier = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite seu campeão favorito: ");
        favoriteChampion = scan.nextLine();


        switch(elo){
            case "Bronze":
            case "Prata":
            case "Gold":
            case "Platina":
            case "Diamond":
                System.out.printf("\nSeu elo é %s %d e seu campeão favorito é %s.",elo,tier,favoriteChampion);
                System.out.println("\nSeu elo é baixo.");
                break;

            case "Master":
            case "Challenger":
                System.out.printf("\nSeu elo é %s %d e seu campeão favorito é %s.",elo,tier,favoriteChampion);
                System.out.println("\nSeu elo é alto.");
                break;
        }
        scan.close();
    }    
}
```

<br>

:warning: Sempre feche o objeto Scanner.

<br>

:bulb: Se o input não funcionar por algum motivo, limpe o buffer do Scanner.

Use o `.nextLine();` quando precisar.

<hr>
<br>

### Difference between `.next();` and `.nextLine();`

`.next();` -> Retorna apenas a primeira palavra digitada;

`.nextLine();` -> Retorna a linha inteira digitada. BEM MELHOR;

:bulb: Geralmente usamos o `.nextLine();`

<hr>
<br>

### Inputando um **Integer** e depois uma **String**

Sempre que você inputa um integer/double e dá `enter`, é como se você tivesse digitado assim:

```java
17
\n
```

Então,o próximo `.nextLine();` que você usar, vai considerar essa quebra de linha `\n`

Imagina um programa que vai perguntar ao usuário sua idade e depois seu nome...

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        String name;

        System.out.print("Digite sua idade: ");
        age = scan.nextInt();
        System.out.println("Voce tem "+age+" anos de idade");

        System.out.print("Digite seu nome: ");
        name = scan.nextLine();
        System.out.print("Olá "+ name);

        scan.close();
    }
```

Viu que deu ruim?? `O nextLine();`, considerou a quebra de linha `\n` do `nextInt();` anterior.

Para resolver o problema, é só consumir essa quebra de linha.


```java
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age;
        String name;

        System.out.print("Digite sua idade: ");
        age = scan.nextInt();
        scan.nextLine(); // Consumindo a quebra de linha
        System.out.println("Voce tem "+age+" anos de idade");

        System.out.print("Digite seu nome: ");
        name = scan.nextLine();
        System.out.print("Olá "+ name);

        scan.close();
    }
```

Se ligou?? Você "comeu" aquele `\n` do `nextInt()` anterior.

:bulb: Resumindo:

Deu pau no seu input, "COMA" o `\n` usando o `.nextLine();` antes do input

```java
scan.nextLine();
```
<hr>
<br>



<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/tree/main/Estudo/3.variables/1.variables.md"><img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right"></a>