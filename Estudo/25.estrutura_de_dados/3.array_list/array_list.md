<!--
ArrayList ou Dynamic Arrays
A diferenca de ArrayList e array normal, é que na array tradicional ela tem um tamanho específico.
Já na ArrayList, o tamanho dela pode aumentar conforme eu coloco ou tiro elementos.


Quando eu crio uma ArrayList, eu estou criando um objeto do tipo lista.

---------------------------------------------------------------
Array Tradicional
Crie 1 array que recebe String com 3 posicoes.


Poderia fazer assim:

String[] animais = new String[3];
animais[0] = new String("cachorro");
animais[1] = new String("gato");
animais[2] = new String("pássaro");

System.out.println(animais[0]);
System.out.println(animais[1]);
System.out.println(animais[2]);

Ou...


Poderia fazer assim:
String[] animais = new String[3];
animais[0] = "cachorro";
animais[1] = "gato";
animais[2] = "pássaro";

System.out.println(animais[0]);
System.out.println(animais[1]);
System.out.println(animais[2]);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
ArrayList
Para usar a class ArrayList, eu preciso importar o package java.util
import java.util.ArrayList;


Syntax
ArrayList<String> animal = new ArrayList<String>();

Eu faço como se tivesse criando um objeto array, mas em vez de colocar o [] eu coloco <Type>


Maneira tradicional
String[] animal = new String[3];


ArrayList
ArrayList<String> animal = new ArrayList<String>();



Perceba que ArrayList é igual a uma Class...Então ela tem alguns methods..Se liga..

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
add();
Adicionar posicoes na array

add("valor")

-Crie um objeto da class ArrayList e adicione 3 posicoes

ArrayList<String> animal = new ArrayList<String>();
animal.add("Cachorro");
animal.add("Gato");
animal.add("Pássaro");


Voce consegue mostrar todas as pocicoes, usando o nome da ArrayList:

System.out.println(animal);
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
get()

Para acessar uma posicao na array, vou usar o method get();

-Imprima as 3 posicoes

System.out.println(animal.get(0));
System.out.println(animal.get(1));
System.out.println(animal.get(2));

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
set();
Seto/altero o valor de uma posicao.

Parâmetros:
(Posicao,"valor novo")


-Altere o valor da segunda posicao

animal.set(1,"Cavalo");

System.out.println("--------------------------");

System.out.println(animal.get(0));
System.out.println(animal.get(1));
System.out.println(animal.get(2));


get e set são igualzin no encapsulamento...Zica né?
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
size();
Mostra quantas posicoes minha ArrayList tem.

Lembra que antes, na array tradicional eu usava o .length();

Aqui eu uso o size();  -> É igualzin o .length();

System.out.println(animal.get(0));
System.out.println(animal.get(1));
System.out.println(animal.get(2));
System.out.println("Total de posicoes da ArrayList: " + animal.size());


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
remove();
Remove uma posicao da ArrayList.
Posso tanto remover atraves da posicao, quanto de uma String específica

remove(posicao);    ou
remove("string");



-remova a primeira posicao da ArrayList;

animais.remove(0);
System.out.println("-------------------");

System.out.println(animais.get(0));
System.out.println(animais.get(1));

Perceba que, quando eu removo uma posicao, as outras descem.

Antes eu tinha 3 posicoes, agora que eu removi tenho apenas 2.

Se antes a minha posicao 0 era cachorro...Agora que eu removi cachorro, o gato vira a posicao 0...Sacou??



Removendo a última posicao:


-remova a ultima posicao da ArrayList;
use o size(); para saber a quantidade de posicoes e remova 1.

Se eu tenho 3 posicoes, eu tenho:
0,1,2;

Se eu quero remover a ultima posicao, eu vou fazer size(); - 1;
3 - 1 = 2. Sacou??


animais.remove(animais.size()-1);
System.out.println("-------------------");

System.out.println(animais.get(0));
System.out.println(animais.get(1));


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
clear();
Remove todas as posicoes;


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
contains();
Verifica se tem tal valor em alguma posicao da ArrayList;

Ele retornar um valor boolean (true/false)

-Crie uma Arraylist e adicione 3 items.
-Crie um if com contains.
    Se a arraylist contains "joaozinho", eu retorno uma mensagem:
        "joaozinho está na lista";


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Usando loop na ArrayList

Imagine que eu quero imprimir todas as posicoes da ArrayList.

Vou usar o loop for;

for(int i = 0; i < animais.size(); i++){
    System.out.println(animais.get(i));
}

Enquanto i for menor que o total de posicoes da ArrayList, imprima a posicao.

Sacou???




for each loop na ArrayList;

for(String i: animais){
    System.out.println(i);
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Outros types
Quando eu uso ArrayList eu não posso usar primitive data types.

int
double
float
boolean
char

Para usá-los eu preciso transformá-los em Wrapper Classes:

Wrapper Classes

int	     ->   Integer
float	 ->   Float
double	 ->   Double
boolean	 ->   Boolean
char	 ->   Character



Agora sim, eu consigo criar uma ArrayList com qualquer tipo de datatype.



1-Crie uma ArrayList com Integer

ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(72);
numbers.add(46);
numbers.add(70);
numbers.add(25);
numbers.add(13);
numbers.add(2);


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
sort();
Ordena de forma ascending

Para usar o sort(); eu preciso importar o package Collections
import java.util.Collections;


-Crie uma ArrayList<Integer> e ordene as posicoes do menor para o maior


Collections.sort(animais);

for(int i = 0; i<animais.size(); i++){
    System.out.println(animais.get(i));
}



-Altere o type da ArrayList para <String> e faça a mesma coisa.


Para ordenar de forma descending, fazemos:

Collections.sort(ArrayName, Collections.reverseOrder());



Easy!!
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-->