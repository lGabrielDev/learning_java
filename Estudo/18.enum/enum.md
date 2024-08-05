<h1 align="center">
    enum
    <img  src="https://cdn-icons-png.flaticon.com/512/7627/7627943.png" alt="blueprint icon" width="100px" align="center">
</h1>

## constants
- `constant` --> **final variable** (variables que não podem ter o valor alterado). Não podemos atribuir outro valor a essa variable pois elas já possuem um valor final setado.

<br>

✏️ Crie uma ****final variable****, e tente alterar o valor dela.
```java
public class Programa{
    public static void main(String[] args){
        final String name = "Gabriel";
        name = "Paulo"; // not possible
    }
}
```
<br>

### Exemplos de constants:

- Dias da semana (MONDAY, TUESDAY, WEDNESDAY, etc...)
- Elos no lol (BRONZE, SILVER, GOLD etc...)
- Classes do mmorpg (ASSSASIN, GUNNER, WARRIOR, NINJA, ARCHER, etc...)
- Armas de um mmorpg (SWORD, SWORD AND SHIELD, KATANA, etc...)
- Gênero/gender (MALE, FEMALE)
  
Se ligou?? São valores fixos, que não podem ser alterados.

⚠️ Como boa prática, escrevemos o nome de uma **constant** em UPPERCASE LETTERS.

<br>
<hr>

## enum

`enum` é uma class que representa um grupo de **constantes**.

Funciona igualzinho a uma class, contendo attributes, constructors, getters and setters methods e outros methods. A diferença é que podemos ter constants (`static final variables`).

Use **enums** quando tiver valores que você sabe que não vão mudar, como dias do mês, dias, cores, baralho de cartas, etc.

<br>

Da mesma forma que criamos uma **class** ou uma **interface**, vamos criar uma **enum**.

<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">
A syntax é igualzinho a criação de uma class ou uma interface. Só que ao invés de `class`, vamos usar `enum`.

### Criando uma class
```java
<modifier> class <ClassName>
public class Pessoas{}
```

### Criando uma interface
```java
<modifier> interface <InterfaceName>
public interface Gritos{}
```

### Criando uma enum de constants
```java
<modifier> enum <EnumName>
public enum Weapons{}
```

💡 Nome de Class sempre em MAIÚSCULO.

<br>

- Nome de `Class`, `Interface`, `Enum` --> MAIÚSCULO
- Nome de `variables`/`attributes`/`objects`/`methods`/ --> minúsculo

<hr>
<br> 

## Características da enum class <img src="https://cdn-icons-png.flaticon.com/512/4384/4384901.png" alt="imagem" width="50px" align="center">

- Possui o mesmo conteúdo de uma class comum. Porém, contêm as CONSTANTS (`static final variables`). Ou seja, variables de valor final, que referenciamos pela Class(``in a static way``).

- O constructor da enum class é sempre `private`.

- Na enum, passamos os argumentos do constructor da constant ali mesmo. Diferente da class normal, que passamos quando criamos o objeto.


<hr>  
<br>


## Utilizando uma enum em uma class

✏️ Vamos criar uma class "Person" onde um dos attributes será o "gender". Esse attribute "gender" será do tipo enum.

1. Crie uma enum contendo as constants:
   - Male
   - Female

    ```java
    public enum Gender {
        //constants
        MALE,
        FEMALE;

        //attributes
        
        //...

    }
    ```

<br>

2. Crie uma class "Person", onde um dos attributes será do tipo "Gender".

    ```java
    public class Pessoa {
        //attributes
        private String name;
        private Integer age;
        private Gender gender; // DALE

        //constructors
        public Pessoa(String name, Integer age, Gender gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Gender getgender(){
            return this.gender;
        }

        public void setgender(Gender gender){
            this.gender = gender;
        }

        //toString method
        @Override
        public String toString(){
            return String.format("\n\nName: %s\nAge: %d\nGênero: %s",this.name,this.age,this.gender);
        }
    }
    ```

<br>

3. Crie um objeto "Pessoa" e imprima todos os attributes.

    ```java
    public class Programa{
        public static void main(String[] args){
            Pessoa p1 = new Pessoa("Gabriel",25,Gender.MALE);
            System.out.println(p1.toString()); // ou apenas System.out.println(p1);
        }
    }
    ```
    💡 Perceba que passamos o parâmetro "gender" do tipo "Gender" in a static way (diretamente pela class).

<hr>
<br>

## Atribuindo um valor para uma constant
Igualzinho a uma class normal, aqui na **enum** class também podemos criar **attributes**, **constructors**, **getters and setters** e **methods**.

A diferença é que aqui passamos os argumentos diretamente dentro das constants. É como se as constants fossem objetos, sacou??


- Em uma class comum, o method constructor é chamado assim que criamos um objeto.

- Na enum class é diferente. O method constructor é chamado dentro da enum class, quando declaramos uma constant.


:pencil2:

1.  Crie uma enum class "Veiculos"  contendo 3 constants:

- BIKE
- CAR
- JATO

    ```java
    public enum Veiculos {
        //constants
        BIKE,
        CAR,
        JATO;

        //attributes

        //constructors

        //getters and setters

        //toString method
    }
    ```
    <br>

    Vamos dizer, que queremos saber a velocidade de cada veículo.

2. Vamos atribuir um valor a essas constants. Cria um attribute e faça todo o procedimento que voce faria em uma class normal. Crie o constructor, getters and setters, etc...

    ```java
    package Classes.enums;

    public enum Vehicles {
        //CONSTANTS
        BIKE("bike", "bike é insana para ir ao trabalho sem gastar dinheiro", 60),
        CAR("car", "car é insano para ter conforto", 200),
        JATO("airplane", "airplane é insano para olhar para o céu", 400);

        //attributes
        private final String name; //como são variables que não vao mudar o valor, deixamos como final mesmo.
        private final String description;
        private final Integer maxSpeedInKmPerHr;

        //constructors
        private Vehicles(String name, String description, Integer maxSpeedInKmPerHr){
            this.name = name;
            this.description = description;
            this.maxSpeedInKmPerHr = maxSpeedInKmPerHr;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public String getDescription() {
            return description;
        }

        public Integer getMaxSpeedInKmPerHr() {
            return maxSpeedInKmPerHr;
        }

        //toString()
        @Override
        public String toString(){
            return
                String.format(
                    "Vehicle name: %s\n" +
                    "Description: %s\n" +
                    "Max Speed in km/h: %d\n", this.name, this.description, this.maxSpeedInKmPerHr
                );
        }
    }
    ```

💡 Quando criamos uma constant e passamos os argumentos do constructor, é como tivessemos criando um objeto enum e estabelecendo os argumentos, sacou?

Se ligou?? A constant funciona igualzinho a um objeto. Se criamos um constructor, somos obrigados a preencher os argumentos desse objeto.


Easy! 😎


<hr>
<br>


## Atribuindo valores para multiple constants
Imagina um **mmorpg(WOW, tera, etc...)**, onde o usuário vai criar um personagem pra ele jogar. Um dos attributes desse personagem é a "classeDoPersonagem". Esse attribute será do tipo **enum class**, ou seja, só temos algumas classes para o jogador escolher.

<br>

1. Crie uma **enum class** para armazenar todos as classes do nosso mmorpg:

- Warrior
- Ninja
- Mage

    ```java
    public enum FightClass{
        //CONSTANTS
        WARRIOR("Warrior", "castelo da luz", 5, 10),
        GUNNER("Gunner", "Piltover", 9, 4),
        NINJA("Ninja", "floresta das sombras", 7, 5);

        //attributes
        private final String name;
        private final String region;
        private final Integer strength;
        private final Integer defense;

        //constructors
        private FightClass(String name, String region, Integer strength, Integer defense){
            this.name = name;
            this.region = region;
            this.strength = strength;
            this.defense = defense;
        }
        
        //getters --> Apenas os getters, porque na teoria esses valores 'final' não podem mudar
        public String getName() {
            return name;
        }

        public String getRegion() {
            return region;
        }

        public Integer getStrength() {
            return strength;
        }

        public Integer getDefense() {
            return defense;
        }

        //toString()
        @Override
        public String toString() {
            return
                String.format(
                    "Name: %s\n" +
                    "Region %s\n" +
                    "Strength name: %d\n" +
                    "Defense: %d\n", this.name, this.region, this.strength, this.defense
                );
        }
    }
    ```
    Perceba que nós passamos os argumentos do constructor diretamente nas constants.

    Sempre que um usuário escolher a class "Warior", os attributes dessa class já estão setados. Se ligou??

<br>

2. Cria uma class "Personagem", que represente a conta de um usuário no "WOW".

    ```java
    package Classes.enums.mmoExample;

    public class Player {

        //attributes
        private String name;
        private String email;
        private FightClass fightClass; //Como só existe um número limitado de classes, usamos o enum

        //constructors
        public Player(String name, String email, FightClass fightClass){
            this.name = name;
            this.email = email;
            this.fightClass = fightClass;
        }

        //getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public FightClass getFightClass() {
            return fightClass;
        }

        public void setFightClass(FightClass fightClass) {
            this.fightClass = fightClass;
        }

        //toString()
        @Override
        public String toString() {
            return
                String.format(
                    "Name: %s\n"+
                    "Email: %s\n"+
                    "Class: %s\n", this.name, this.email, this.getFightClass().getName()
                );
        }
    }
    ```
<br>

3. Crie um objeto "Personagem" e passe os argumentos do constructor.

    ```java
    public class App{

        public static void main(String[] args){
            FightClass f1 = FightClass.NINJA;

            Player p1 = new Player(
                "rodolfin123",
                "rodolfin123@gmail.com",
                f1
            );


            //ou, passamos o enum direto:
            
            Player p2 = new Player(
                "mariazinha123",
                "mariazinha123@gmail.com",
                FightClass.WARRIOR
            );

            System.out.println(p1.toString());
            System.out.println(p1.getFightClass().toString() + "\n");

            System.out.println(p2.toString());
            System.out.println(p2.getFightClass().toString() + "\n");
            }
    }
    ```

    O procedimento de criar um constructor e passar os argumentos é igualzinho a de uma class comum. Só que aqui na enum class, passamos os argumentos assim que declaramos a constant. As constants sao nossas instancias.

    <br>

    📖 É só pensar assim... Na enum class, criamos os attributes como se fosse em uma class normal. Só que aqui, nós instanciamos os objetos diretamente na propria enum class. Sendo as constants nossas instancias de objetos. 😎

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/19.pilares_poo/18.1.encapsulation/encapsulation.md">
  <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>