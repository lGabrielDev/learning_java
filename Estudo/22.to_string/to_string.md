<h1 align="center">
    toString() method
    <img src="https://cdn-icons-png.flaticon.com/512/4384/4384901.png" alt="imagem" width="50px" align="center">
    <img src="https://cdn-icons-png.flaticon.com/512/3531/3531806.png" alt="image icon" width="90px" align="center">
</h1>

Por padrão, o method `toString()` retorna o hashcode de um objeto (o local da memória que esse objeto está armazenado).

Esse method vêm da class "Object". Como toda class no java é filha da class "Object", elas herdam esse method.

1. Crie uma class "Lutador" com alguns attributes.

    ```java
    public class Lutador {
        //attributes
        private String name;
        private Integer age;

        //constructors
        public Lutador(String name, Integer age){
            this.name = name;
            this.age = age;

        // getters and settters
        //...
        }
    }
    ```

<br>

2. Crie um objeto dessa classe. Depois, imprima esse objeto.
   
    ```java
    public class Programa{
        public static void main(String[] args){
            Lutador l1 = new Lutador("Anderson Siva",44);
            System.out.println(l1); // ou System.out.println(l1.toString()); 
    
            /* Output:
               Lutador@6ff3c5b5
            */
        }
    }
    ```
    Perceba que retornou o hashcode daquele objeto. Para retornar os attributes, precisamos sobreescrever o method `@Override`.

    <br>

    :bulb: Sempre que printamos um objeto, por baixo dos panos é chamado o method `toString()`. Então, não faz diferença... Podemos printar pelo nome do objeto ou pelo method `toString()`. É a mesma coisa.

<br>

3. Sobreponha o method `toString()` na class "Lutador". 

    ```java
    //toString method
    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %d",this.name, this.age);
    }
    ```

    Agora sim, ao invés de retornar o hashcode do objeto, vai retornar a representação desse objeto em String. Ou seja, vai retornar todos os attributes desse objeto.

    ```java
    public class Programa{
        public static void main(String[] args){
            Lutador l1 = new Lutador("Anderson Siva",44);
            System.out.println(l1); // ou System.out.println(l1.toString()); 
            
            /* Output:
                Name: Anderson Silva
                Age: 44
            */
        }
    }
    ```
<hr>
<br>

## Resumindo: <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- O method `toString()` retorna o hashcode do objeto.
- Para retornar todos os attributes de um objeto, basta sobrepor o method na Class filha `@Override`.
- Por baixo dos panos, quando chamamos o objeto, estamos chamando o `toString()` method.
  
   ```java
    System.out.println(objeto) // ou
    System.out.println(objeto.toString())

    // é a mesma coisa
    ```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/0.introducao/introducao.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>