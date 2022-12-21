<h1 align="center">
    switch case
    <img src="https://cdn-icons-png.flaticon.com/512/466/466154.png" alt="image icon" width="90px" align="center">
</h1>

Funciona igual o `if else`, mas aqui usamos apenas quando temos conditions de igualdade.


"Esse valor é igual a esse? Então faça isso...".

## Syntax: <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">

```java
switch(variable){
    case 1:
        faça isso...
        break;
    case 2:
        faça isso...
        break;
    default:
        faça isso...
}
```

- `case` --> Caso a variable tenha o valor tal, faça isso...
  
- `break` --> Para por ali e não executa os outros cases, saindo do switch.

- `default` --> Como se fosse o else. Se nenhuma condição for true, faça isso...
  
:warning: Se não colocarmos o `break` depois de cada `case`, ele vai escrever os próximos códigos do switch.


:warning: Como estamos trabalhando com a condition de igualdade, **o datatype do case tem que ser igual ao da variable**.


<hr>
<br>

## switch case com break <img src="https://cdn-icons-png.flaticon.com/512/4796/4796654.png" alt="chain break icon" width =50px>
:pencil2: Faça um programinha onde o usuário vai digitar um número correspondente ao dia da semana, e será printado uma mensagem. Vamos seguir as seguintes conditions:

- 1 --> "Sunday"
- 2 --> "Monday"
- 3 --> "Tuesday"
- 4 --> "Wednesday"
- 5 --> "Thursday"
- 6 --> "Friday"
- 7 --> "Saturday"


```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer numeroDigitado;

        // input do usuario
        System.out.print("Digite um numero: ");
        numeroDigitado = scan.nextInt();


        switch(numeroDigitado){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                if(numeroDigitado == 0){
                    System.out.println("0 não é dia da semana");
                }
                else{
                    System.out.println("Só existem 7 dias na semana.");
                }
        }
        scan.close();
    }
```

Quando utilizamos o `break`, estamos dizendo ao java que queremos parar por ali. Assim que ele encontrar o case, ele vai executar aquele case e sair para fora do switch.

Se não tivéssemos colocado o `break`, seria executado todos os códigos dos outros cases.

:bulb: Perceba que podemos utilizar `if else` dentro do `switch case`. Dá para fazer muitas combinações malucas.

<hr>
<br>

## switch case sem break
:pencil2: Crie um programa onde o usuário vai inputar um número representando um dia da semana e o programa vai printar uma mensagem. Vamos seguir as conditions:



- **Monday**      - "dia de trabalhar"
- **Tuesday**     - "dia de trabalhar"
- **Wednesday**   - "dia de trabalhar"
- **Thursday**    - "dia de trabalhar"
- **Friday**      - "dia de trabalhar"
- **Saturday** - "Fim de semana. UHU!!!"
- **Sunday**   - "Fim de semana. UHU!!!"


Dessa vez, o datatype vai ser String.

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String diaDaSemana;

        // input do usuario
        System.out.print("Escreva um dia da semana: ");
        diaDaSemana = scan.nextLine();

        switch(diaDaSemana){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Dia de trabalhar");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Final de semana! Uhu!!!");
                break;
            default:
                System.out.println("Dia da semana não encontrado...");
        }
        scan.close();
    }
```
<hr>
<br>

## Exercitando

:pencil2: Faça um programinha onde o usuário vai inputar o nome de um champion do lol. Vamos seguir as seguintes conditions:

- **Lucian** --> "ADC"
- **Jhin** --> "ADC"
- **Lux** --> "MID"
- **Veigar** --> "MID"
- **Nami** --> "SUP"
- **Soraka** --> "SUP"

Crie um loop também, para que sempre que o usuário digitar um nome de champion que não exista na lista acima, o programa reinicia.

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String favoriteChampion = "a";
        Boolean championCadastado = false;

        
        do{
            // input do usuario
            System.out.print("\nDigite seu lol favorite champion: ");
            favoriteChampion = scan.nextLine();
            championCadastado = true;
    
            switch(favoriteChampion){
                case "Lucian":
                case "Jhin":
                    System.out.printf("\n%s é ADC",favoriteChampion);
                    break;
                case "Lux":
                case "Veigar":
                    System.out.printf("\n%s é MID",favoriteChampion);
                    break;
                case "Nami":
                case "Soraka":
                    System.out.printf("\n%s é SUPP",favoriteChampion);
                    break;
                default:
                    championCadastado = false;
                    System.out.println("Champion não cadastrado. Por favor, digite novamente.");
            }
        }
        while(!(championCadastado));
        scan.close();
    }
```

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="left">

Sempre que estiver trabalhando com loops (`while`, do `while`), crie uma variable booleana.

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/9.estrutura_de_repeticao/while.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>