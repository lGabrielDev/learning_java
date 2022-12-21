<h1 align="center">
    if else
    <img src="https://cdn-icons-png.flaticon.com/512/4394/4394632.png" alt="image icon" width="90px" align="center">
</h1>
  

- `if` --> Se a condição tal `()` for true, executa esse código.
- `else if` --> Se a condição tal `()` for true, executa esse código.
- `else`    --> Caso contrário, se todas as condições anteriores forem false, executa esse código.
     

Sempre que trabalhamos com `if else`, o resultado será um valor booleano (**true/false**).

O `if` só quer saber se o teste lógico entre `()` vai ser true or false.


<hr>
<br>


## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
if(teste lógico){
  execute esse bloco de código
}
else{
  execute esse bloco de código
}
```

<hr>
<br>

## Trabalhando com apenas 1 condition
:pencil2: Crie um programinha onde o usuário vai digitar **sua idade** e o programa vai retornar as mensagens:
- Se a idade for **maior ou igual a 18** vai retornar "Maior de idade. Você é um adulto!"
- Caso contrário, se o number for **menor que 18** vai retornar "menor de idade..."

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer number;

        System.out.print("Digite um number: ");
        number = scan.nextInt();

        if(number >= 18){
            System.out.printf("\nMaior de idade. Você é um adulto!!");
        }
        else{
            System.out.printf("\nmenor de idade");
        }
        scan.close();
    }
```

<hr>
<br>

## if shorthand (forma abreviada)
Forma abreviada de escrever um `if else`.

Usamos essa forma abreviada quando temos apenas 1 condition simples (**if else apenas**).



:pencil2: Crie o mesmo exemplo acima, só que usando o **if shorthand**(forma abreviada).

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer number;

        System.out.print("Digite um number: ");
        number = scan.nextInt();

        System.out.println(number >= 18 ? "Maior de idade":"menor de idade");
        scan.close();
    }
```
:bulb: É uma forma mais clean de escrever. Se temos apenas 1 condition, vale a pena fazer dessa forma abreviada.


`?` --> Começa o if
`:` --> Separa o true e o false

<hr>
<br>

## Trabalhando com várias conditions
:pencil2: Crie um programa onde o usuário vai inputar a quantidade de medalhas que ele já ganhou. Vamos seguir as conditions:

- 10 medalhas ou mais --> "Monstrão!!"
- 5 medalhas ou mais --> "brabin!"
- 2 medalhas ou mais --> "é..."
- 0 medalhas --> "fraco"

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer medalhas;

        //input do usuário
        System.out.print("Quantas medalhas tienes? ");
        medalhas = scan.nextInt();

        if(medalhas >= 10){
            System.out.println("Monstrão");
        }
        else if(medalhas >= 5){
            System.out.println("brabin!");
        }
        else if(medalhas >= 2){
            System.out.println("é...");
        }
        else{
            System.out.println("fraco");
        }
        scan.close();
    }
```
<hr>
<br>

## If dentro de if (if aninhado)
:pencil2: Faça um programinha onde o usuário vai digitar um number e será printado uma mensagem. Vamos seguir as conditions:

- maior ou igual a 100 --> "Número grandão"
- menor que 100 --> "Número pequeno"
  - entre 0 e 10 --> "Números fáceis de trabalhar"

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer numberDigitado = 0;

        // user inputs his number
        System.out.print("Digite um number: ");
        numberDigitado = scan.nextInt();

        if(numberDigitado >= 100){
            System.out.printf("%d é GRANDÃO",numberDigitado);
        }
        else if(numberDigitado < 100){
            if(numberDigitado >=0 && numberDigitado <=10){
                System.out.printf("%d é um número fácil para trabalhar",numberDigitado);
            }
            System.out.printf("\n%d é um número pequeno",numberDigitado);
        }
        scan.close();
    }
```

<hr>
<br>

## Exercitando :pencil:
### Exercício 1

:pencil2:Crie um programa onde vai ser printado uma mensagem dizendo se o usuário vai ou não para praia. As conditions vão ser:

- Se ele tiver gasolina **e** não estiver chovendo --> Usuário vai viajar.
- Caso contrário --> Usuário fica em casa jogando lol.

Percebe que o usuário só vai viajar, se as duas condition forem true.

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Boolean temGasolina = false;
        Boolean estaChovendo = false;


        //perguntas feitas ao usuário
        System.out.print("Seu carro tem gasolina? ");
        temGasolina = scan.nextBoolean();

        System.out.print("\nEstá chovendo? ");
        estaChovendo = scan.nextBoolean();

        
        if(temGasolina && !(estaChovendo)){
            System.out.println("Vá viajar, seu viajadeiro!!");
        }
        else if(temGasolina && estaChovendo){
            System.out.println("Está chovendo...Vai jogar lol.");
        }
        else if(!(temGasolina) && estaChovendo == false){
            System.out.println("Seu carro não tem gasolina...Vai jogar lol.");
        }
        else{
            System.out.println("Seu carro não tem gasolina e está chovendo...Fique jogando lol.");
        }
        scan.close();
    }
```

<br>
<br>

### Exercício 2
:pencil2: O usuário vai digitar um number e o programa vai printar uma mensagem, seguindo as conditions:


- Se o numero for igual a 0, imprima  --> "É igual a 0"
- Se o numero for maior a 0, imprima  --> "É maior que 0"
- Se nenhuma das condições acima for true, imprima --> "É número negativo"

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer numberDigitado = 0;

        // user inputs his number
        System.out.print("Digite um number: ");
        numberDigitado = scan.nextInt();

        if(numberDigitado == 0){
            System.out.printf("%d == 0",numberDigitado);
        }
        else if(numberDigitado >= 0 ){
            System.out.printf("%d é maior que 0",numberDigitado);
        }
        else{
            System.out.printf("%d é menor que 0" ,numberDigitado);
        }
        scan.close();
    }
```


<br>
<br>


### Exercício 3

:pencil2: Crie um programa onde o usuário vai inputar um number, e depois o programa vai dizer se é **PAR** ou **ÍMPAR**.

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer numberDigitado = 0;

        // user inputs his number
        System.out.print("Digite um number: ");
        numberDigitado = scan.nextInt();

        if(numberDigitado % 2 == 0){ // se o número dividir por 2 o resto dessa divisão for 0, faça isso...
            System.out.println("PAR");
        }
        else{
            System.out.println("ÍMPAR");
        }
        scan.close();
    }
```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/7.switch_case_condicao/index.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>