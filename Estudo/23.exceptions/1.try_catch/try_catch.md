<h1 align="center">
    try catch
    <img src="https://cdn-icons-png.flaticon.com/512/576/576509.png" alt="image icon" width="90px" align="center">
</h1>

Sempre que acontece uma exception(erro), o programa é finalizado e o restante do código não é executado. Para o programa continuar funcionando, precisamos tratar essas exceptions.

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

✏️ Crie uma array de 5 posicoes e tente atribuir um valor na posicao 200. Não vai dar, porque a posicao 200 não existe nessa array. Trate esse erro com o `try catch`:

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

💡 Como boas práticas, o nome do objeto da class Exception sempre vai ser `e` .

<br>

💡 Sempre que popar uma exception(erro) no seu programa e mostrar de qual classe ela pertence, usamos ela como parameter no `catch`.


<hr>
<br>

## Tratando multiple exceptions
Para tratar várias exceptions(erros), basta usar vários `catch(){}`. Cada um vai tratar um tipo de erro.

<br>

✏️ Crie um programa onde o usuário vai dividir um número por outro. Depois, trate as exceptions:

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
        Integer number1 = 0;
        Integer number2 = 0;

        number1 = number1Input(scan, number1);
        number2 = number2Input(scan, number2);
        
        //result
        Integer result = number1 / number2;
        System.out.println(String.format("%d / %d = %d", number1, number2, result));
        scan.close();
    }
    

    //number1 input
    public static Integer number1Input(Scanner scan, Integer number1){
        Boolean correctInput = false;
        do{
            System.out.print("Number 1: ");
            try{
                number1 = scan.nextInt();
                correctInput = true;
            }
            //if the user input Strings
            catch(InputMismatchException e){
                System.out.println("Please, type a number; \n");
                correctInput = false;
                scan.nextLine();
            }
        }
        while(!(correctInput));
        return number1;
    };
    
    
    //number2 input
    public static Integer number2Input(Scanner scan, Integer number2){
        Boolean correctInput = false;
        do{
            System.out.print("Number 2: ");
            try{
                number2 = scan.nextInt();
                //division / 0
                if(number2 == 0){
                    throw new ArithmeticException(); //lancamos um erro
                }
                else{
                    correctInput = true;
                }
            }
            //if the user input Strings
            catch(InputMismatchException e){
                System.out.println("Please, type a number; \n");
                correctInput = false;
                scan.nextLine();
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero not allowed\n");
                correctInput = false;
                scan.nextLine();
            }
        }
        while(!(correctInput));
        return number2;
    };
}
```

O segredo é loopar de um por um:
- Crie o input do number1 e já faça o tratamento + while loop.
- Crie o input do number2 e já faça o tratamento + while loop.

Não vai tentar loopar no final. Sempre loop de poquinho em poquinho.

Perceba que foi criado um method para cada input. Sempre separe seu código em vários methods. Assim, fica mais fácil de entender e de dar manutenção.

<br>

💡 Geralmente, usamos o `finally{}` para fechar objetos. Nesse caso, não precisamos usar.

<hr>
<br>

## Tratando uma exception genérica
Quando queremos tratar qualquer tipo de exception, vamos usar como parameter no `catch(){}` a class `Exception`. Ela consegue tratar qualquer erro, pois ela é pai das outras exceptions class(é só verificar a árvore [denovo](https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/0.introducao/introducao.md/#exception-tree-árvore-de-exceptions)).


💡 Se não soubermos qual o nome da Class da exception(erro), basta usar a class genérica `Exception` e dale.

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


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/2.throws_throw_new/throws_throw_new.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>