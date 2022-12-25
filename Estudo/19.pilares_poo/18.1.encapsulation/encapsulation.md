<!--

Pilares da POO

1-encapsulation
2-inheritance(Herança)
3-polymorphism

------------------------------------------------------------------------------------------------------------------------------------------
(FAÇA)
encapsulation
É um recurso para proteger algum atributo

Para proteger esse atributo, eu deixo ele private e coloco dentro de um method.


Basicamente, eu deixo o attribute com o modifier private e o coloco dentro de um method. Isso é encapsulation.

Eu protejo meu attribute, encapsulando ele.
Assim, se eu quiser acessar ou modificar o attribute eu vou precisar usar os methods getters and setters.



this  -> Se refere ao objeto da classe atual
super -> Se refere ao objeto da super Class (Pai)


1- Crie uma class "Carro" com os attributes:
    //attributes
    String marca;
    String modelo;
    int ano;

2- Crie um constructor

public Carro(String marca,String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
}

3- Proteja os attributes, deixando eles como "private":
    //attributes
    private String marca;
    private String modelo;
    private int ano;


4- Crie os methods getters and setters, para voce poder acessar esses attributes de qualquer outra class:
    //getters and setters

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    etc...

5- Agora que eu tenho os methods getters and setters, eu posso alterar meu constructor.
-Chame os methods getters and setters no constructor.

    //constructor
    public Carro(String marca,String modelo, int ano){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

6- Crie um objeto dessa class e imprima todos os attributes;
    Carro c1 = new Carro("Chevrolet","Camaro",2000);

    System.out.println(c1.getMarca());
    System.out.println(c1.getModelo());
    System.out.println(c1.getAno());


Não apague
------------------------------------------------------------------------------------------------------------------------------------------------
(Faça)

Copiando os attributes de um objeto pra outro objeto

Use o mesmo exemplo acima.


1- Crie 2 objetos com valorer diferentes:
        Carro c1 = new Carro("Fiat","Uno",2004);
        Carro c2 = new Carro("Chevrolet","Camaro",2020);


5- Imprima os valores de cada um:
    System.out.println(c1.getMarca());
    System.out.println(c1.getModelo());
    System.out.println(c1.getAno());
    System.out.println("-------------");
    System.out.println(c2.getMarca());
    System.out.println(c2.getModelo());
    System.out.println(c2.getAno());


6- Copie os valores dos attributos do primeiro objeto para o segundo objeto.
Se eu fizesse assim:
    c2 =  c1;
    Eu estaria dizendo que..."O local onde o c2 está armazenado recebe o local onde o c1 está armazenado."

    Eu estaria copiando o valor de alocao do objeto, e não os attributos.


A maneira correta seria criar um method copy. Vamos lá!

7- Crie um method copy:
    public void copy(Carro carroCopiado){
        this.marca = carroCopiado.marca;
        this.modelo = carroCopiado.modelo;
        this.ano = carroCopiado.ano;
    }

O que eu estou dizendo é:
"O attribute 'marca' do objeto atual vai receber o attributo 'marca' do objeto parametro"

Quando eu chamar o method 'copy', eu estou dizendo:
"Todos os attributes desse objeto vao receber todos os attributes do objeto parametro"


8- Chame o method "copy" e copie os attributos do objeto 1 para o objeto 2:
    c2.copy(c1);

Sacou??

-Imprima novamente os attributes:
Viu?? Agora eles possuem os mesmos valores.


9-Outra forma, seria copiar diretamente no constructor

-Apague os dois objetos.
-Crie o primeiro objeto:
    Carro c1 = new Carro("Ferrari","F8",2020);

Beleza. Tenho 1 constructor para colocar os attributes.....


-Vamos criar outro constructor para copiar os attributes de um outro objeto.
Assim, eu posso escolher. Quando eu criar um objeto, eu posso escolher se vou preencher os attributes com valores novos, ou se vou copiar de um outro objeto.

    public Carro(Carro carroCopiado){
        copy(carroCopiado);
    }

Sacou??

10- Crie o segundo objeto e coloque o objeto que vc vai copiar
    Carro c2 = new Carro(c1);

11- Imprima os attributos do objeto 1 e do objeto 2;

Viu??? Voce copiou os attributos de um objeto e colocou em outro.


Outra maneira que daria certo, seria escrever o method copy diretamente no constructor:

    public Carro(Carro carroCopiado){
        this.marca = carroCopiado.marca;
        this.modelo = carroCopiado.modelo;
        this.ano = carroCopiado.ano;
    }


Mas... Criar o method copy é bem melhor.
Eu posso copiar os attributos de um no outro em qualquer momento, e não apenas na criacao do objeto.

-->