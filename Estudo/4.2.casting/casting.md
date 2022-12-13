<!--
casting

Ordem de tamanhos dos tipos primitivos:
    byte -> short -> char -> int -> long -> float -> double



Perceba que a ordem é do menor para o maior.
Essa ordem representa quantos bytes eles ocupam da memoria do computador.
Sendo o byte o que ocupa menos, e o double o que ocupa mais.



Transformando um tipo primitivo em outro tipo primitivo

Se eu quiser transformar um tipo primitivo em outro tipo primitivo maior, eu posso fazer sem problema nenhum:

1-Transformando int em double   
-Crie uma variable com tipo primitivo menor (int).
-Crie uma variable com tipo primitivo maior(double), que vai receber a variable int.


Transformando um int em double
    int number = 10;
        double transformando = number;
        System.out.println(transformando);

Como eu estou transformando um tipo primitivo menor em um maior, a transformação acontece automaticamente. Bem tranquilo.



Agora...

Se eu quiser transformar um tipo primitivo maior em um tipo primitivo menor, eu preciso informar para o java:

2-Transformando double em int

-Crie uma variable com tipo primitivo maior (double)
-Crie uma variable com tipo primitivo menor(int), que vai receber a variable anterior.
-Especifique a transformacao usando o "(int)";

    double number = 10.35;
    int transformacao  = (int)number;
    System.out.println(transformacao);



Resumindo:
Eu posso transformar um tipo primitivo em outro MAIOR. (int to double safe)

Agora... Para transformar um maior para um menor(double to int) eu preciso especificar com "(type que eu quero alterar)";


Só pensar assim:

"Dá pra transformar numero inteiro(int) em numero quebrado(double)"
    10 -> 10.0

"Agora... Não dá pra transformar numero quebrado para numero inteiro"
    10.5 -> X

Eu preciso castar;
-----------------------------------------------------------------------------------------------------------------------------------------
Transformando String em int
Integer.parseInt();
Double.parseDouble();
Float.parseFloat();
etc...

-Crie uma variable com uma String "50";
-Crie outra variable com um numero int;
-Imprima a soma das duas variables:

    String numeroErrado = "50";
    int numero = 50;
    System.out.println(numero + numeroErrado);

Retornou 5050;

Isso aconteceu porque quando eu somo uma String e um int o resultado sempre sera uma String.

-Use o Integer.parseInt(); e transforme a String em int.
    System.out.println(numero + Integer.parseInt(numeroErrado));

Easy!!


Lembrando que se a String tivesse letras,caracteres, etc... Ia dar bosta.

Só vai funcionar se String tiver apenas numeros;


------------------------------------------------------------------------------------------------------------------------------------------
Transformando int para String
String.valueOf()


-Crie uma variable int
-Crie uma variable String que vai receber a variable int.
Vai dar bosta, porque eu não posso transformar um int em String.
    int numero = 50;
    String texto = numero;

-Use o method String.valueOf(); e transforme em String.
    int numero = 50;
    String texto = String.valueOf(numero); 

    System.out.println(texto.getClass());

----------------------------------------------------------------------------------------------------------------------------------------Resumindo:
Para transformar String em numeros, eu uso:
    Integer.parseInt();
    Double.parseDouble();
    Float.parseFloat();

Para transformar numeros em String, eu uso:
    String.valueOf();
------------------------------------------------------------------------------------------------------------------------------------------
-->