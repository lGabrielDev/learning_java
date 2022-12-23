<h1 align="center">
    getters and setters
    <img src="https://cdn-icons-png.flaticon.com/512/2800/2800586.png" alt="image icon" width="90px" align="center">
</h1>

The Encapsulation serve para proteger attributes sensíveis dos usuários.

Para encapsular nossos attributes/variables, precisamos:

- Declare os attributes com o modifier `private`
- Criar `get` and `set` methods.


Assim, se quisermos acessar esses attributes em outra Class, usamos os **getters and setters methods com o modifier `public`.**


- `get method` --> Pegar/obter o valor de um attribute
- `set method` --> Setar/definir o valor de um attribute

<hr>
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="32px" align="center">

```java
<modifier> <retorno> methodName()
// se o retorno for 'void', sabemos que não terá retorno.
```

```java
//attributes
private String name = "Amanda";

//get
public String getName(){
    return this.name;
};

//set
public void setName(String name){
    this.name = name;
}
```

<hr>
<br>

## Praticando :pencil2:

1. Crie uma class "Pessoas" com os seguintes attributes:

    ```java
    public class Pessoas {
        //attributes
        private String name;
        private Integer age;
        private Double xp;
    }
    ```
    Não esqueca deixá-los como `private`.

<br>

2. Crie os getters and setters methods:
   ```java
        public class Pessoas {
        // attributes
        private String name;
        private Integer age;
        private Double xp;

        // constructors
            // Constructor vazio
        public Pessoas(){} 

            //Constructor preenchendo todos os attributes
        public Pessoas(String name, Integer age, Double xp){
            this.name = name;
            this.age = age;
            this.xp = xp;
        }

        // getters and setters
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return this.age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Double getXp() {
            return xp;
        }

        public void setXp(Double xp) {
            this.xp = xp;
        }

        //toStringMethod
        @Override
        public String toString() {
            return "Pessoas [name=" + name + ", age=" + age + ", xp=" + xp + "]";
        }

    }
   ```

   - Como o get method retorna o valor do attribute, precisamos informar o datatype do retorno (String,Integer,Double,Carro,Object,etc...).

   - Como no set method não retorna nenhum valor, deixamos o retorno como `void`.

<br>

3. Vá na class do main method , crie um objeto da class "Pessoas" , **set** o valor de todos os attributes e imprima com o `toString()`.
    
    ```java
    public class Programa{
        public static void main(String[] args){
            Pessoas p1 = new Pessoas();

            p1.setName("Paulo");
            p1.setAge(44);
            p1.setXp(45.53);

            System.out.println(p1.toString());
        }   
    }
    ```

<br>

4. Ao invés de setar um por um, crie um method lá na class "Pessoas" para setar todos os attributes de uma vez:

    ```java
    //class Pessoas
    public void setAllAttributes(String name, Integer age, Double xp){
            this.name = name;
            this.age = age;
            this.xp = xp;
        }
    // Criamos um method igual a um constructor. Easy!
    ```

    ```java
    //Class Programa
    public class Programa{
        public static void main(String[] args){
            Pessoas p1 = new Pessoas();

        p1.setAllAttributes("Maria", 52, 60.73);

            System.out.println(p1.toString());
        }   
    }
    ```

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/15.constructor_static/1.constructor.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>