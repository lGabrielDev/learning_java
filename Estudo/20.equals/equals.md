<h1 align="center">
    Equals
    <img src="https://cdn-icons-png.flaticon.com/512/1355/1355233.png" alt="image icon" width="90px" align="center">
</h1>


- `==` --> Usado para comparar primitive datatypes(int,long,short,boolean,double,etc...)
- `.equals();` --> Usado para comparar objetos(String,Integer,Double,Pessoas,etc...)

```java
// == -> compara primitive types
int number1 = 50;
int number2 = 50;

System.out.println(number1 == number2); //TRUE
```

```java
// .equals() -> compara objetos
String texto1 = new String("arroz");
String texto2 = new String("arroz");

System.out.println(texto1.equals(texto2)); //TRUE
```
:bulb: Sempre que instanciamos um objeto com o `new`, vamos usar o `.equals()` para comparar.

<hr>
<br>

## Comparando objetos de uma class que criamos
Sempre que usamos o `.equals` para comparar objetos de uma class que criamos("Pessoa", "Jogador", "Animal", etc...), o que é comparado é o local da memória em que esses objetos estão armazenados. Cada objeto fica armazenado em um local diferente. Portanto, sempre vai retornar FALSE.


Por padrão, toda class do java é filha da class `"Object"`. Então, quando criamos uma class "Pessoa", ela insta tem relação de herança com a superClass "Object". Assim, a class "Pessoa" vai herdar o method `.equals` da classe pai "Object".

Assim, nós podemos sobreescrever o method `.equals` da classe pai "Object" e setar qual ou quais os attributes que vamos comparar.

<hr>
<br>

## Comparando apenas 1 attribute
Um objeto só vai ser igual a outro, se esse attribute for igual.

1. Crie uma class "Pessoa" com 2 attributes ("name", "age"). Crie bonitinho, com os getters and setters, constructor, etc...

<br>

2. Vamos sobreescrever o method `.equals()` da class pai "Object":
    
    ```java
    public class Pessoa {
        //attributes
        private String name;
        private Integer age;

        //constructors
        public Pessoa(String name, Integer age) {
            this.name = name;
            this.age = age;
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


        //.equals() method da class pai "Object"
        @Override
        public boolean equals(Object obj) {
            Pessoa p = (Pessoa) obj;
            
            if(this.name.equals(p.name)){
                return true;
            }
            return false;
        }
    }
    ```

    Entendendo o method:
    - Implementamos o abstract method `.equals()` da classe pai "Object". :bulb: Use a IDE para implementar:bulb:.
  
    - Esse method retorna um valor booleano.
    
    - Esse method têm como parâmetro um objeto da class "Object". Como queremos comparar um objeto da class "Pessoa", precisamos castar esse objeto. Precisamos tranformar ele em um objeto "Pessoa".

    - Criamos um objeto "Pessoa" chamado "p", que recebe o objeto informado no parâmetro transformado para a class "Pessoa". Agora sim, podemos fazer a lógica de comparação.

    - Se o attribute "name" do objeto atual for igual ao attribute "name" do objeto informado no parâmetro, eles são iguais, retornamos true. Easy! :sunglasses:


<br>

3. Crie 2 objetos com o mesmo attribute "name" e compare esses objetos usando o method .`equals()`.

    ```java
    public class Programa{
        public static void main(String[] args){
            Pessoa p1 = new Pessoa("Paulo", 40);
            Pessoa p2 = new Pessoa("Paulo", 20);

            System.out.println(p1.equals(p2)); // TRUE
        }
    }
    ```
    Perceba que mesmo eles tendo a idade diferente, eles são considerados objetos iguais. Nós que decidimos qual será o attribute que vamos comparar.

<hr>
<br>

## Comparando outro attribute
Um objeto só vai ser igual a outro, se esse attribute for igual.
Ao invés do attribute "name", use o attribute "age" para comparar.

```java
//.equals() method da class pai "Object"
@Override
public boolean equals(Object obj) {
    Pessoa p = (Pessoa) obj;
    
    if(this.age.equals(p.age)){
        return true;
    }
    return false;
}  
```
Agora, se os objetos "Pessoa" tiverem a mesma idade, eles serão considerados objetos iguais.

<hr>
<br>


## Comparando todos os attributes
Um objeto só vai ser igual a outro se todos os attributes forem iguais.

```java
//.equals() method da class pai "Object"
@Override
public boolean equals(Object obj) {
    Pessoa p = (Pessoa) obj;
    
    if(this.name.equals(p.name) && this.age.equals(p.age)){
        return true;
    }
    return false;
} 
```

Dois objetos da classe "Pessoa" só serão iguais ser tiverem todos os attributes iguais. 

<hr>
<br>

## Criando nosso próprio method .equals()
Ao invés de sobreescrever o method `.equals`, nós podemos criar nosso próprio method de comparação. Como era um method implementado, nós não podíamos alterar o tipo do objeto do parâmetro. Agora que vamos criar nosso próprio, podemos.

```java
// method igual o .equals()
public Boolean saoIguais(Pessoa obj){
    if(this.name.equals(obj.name)){
        return true;
    }
    return false;
}
```

Não precisamos castar, pois o objeto do parâmetro já é da mesma Classe do objeto atual. :alien:

<br>
<br>

<!-- Botão para próxima página -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/21.methods/1.method.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>