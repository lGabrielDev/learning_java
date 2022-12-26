<h1 align="center">
    Encapsulation (getters and setters)
    <img src="https://cdn-icons-png.flaticon.com/512/2800/2800586.png" alt="encapsulation icon" width="90px" align="center">
</h1>

## Pilares da POO <img src="https://cdn-icons-png.flaticon.com/512/2058/2058008.png" alt="image icon" width="32px" align="center">

Na programação orientada a objetos, existem 3 pilares:

- **Encapsulation**
- Inheritance(Herança)
- Abstraction
- Polymorphism

<hr>
<br>

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

<hr>
<br>


## Copiar os attributes de um objeto para outro objeto <img src="https://cdn-icons-png.flaticon.com/512/1834/1834056.png" alt="files icon" width="50px" align="center">

Se fizéssemos assim:
```java
c2 = c1; // ERRADO
```
No exemplo acima, o local onde o `c2` está armazenado recebe o local onde o `c1` está armazenado.

A maneira certa de copiar attributes de um objeto e passar para outro seria criando um method `copy()`.

<br>

1. Crie uma class "Pessoa":
    ```java
    public class Pessoa {
        //attributes
        String name;
        Integer age;
        String country;

        //constructor
        public Pessoa(String name, Integer age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }

        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }


        //toString() method
        @Override
        public String toString(){
            return String.format("Name: %s\nAge: %d\nCountry: %s",this.name,this.age,this.country);
        }
    }
    ```
<br>

2. Crie o method `copy();`

    ```java
    //copy() method
    public void copy(Pessoa objetoCopiado){
        this.name = objetoCopiado.getName();
        this.age = objetoCopiado.getAge();
        this.country = objetoCopiado.getCountry();
        //O attribute do objeto atual recebe o attribute do objeto informado no parâmetro
    }
    ```

    Quando chamamos esse method `copy()`, estamos dizendo: "Os attributes do objeto atual, vao receber os attributes do objeto informado no parâmetro."

<br>

1. Crie 2 objetos com valores dos attributes diferentes. Depois, copia os attributes de um para o outro. No final, os 2 objetos vao ter os mesmos valores nos attributes.

    ```java
        public class Programa{
        public static void main(String[] args){
            Pessoa p1 = new Pessoa("Paulo",44,"Brazil");
            Pessoa p2 = new Pessoa("Amanda",35,"USA");

            //valores dos attributes diferentes
            System.out.println(p1.toString() + "\n");
            System.out.println(p2.toString());

            //copiamos os attributes 
            p1.copy(p2);
            System.out.println("\n\n");

            //valores dos attributes iguais
            System.out.println(p1.toString() + "\n");
            System.out.println(p2.toString());
        } 
    }
    ```


<br>
<br>

## Copiando direto no constructor
Outra forma de copiar attributes de um objeto para outro objeto seria utilizando o constructor. Assim que criarmos um objeto, podemos passsar os argumentos padraozin **OU podemos passar um objeto.**

1. Crie mais um constructor na class "Pessoa"

    ```java
    public Pessoa(Pessoa objetoCopiado){
            this.name = objetoCopiado.name;
            this.age = objetoCopiado.age;
            this.country = objetoCopiado.country;
        }
    ```

    Agora, assim que criamos um objeto, temos a opção de passar um objeto.

<br>

2. Crie mais um objeto e copie os attributes de outro objeto.

    ```java
    public class Programa{
        public static void main(String[] args){
            Pessoa p1 = new Pessoa("Paulo",44,"Brazil");
            Pessoa p2 = new Pessoa(p1);

            System.out.println(p1.toString());
            System.out.println("\n");
            System.out.println(p2.toString());
        }
    }
    ```

    :bulb: É legal ter os dois tipos. 

    - Criando um constructor, podemos copiar um objeto assim que criamos um objeto.
    - Criando um method `copy()` podemos copiar os attributes de um objeto a qualquer momento.

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/19.pilares_poo/18.2.heranca/1.heranca.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>