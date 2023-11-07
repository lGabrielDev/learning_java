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
  
⚠️ Se não colocarmos o `break` depois de cada `case`, ele vai escrever os próximos códigos do switch.


⚠️ Como estamos trabalhando com a condition de igualdade, **o datatype do case tem que ser igual ao da variable**.


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

    System.out.print("\nType the number: ");
    Integer weekDay = scan.nextInt();

    switch(weekDay){
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
            if(weekDay == 0){
                System.out.println("0 is not a week day");
            }
            else{
                System.out.println("There's only 7 days of week");
            }
    }
    scan.close();
}
```

Quando utilizamos o `break`, estamos dizendo ao java que queremos parar por ali. Assim que ele encontrar o case, ele vai executar aquele case e sair para fora do switch.

Se não tivéssemos colocado o `break`, seria executado todos os códigos dos outros cases.

💡 Perceba que podemos utilizar `if else` dentro do `switch case`. Dá para fazer muitas combinações malucas.

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

    System.out.print("\nWeek day: ");
    String weekDay = scan.next();

    switch(weekDay){
        case "Sunday":
        case "Saturday":
            System.out.println("Weekend");
            break;
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            System.out.println("Weekday - work");
            break;
        default:
            System.out.println("Weekday not found");
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

Crie um loop também, para que sempre que o usuário digitar um nome de champion que não exista na lista acima, o programa reinicie.

```java
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Boolean correctChampion = true;

        do{
            correctChampion = true;
            //user inputs his champion
            System.out.print("\nChampion: ");
            String champion = scan.next();
            
            switch(champion){
                case "Lucian":
                case "Jhin":
                    System.out.printf("ADC");
                    break;
                case "Lux":
                case "Veigar":
                    System.out.printf("MID");
                    break;
                case "Nami":
                case "Lulu":
                    System.out.printf("SUP");
                    break;
                default:
                    System.out.println("Champion not found!");
                    correctChampion = false;
            }
        }
        while(!(correctChampion));
        scan.close();
    }
```

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="left">

Sempre que estiver trabalhando com loops (`while`, do `while`), crie uma variable booleana.

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/9.estrutura_de_repeticao/while.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>