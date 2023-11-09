<h1 align="center">
    interface
    <img src="https://cdn-icons-png.flaticon.com/512/2666/2666501.png" alt="image icon" width="90px" align="center">
</h1>

## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">
`interface` é um contrato de regras que deve ser seguido por uma Class. A Class que implementar essa interface É OBRIGADA a utilizar todos os methods descritos no contrato.

💡 Uma Class pode implementar várias interfaces.

Para uma class implementar uma interface, vamos usar a keyword `implements`.

<hr>  
<br>

## Características de uma interface <img src="https://cdn-icons-png.flaticon.com/512/4384/4384901.png" alt="imagem" width="50px" align="center">

- Não podemos criar um objeto.

- Nao podemos ter constructors, obviamente porque nao podemos criar objetos.

- Os methods na interface são `abstract methods`. Ou seja, nao tem body `{}`. Quem vai criar o corpo desses methods é a class que implementar esse contrato.

- Por padrao, os methods são `abstract` (sem corpo) e `public`.

<hr>  
<br>

## Syntax <img src="https://cdn-icons-png.flaticon.com/512/1442/1442581.png" alt="curly braces icon" width="30px" align="center">
A syntax é igualzinho a criação de uma class. Só que ao invés de `class`, vamos usar `interface`.

### Criando uma class
```java
<modifier> class <ClassName>
public class Pessoas
```

### Criando uma interface
```java
<modifier> interface <InterfaceName>
public interface Gritos
```

<hr>  
<br>


## Implementando 1 interface

1. Crie uma interface "Animal", que será nosso contrato. Crie 2 methods nesse contrato.

    ```java
    public interface Animal {
        //methods do contrato
        public String barulho();
        public String mordida();
    }
    ```
<br>

2. Crie uma class "Cachorro" e implement os methods da interface/contrato.
   ```java
    public class Cachorro implements Animal{
        //attributes
        private String name;
        private String raca;

        //constructors
        public Cachorro(String name, String raca){
            this.name = name;
            this.raca = raca;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getRaca(){
            return this.raca;
        }
        
        public void setRaca(String raca){
            this.raca = raca;
        }

        //toString() method
        @Override
        public String toString(){
            return String.format("\n\nName: %s\nRaça: %s",this.name,this.raca);
        }

        //methods implementados da interface/contrato "Animal"
        @Override // essa annotation indica que o method abaixo veio de outro lugar. Seja de uma class que herdamos ou de um contrato/interface
        public String barulho() {
            return "AU AU!! Sou um cachorro latindo!! AU AU!!";
        }

        @Override
        public String mordida() {
            return "Estou mordendo sua perna. AU AU!";
        }
    }
   ```
   💡 A partir do momento que implementamos uma interface, a própria IDE(VS Code) nos ajuda dizendo que temos que implementar os methods do contrato. Aqui sim, devemos escrever o corpo `{}` desses methods.

<br>

3. Crie um objeto da class "Cachorro" no method main, e imprima os methods implementados:

    ```java
        public class Programa{
        public static void main(String[] args){
            Cachorro jake = new Cachorro("Jake","Husky");
            System.out.println(jake); //toString() method, é a mesma coisa.
            System.out.println(jake.barulho());
            System.out.println(jake.mordida());
        } 
    }
    ```
<hr>  
<br>

## Implementando multiple interfaces
Basta, separá-las por `,` (comma).
1. Crie mais 2 interfaces/contratos cada uma contendo apenas 1 method.

    ### interface2

    ```java
    public interface Interface2 {
        //methods do contrato
        public String cachorroMijando();
    }
    ```
    <br>

    ### interface3
    ```java
    public interface Interface3{
        //methods do contrato
        public String cachorroCorrendo();
    }
    ```

    ⚠️ Não esquece de importar o package da interface que for usar.

<br>

2. Implemente essas duas interfaces na class "Cachorro":

    ```java
    public class Cachorro implements Animal, Interface2, Interface3{
        //attributes
        private String name;
        private String raca;

        //constructors
        public Cachorro(String name, String raca){
            this.name = name;
            this.raca = raca;
        }

        //getters and setters
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getRaca(){
            return this.raca;
        }
        
        public void setRaca(String raca){
            this.raca = raca;
        }

        //toString() method
        @Override //Essa annotation diz que estamos implementando um method de outro lugar. Seja de uma interface, ou de uma class que herdamos.
        public String toString(){
            return String.format("\n\nName: %s\nRaça: %s",this.name,this.raca);
        }


        //methods implementados da interface/contrato "Animal"
        @Override
        public String barulho() {
            return "AU AU!! Sou um cachorro latindo!! AU AU!!";
        }

        @Override
        public String mordida() {
            return "Estou mordendo sua perna. AU AU!";
        }


        //methods implementados da interface/contrato "Interface2"
        @Override
        public String cachorroMijando(){
            return "Dog peeing";
        }


        //methods implementados da interface/contrato "Interface3"
        @Override
        public String cachorroCorrendo(){
            return "Run dog, run!";
        }
    }
    ```
<br>

3. Crie um objeto da class/tipo "Cachorro", e chame todos os methods implementados.

    ```java
    public class Programa{
        public static void main(String[] args){
            Cachorro c1 = new Cachorro("Jake","Husky");
            
            System.out.println(c1); //or c1.toString(); --> mesma coisa.
            System.out.println("\n" + c1.barulho() + "\n");
            System.out.println(c1.mordida() + "\n");
            System.out.println(c1.cachorroMijando() + "\n");
            System.out.println(c1.cachorroCorrendo() + "\n");
        } 
    }
    ```
<hr>  
<br>

## interface x abstract class

### `abstract class` 
- Uma class pode dar `extends` somente 1 vez. Podendo herdar apenas de 1 class.
- Podemos criar tanto methods com corpo, quanto `abstract methods` sem corpo `{}`.

<br>

### `interface`
- Uma class pode `implements` várias interfaces.
- Só podemos criar `abstract methods` sem corpo `{}`.

<br>

📖 Lembrando que todo `abstract method` DEVE ser sobreescrito. Nao importa se ele vem de uma interface ou de uma abstract class, o abstract method precisa ser chamado.


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/18.enum/enum.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>