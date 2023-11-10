<h1 align="center">
    throws and throw new
    <img src="https://cdn-icons-png.flaticon.com/512/3378/3378064.png" alt="image icon" width="90px" align="center">
</h1>

## throws

Quando estamos criando um method, e esse method pode gerar um tipo de erro (exception), precisamos tratar esse erro dentro daquele method ou lançar (`throws`) para outro method tratá-lo.

**throws an exception**.

```java
public Integer methodPadraozin() throws AritmeticException{}
public Integer methodPadraozin() throws AritmeticException{}
public Integer methodPadraozin() throws Exception{}
// etc...
```

Quando usamos o `throws` na declaracao de um method, estamos dizendo:

"Eu não vou tratar a exception aqui dentro. Quem vai tratar vai ser quem chamar o method."

Quando chamamos um method que contenha exceptions(erros), temos duas opções:
1. Tratar essas exceptions com o `try catch`.
2. Lançar(`throws`) novamente para outra pessoa tratar.

<br>

✏️
1. Crie um method que retorne uma divisão por 0. Obviamente vai dar erro.

2. Crie 3 methods, onde 1 vai passar o "B.O" para o outro. Até chegar no main method, que vai tratar essa exception.

  ```java
    public class Programa{
      
      //method1
      public static Integer mostrarResultado() throws Exception{
          return 5/0;
      }

      //method2
      public static Integer mostrarResultado2() throws Exception{
          return Programa.mostrarResultado();
      }

      //method3
      public static Integer mostrarResultado3() throws Exception{
          return Programa.mostrarResultado2();
      }

      //main method
      public static void main(String[] args) {
          try{
              System.out.println(Programa.mostrarResultado3());
          }
          catch(Exception e){
              System.out.println("Erro. Divisão por 0 não existe.");
          }
      }
  }
  ```

<br>
<hr>
<br>

## throw new
Usamos o `throw new` para criar uma exception customizada.

✏️ Crie um method, onde o usuário vai informar a idade. Se a idade for **menor que 18**, vamos lançar/criar uma exception.

```java
public class App{
    
    //main method
    public static void main(String[] args){
        checkAge(23);
    }

    //check age
    public static void checkAge(Integer age){
        if(age >= 18){
            System.out.println("Nice! You can buy a drink");
        }
        else{
            throw new ArithmeticException("Under 18 can't buy drinks...");
        }
    }
}
```

<br>
<br>

✏️ Crie um method, onde o usuário vai informar seu nome. Se o nome for maior que 5 characters, lance/crie uma exception.

```java
public class App{

    //main method
    public static void main(String[] args){
        checkNameLength("Patrick");
    }

    //check name length
    public static void checkNameLength(String name){
        if(name.length() > 5){
            System.out.println("Name length is too big");
        }
        else{
            System.out.println("Perfect name");
        }
    }
}
```

<br>
<br>

### Criando nossa própria exception class
Basta criar uma class que vai `extends` a superClass "Exception". Aí na hora de criar uma exception com o `throw new`, lancamos essa class que acabamos de criar.

✏️ Vamos criar o mesmo exemplo da idade. Se o usuário tiver **menos que 18 anos**, vamos lançar uma exception.

1. Crie um package "test" que vai armazenar todas as classes de exceptions que vamos criar.

<br>

2. Crie uma exception class "MenorDeIdadeException", e crie um constructor:

    ```java
    public class MenorDeIdadeException extends Exception{
        //constructor
        public menorDeIdadeException(String mensagem){
            super(mensagem);
        }
    }
    ```
    Agora temos nossa exception class.

    Perceba que chamamos o constructor do super.

    Agora, toda vez que instanciarmos um objeto da class "MenorDeIdadeException", vamos passar o argumento do constructor da superClass "Exception". Para acessar essa mensagem, é só usar o `getMessage()` method.

<br>
    

3. Crie um method, onde o usuário vai informar a idade. Se a idade for **menor que 18**, vamos lançar/criar a exception que criamos:

    ```java
    public class App{

        //main method
        public static void main(String[] args){
            try{
                checkAge(17);
            }
            catch(Under18Age e){
                System.out.println(e.getMessage()); //poderíamos ter chamado algum attribute desse objeto "e" que daria certo tambem
            }
        }

        //check name length
        public static void checkAge(Integer age) throws Under18Age{
            if(age >= 18){
                System.out.println("Maior de idade");
            }
            else{
                throw new Under18Age("Under 18 can't buy drinks");
            }
        }
    }
    ```

    - Lancamos (`throws`) o erro para o main method tratar. 
    
    📖 Lembrando, que ao invés de usarmos o constructor da super, poderíamos ter criado nosso próprio attribute para usar como mensagem de erro. Nas duas formas daria certo.


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/24.generics/generics.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>