<h1 align="center">
    try catch
    <img src="https://cdn-icons-png.flaticon.com/512/576/576509.png" alt="image icon" width="90px" align="center">
</h1>

Sempre que acontece uma exception(erro), o programa é finalizado e o restante dos códigos não são executados. Para o programa continuar funcionando, precisamos tratar essas exceptions.

Para tratar as exceptions, vamos usar o `try catch`.

- `try{}` --> Bloco de código que vai ser testado

- `catch(){}` --> Se tal erro acontecer, execute esse bloco de código. Como parameter, passamos um objeto da class de uma Exception.

- `finally` --> bloco de código que será executado de qualquer forma. Se o erro acontecer ou se o erro não acontecer, será executado anyway.

Funciona bem parecido com o `if else`.

```java
try{
    bloco de código para testar
}
catch(Erro1 e){
    Se der o erro1, trate dessa forma...
}
catch(Erro2 e){
    Se der o erro2, trate dessa forma...
}
finally{
    faça isso de qualquer forma...
}
```

<br>

:pencil2: Crie uma array de 5 posicoes e tente atribuir um valor na posicao 200. Não vai dar, porque a posicao 200 não existe nessa array. Trate esse erro com o `try catch`:

```java
public class Programa{
    public static void main(String[] args){
        try{
            Integer[] notas = {5,2,8,10,4};
            notas[200] = 40; // Exception bem aqui
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro. Você tentou acessar um index que não existe");
        }
    }
}
```

:bulb: Como boas práticas, o nome do objeto da class Exception sempre vai ser `e` .

<br>

:bulb: Sempre que popar uma exception(erro) no seu programa e mostrar de qual classe ela pertence, usamos ela como parameter no `catch`.


<hr>
<br>

## Tratando multiple exceptions
Para tratar várias exceptions(erros), basta usar vários `catch(){}`. Cada um vai tratar um tipo de erro.

<br>

:pencil2: Crie um programa onde o usuário vai dividir um número por outro. Depois, trate as exceptions:

### Tratando o primeito input(number1):
- Se o usuário inputar uma `String` 
  
<br>

### Tratando o segundo input(number2):
- Se o usuário inputar uma `String` 
- Se o usuário dividir por `0`.



```java
public class App{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Double number1 = 0d;
        Double number2 = 0d;
        Boolean valorCorreto = true;

        //inputando primeiro number
        do{
            try{
                System.out.print("\nDigite um number: ");
                number1 = scan.nextDouble();
                valorCorreto = true;
            }
            catch(InputMismatchException e){
                valorCorreto = false;
                System.out.println("Erro! Digite um number.");
                scan.nextLine();
            }
        }
        while(!(valorCorreto));
        

        //inputando segundo number
        do{
            try{
                System.out.print("\nDigite outro number: ");
                number2 = scan.nextDouble();
        
                //se o segundo number for igual a "0", lancamos uma exception
                if(number2.equals(0d)){
                    throw new ArithmeticException(); // lancamos uma exception
                }
    
                valorCorreto = true;
            }
            //se o usuário digitar uma String
            catch(InputMismatchException e){
                valorCorreto = false;
                System.out.println("Erro! Digite um number.");
                scan.nextLine();
            }
            //se o usuário tentar dividir por "0"
            catch(ArithmeticException e){
                valorCorreto = false;
                System.out.println("Erro! Não é possível dividir por 0. Escolhe outro número para dividir.");
                scan.nextLine();
            }
        }
        while(!(valorCorreto));
        

        //mostramos o resultado
        Double result = number1 / number2;
        
        System.out.println(String.format("%.0f / %.0f = %.2f", number1, number2, result));
        scan.close();
    }
}
```

O segredo é loopar de um por um:
- Crie o input do number1 e já faça o tratamento + while loop.
- Crie o input do number2 e já faça o tratamento + while loop.

Não vai tentar loopar no final. Sempre loop de poquinho em poquinho.

<br>

:bulb: Geralmente, usamos o `finally{}` para fechar objetos. Nesse caso, não precisamos usar.

<hr>
<br>

## Tratando uma exception genérica
Quando queremos tratar qualquer tipo de exception, vamos usar como parameter no `catch(){}` a class `Exception`. Ela consegue tratar qualquer erro, pois ela é pai das outras exceptions class(é só verificar a árvore [denovo](https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/0.introducao/introducao.md/#exception-tree-árvore-de-exceptions)).


:bulb: Se não soubermos qual o nome da class da da exception(erro), basta usar a class genérica `Exception` e dale.

Sempre que vamos tratar exceptions no nosso programa, vamos tratar uma por uma e depois tratamos as exceptions genéricas.

```java
try{
    System.out.println("Salve!");
}
catch(ArithmeticException e){
    //faça isso...
}
catch(InputMismatchException e){
    //faça isso....
}
catch(NullPointerException e){
    //faça isso...
}
catch(Exception e){
    // se for qualquer outro tipo de exception(erro), faça isso...
}
```

<img src="https://cdn-icons-png.flaticon.com/512/2810/2810051.png" alt="imagem" width="50px" align="center"> Primeiro tratamos as exceptions específicas e no final tratamos a genérica.

<hr>
<br>



<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/2.throws_throw_new/throws_throw_new.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>