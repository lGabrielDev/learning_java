<!--
switch 

Bem parecido com o if else.

Aqui, usamos quando temos uma condição simples repetida várias vezes.
Usamos switch quando tem comparacao apenas de igualdade.

Esse valor é igual a esse? Então faça isso...


Syntax:

switch(variable){
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
}




case      - Caso a variable tenha o valor tal
break;    - Se encontrar uma condição true, saia do bloco de código do switch e vá para o proximo bloco de código.   

Se eu não colocar break, ele vai escrever os próximos códigos do switch.


default:  - Como se fosse o else. Se nenhuma condição for true, imprima isso...       



Lembrando que o datatype do case tem que ser igual ao da variable.



1-
Criar programa de dia da semana usando if else

/*
Referência
1 - Sunday
2 - Monday
3 - Tuesday
4 - Wednesday
5 - Thursday
6 - Friday
7 - Saturday
*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

- Agora vamos usar o switch case com break    

int diaDaSemana = 6;

switch(diaDaSemana){
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
        System.out.println("Existe apenas 7 dias da semana.");
        break;


Percebeu??
Ele vai até a condição que corresponda ao valor 6 (Friday).... Se tiver um break, ele vai terminar o switch ali. Se não tiver break, ele vai continuar os proximos códigos do switch.

Faça o teste....
-Tire o break do case 6,7;

Viu??


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
- switch case sem break
- Vamos criar um programa onde , se o valor da variable for saturday or sunday, elas recebem o mesmo valor...Se for qualquer outro dia, recebem outro valor:

Se a variable tiver a condição 1, condição 2, condição 3.... Faça isso. Se tiver a condição 4, 5, 6 faça aquilo....

/*
Referência:

Monday      - "Dia da semana"
Tuesday     - "Dia da semana"
Wednesday   - "Dia da semana"
Thursday    - "Dia da semana"
Friday      - "Dia da semana"

Saturday - "Fim de semana"
Sunday   - "Fim de semana"
*/

Qualquer outro valor - "Valor digitado errado. Tente outro valor."


switch(diaDaSemana){
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
        System.out.println("Dia da semana");
        break;
    case "Saturday":
    case "Sunday":
        System.out.println("Fim de semana! UHU!!!");
    default:
        System.out.println("Valor digitado errado. Tente outro valor.");


Zica né?? O código ficou bem menor.


*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
(FAÇA)

4- Exemplo league of legends:
-indentificando a role de tal personagem

/*
Referência
Lucian   - ADC
Jhin     - ADC

Lux     -  MID
Veigar  -  MID

Sona    -  SUP
Soraka  -  SUP
*/




String lolChampion = "Lucian";

switch(champion){
    case "Jhin":
    case "Lucian":
        System.out.println(String.format("%s é ADC.",champion));
        break;
    case "Lux":
    case "Ahri":
        System.out.println(String.format("%s é MID.",champion));
        break;
    case "Soraka":
    case "Nami":
        System.out.println(String.format("%s é SUP.",champion));
        break;
    default:
        System.out.println("Personagem não cadastrado.");
}


Faça um loop com o do while.
A condicao vai ser:
    Sempre que o usuario escrever um nome errado, o loop vai acontecer.


- Crie uma variable boolean para colocar no while.
-Sempre que o usuario digitar um nome certo, em cada case vamos setar a variable boolean para TRUE;

Se cair no default, setamos para FALSE;




** CÓDIGO COMPLETO **

public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String campeao = "";
        boolean campeaoRegistrado = true;

        do{
            campeaoRegistrado = true;
            System.out.print("Escolha seu campeao: ");
            campeao = scan.next();
    
            switch(campeao){
                case "jhin":
                case "lucian":
                    System.out.println("ADC");
                    break;
                case "sona":
                case "lulu":
                    System.out.println("SUP");
                    break;
                case "kayn":
                case "jarvan":
                    System.out.println("JUNGLER");
                    break;
                default:
                    campeaoRegistrado = false;
                    System.out.println("Campeao nao encontrado.");
                    break;
            }
        }
        while(!(campeaoRegistrado));
        scan.close();
    }
-->





