<!--

1-Chamando um atributo de outra classe, sem precisar criar um objeto.

Syntax:
    ClassName.attribute;

-Crie uma class qualquer
    -Crie apenas 1 atributo static final. Ou seja, uma variable que terá o valor permanente(final) e poderá ser chamado sem precisar criar um objeto(static).

        static final String nome = "jake";

    Perceba que eu precisei inicializar a variable com algum valor. Isso porque estou definindo uma variable como final. Ela precisa ter algum valor, já que não podera ser alterado esse valor. È um variable final.


-Imprima esse atributo no method main

    public static void main(String[] args){
        System.out.println(Animal.nome);
    }

static -> Objetos dessa class compartilham o mesmo attribute e voce nao precisa criar um objeto para chamá-lo.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------


enum - Enumeradores
enum -> É um conjunto(set) de valores fixos;

Constantes -> São final variables. Ou seja, são variaveis onde o valor não vai mudar.
Ex: dias da semana(SEGUNDA,TERCA,QUARTA,ETC....)

Sempre que for criar uma constante(final variable) eu coloco com letras MAIÚSCULA(UPPERCASE).


O enum é utilizado quando eu tenho tipos de dados que nao vao ser alterados;

Ex:
Se eu criar uma class onde um dos attributes é o genero da pessoa...

Gênero só existe 2 (M,F); Então.... esse attribute, eu colocaria com o datatype enum;

Ex:
Uma class onde um dos attributes é a classe do personagem:
Classes sao definidas... Warrior,mage,ninja,etc... São valores fixos;

Sacou???




Syntax:
    public enum nomeTal{}

Percebe que, para criar um enum eu faço a mesma coisa como se tivesse criando uma class ou uma interface.

Vamos criar um enum:

1- Crie um arquivo enum (como se estivesse criando uma class)

    public enum Level {
    
    }

2- Coloque as constantes (final variables)

    public enum Level {
    LOW,MEDIUM,HIGH
}

3- Deixe mais organizado

public enum Level {
    LOW,
    MEDIUM,
    HIGH
}


Por padrão, todas as constantes do enum já vem como public static final;



4- Crie um objeto do tipo enum
    Level l1 = Level.LOW;

Com enum eu NÃO uso o "new"; Apenas escreve enumName "." atributo que eu quero pegar.

enum não é um objeto, onde eu uso o "new";
enum é um enum.


5-Imprima essa variable:
    Level l1 = Level.LOW;
    
    System.out.println(l1);


6- Crie um switch case para essa variable;
    Se ela for igual a constante tal da enum faça isso
    Se ela for igual a constante tal da enum faça aquilo, etc...

    switch(l1){
        case LOW:
            System.out.println("É level baixo");
            break;
        case MEDIUM:
            System.out.println("É level médio");
            break;
        case HIGH:
            System.out.println("É level alto");
            break;
}

Easy!



7- Apague tudo e crie esse enum na mesma class do programa principal:

public class App{
    //enum
    public enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        Level l1 = Level.LOW;
        System.out.println(l1);
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Exemplo 2:
1-Crie um arquivo enum com 3 constantes(final variables)

   public enum Level {
    //constantes
    LOW,
    MEDIUM,
    HIGH
}


2-Crie uma class que vai conter apenas 1 atributo. Esse atributo vai ser do tipo do enum criado.
    public class Personagem {
    // attributes
    Level forca;
}
    Esse atributo é do tipo enum "Level". Ou seja, ele só pode ter 3 valores(LOW,MEDIUM,HIGH);

    Se eu colocar int vai dar bosta, se eu colocar String vai dar bosta.
    Ele é um atributo do tipo enum "Level";



3- Crie um construtor nessa class. Assim que eu instanciar um objeto "Personagem" eu atribua um valor a esse atributo.

public class Personagem {
    // attributes
    Level forca;

    //constructor
    public Personagem(Level forca){
        this.forca = forca;
    }
}



4- Crie um objeto do tipo Personagem e atribua um valor no construtor
    Personagem goku = new Personagem(Level.HIGH);

5- Imprima o artibuto do objeto:
        System.out.println(goku.forca);

Percebeu o quao importante é o enum???

(só imagine, não precisa fazer)
Imagina que voce criou uma class "Personagem" e lá tem um atributo "classePersonagem";

Se eu criar um enum com apenas 3 classes (NINJA, WARRIOR, MAGE);
Somente essas constantes podem ser atribuidas a esse atributo. Sacou???



Outro exemplo:
Imagine que eu criei uma class "Pessoa" e essa classe tem o atributo "genero".

São apenas 2 generos(MASCULINO, FEMININO)
Então, eu crio um enum com essas duas constantes.

Aí, esssa variable "genero" só poderá ser atribuído essas 2 constantes.


Se ligou????


-Faça esse exemplo do genero.
    Pessoa p1 = new Pessoa("Gabriel",25,Genero.MALE);
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Atribuindo valor pra cada constante

Crie um enum onde vai ter algumas constantes "veiculos". Cada veiculo vai ter uma velocidade.


1- Crie um enum "Veiculos" onde terá apenas 3 constantes.
public enum Veiculos {
    //constants
    BIKE,
    CAR,
    JATO
}


2- Atribua um valor para cada constante
    //constants
    BIKE(40),
    CAR(500),
    JATO(7000)


3-Crie um atributo com o mesmo tipo de dado da constant.
    int speed;



4-Crie um construtor.

    private Veiculos(int speed){
        this.speed = speed;
    }

Perceba que o modifier está "private".
No enum, o constructor tem o modifier sempre em "private";

"O meu atributo 'speed' vai receber o parametro 'speed'."
Esse parametro automaticamente é informado quando eu uso a constante.
Lembra? 

BIKE(40),
CAR(500),
JATO(7000);

Esse valor entre parenteses é o construtor.
Quando eu crio uma constante e passo o constructor, é como se eu tivesse criando um objeto enum e estabelecendo os argumentos, sacou?







5- Crie um objeto enum no method main e imprima a consante e o valor dessa constante
    Veiculos v1 = Veiculos.BIKE;

    System.out.println(v1);
    System.out.println(v1.speed);




-Apague tudo


6-
-Crie um enum com 2 constantes (HEROI,VILAO)
-Atribua uma String no construtor de cada constant
-Crie uma variable com o mesmo tipo do constructor
-Crie o constructor

    public enum Personagem {
    //constants
    HEROI("bonzinho"),
    VILAO("do mal");

    //attributes
    String status;

    //constructor
    private Personagem(String status){
        this.status = status;
    }
}

Perceba que o modifier do constructor está "private".
No enum, o constructor tem o modifier sempre em "private";


-Crie um objeto do tipo enum criado
    public static void main(String[] args){
        Personagem p1 = Personagem.HEROI;

        System.out.println(p1);
        System.out.println(p1.status);
    }



O enum funciona quase igual uma classe...
A diferenca é que eu posso ter constantes (final variables). Por isso que eu passo os attrirbutos delas alí no enum mesmo, e não quando eu crio um objeto enum.

Quando eu crio uma constante com (), eu estou instanciando ali mesmo.

Na enum, eu passo os argumentos do constructor ali mesmo. Diferente da class, que eu passo quando crio um objeto.

-Apague tudo




Se ligou????

Quando eu instancio um objeto de uma class eu passo o construtor no method main

O construtor do enum é diferente. Eu passo direto no enum.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
(IMPORTANTE... faça!)

Criando vários constructor

Vamos criar um enum, ou seja.... Variables com valores já setados e que eu sei que não vai mudar.



A ideia é criar um enum com classes de um jogo (mago,warrior,lancer,gunner).

1- Crie um enum "ClassesPersonagem";
2- Crie as constants (variaveis com valor final que nao vai mudar)
    //constantes
    WARRIOR,
    NINJA,
    MAGE,
    GUNNER;

3- Agora, crie os attributes que toda classe possui.

    String weapon;
    int forca;
    int defesa;
    String regiao;



4- Crie o constructor
    //constructors

    private ClassesPersonagem(String weapon, int forca,int defesa, String regiao){
        this.weapon = weapon;
        this.forca = forca;
        this.defesa = defesa;
        this.regiao = regiao;
    }


Lembre-se que o modificador do constructor enum é SEMPRE private;

5- Passe os argumentos desse constructor nas constants:
    //constantes
    WARRIOR("Sword and shield", 5,8,"Palácio"),
    NINJA("Katana",7,6,"Templo sombrio"),
    MAGE("Bastao",8,3,"Templo da luz"),
    GUNNER("Metralhadora",8,3,"City");

Easy!


-Boas práticas....
-Deixe todos os attributes como private e crie os getters and setters


6- Agora, vamos criar uma class "Personagem";

7- Crie os attributes:
    //attributes
    String name;
    Integer age;
    ClassesPersonagem classe;

Perceba que eu criei um attributo do tipo enum, ou seja.... Só será permitido aquelas classes do enum... Sacou??
Eu LIMITO  o que pode ser escrito ali. SACOU??




8- Boas práticas... Coloque o modifier private e crie os getters and setters;


9- Crie o constructor:
     //constructors
        public Personagem(String name, int age, ClassesPersonagem classe){
            this.name = name;
            this.age = age;
        }

10- Crie um objeto "Personagem" e imprima todos os attributes:

        Personagem p1 = new Personagem("Pedrin11", 16, ClassesPersonagem.GUNNER);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getClasse());

        System.out.println("\t"+p1.getClasse()+":");
        System.out.println(p1.getClasse().getWeapon());
        System.out.println(p1.getClasse().getForca());
        System.out.println(p1.getClasse().getDefesa());
        System.out.println(p1.getClasse().getRegiao());
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-->