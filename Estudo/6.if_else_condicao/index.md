<!--
if Conditions

if                  Se a condição () for true, executa esse código.
else if             Se a condição () for true, executa esse código.
else                Se todas as condições anteriores forem false, executa esse código.
     

Sempre que eu trabalhar com if, o resultado será um valor boolean (true/false)
Se for true, eu faço tal coisa.. Se não, eu vou pro else.

O if só quer saber se o teste lógico entre () vai ser true or false.


Syntax

if (teste lógico) {
  bloco de código
}
else{
  bloco de código
}

-------------------------------------------------------------------------------------------------------------------------------------------------------


1-
-Crie 2 variables int
-v1 é menor que v2?
-Se sim, escreve "Maior"
-Se não, escreve "menor"



1.2- Usando variables boolean

Crie um programa que imprima a frase "Uhuu!! Vou pra praia!"

Regras:
A mensagem só vai ser impressa se:

  estaChovendo == false && carroTemGasolina == true
  FALSE                            TRUE


-Caso esteja chovendo ou meu carro não tiver gasolina, imprima "Droga, vou ficar em casa jogando multiversus..."



boolean estaChovendo = false;
boolean carroTemGasolina = true;





(APENAS LEIA)

1.3
Crie um programa dizendo se a cor de uma fruta está boa para comer


/*
vermelha            = "Está madura. Pode comer."
amarelo             = "Espere mais 1 dia. Está quase madura."
verde               = "Não está boa para comer."
else                = "Cuidado! A fruta está doente!" 

*/


------------------------

(FAÇA)

2-
if encadeado
-Agora vamos trabalhar com mais de 1 condição.
-Crie uma variable com o salario:
-Escreva um if.... Se a variable tiver tal valor..

/*
Salarios:
1300 - é...
2000 - Ok
3000 - Bom
5000 - Muito bom
7000 - Excelente
  */



2.2- 
-Crie um programa com as seguintes regras:
-Se o numero for igual a 0, imprima                     "É igual a 0"
-Se o numero for maior a 0, imprima                     "É maior que 0"
-Se nenhuma das condições acima for true, imprima       "É número negativo"


------------------------------------

3-
Crie uma variable int, onde nosso programa vai dizer se o número é par ou impar.

Se um número dividir por 2 e o resto der 0, sei que o número é par.
Se um número dividir por 2 e o resto der 1, sei que o número é ímpar.


int number = 22;
int result = (number % 2);

if (result == 0){
System.out.println(number +" é par");
}
  else{
  System.out.println(number +" é ímpar");
  }






4- Faça um if dentro de if

int number = 500;

  if(number < 100){
    if(number <= 10){
      System.out.println("Entre 0 e 10 é bem fácil de trabalhar");
    }
    else{
      System.out.println("É um número até que grandin.");
    }
  }
  else{
    System.out.println("Numero muito GRANDE!");
  }


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
if shorthand
forma abreviada de escrever

Quando usar??
Quando tiver apenas 1 condição simples (if, else apenas)

1-
-Crie uma variable com datatype int
-Se o valor for maior que 18 -- "Maior de idade."
-Se o valor for menor que 18 -- "Menor de idade."


Com shorthand:
int age = 13;
String adulto = (age >= 18)? "Adulto":"Criança";

System.out.println(adulto);


Viu??

(age >= 18) se for true escreva "algo" : se não, escreva "outra coisa"



? Começa o if
: Separa o true e false
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-->