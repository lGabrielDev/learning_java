<h1 align="center">
    <span>Comparator</span>
    <img src="https://cdn3.iconfinder.com/data/icons/flat-design-spreadsheet-set-5/24/sort-za-512.png" alt="icon" width="90px" align="center">
</h1>


Sempre que quisermos ordenar/comparar objetos complexos (Pessoa, Casa, Carro, Endereco,etc...) precisamos usar o Comparator.


Imagine o seguinte:

```java
public static void main(String[] args){
    List<Integer> numbers = Arrays.asList(70,55,98,13,8,60);
    
    //lista original
    System.out.print("\nlista original:");
    for(Integer i : numbers){
        System.out.print(" " + i + "  "); //70   55   98   13   8   60 
    }

    Collections.sort(numbers); //ordenamos

    //lista ordenazdinha
    System.out.print("\nlista ordenada:");
        for(Integer i : numbers){
        System.out.print(" " + i + "  "); //8   13   55   60   70   98
    }
}
```

Pô, tranquilo. Como são objetos Integers e possuem apenas 1 attribute, o java consegue fazer a ordenacao de boas.


Mas, e se tivêssemos um objeto complexo(Pessoa, Carro, Endereco, etc...)? Por qual attribute o java iria ordenar??

A resposta é simples. Ele não consegue. Nós precisamos informar qual é o attribute que queremos comparar.


<hr>
<br>

## Comparator
Antes de entender como o comparator funciona, crie uma Class "Pessoa" com os seguintes attributes:

```java
private String name;
private Integer age;
private Gender sexo; //Enum
private Double salary;
```

<br>

Perceba que temos um objeto complexo, contendo vários attributes. O java não consegue identificar qual vai ser o attribute que vamos usar para ordenar. Por isso, precisamos criar nossas Classes Comparators.

O interessante é que podemos criar vários **comparators** para cada attribute que desejamos ordenar. Olha que beleza!


<br>

Esse é o passo a passo para comparar/ordenar um objeto complexo:

1. Criamos uma class que implements `Comparator`.
2. Nessa class, informamos o tipo do objeto complexo que vamos comparar `<T>`
3. Na hora de ordenar, informamos:
    - a lista que queremos ordenar
    - o comparator que vamos utilizar

<br>

✏️ Crie um **comparator** para comparar o "name" das pessoas. Depois, ordene essa lista de pessoas:


### Criando uma class Comparator

```java
//Class Comparator
public class NameComparator implements Comparator<Person>{ //informamos a Class que vamos comparar


    //method implementado da interface "Comparator", que vamos usar para comparar
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
        //se retornar 1, a pessoa "p1" é maior, portanto vem depois
        //se retornar 0, ordem permanece a mesma
        //se retornar -1, "p1" é menor, portanto vem primeiro
    }   
}
```

<br>

### Ordenando utilizando a comparator que acabamos de criar

```java
public class Main{
    public static void main(String[] args){
        Person p1 = new Person("Zico", 33, Gender.MALE, 4000d);
        Person p2 = new Person("Patricia", 19, Gender.FEMALE, 3000d);
        Person p3 = new Person("Bob", 25, Gender.MALE, 8000d);
        Person p4 = new Person("Amanda", 21, Gender.FEMALE, 5500d);

        List<Person> personas = Arrays.asList(p1,p2,p3,p4);

        //lista original
        System.out.println("\n ================ Lista original: ================");
        for(Person i : personas){
            System.out.println(i.toString());
        }

        Collections.sort(personas, new NameComparator()); //informamos a lista que queremos ordenar, e o tipo de comparacao/ordenacoa


        //lista ordenada
        System.out.println("\n ================ Lista ordenadinha: ================");
        for(Person i : personas){
            System.out.println(i.toString());
        }
    }
}
```

Easy! 😎


<hr>
<br>

## Criando várias comparators

✏️ Crie uma comparator para cada um dos attributes:


- sexo
- salary
- age


💡 Ordene tanto de forma **ASC** quanto **DESC** (Basta inverter o sinal `>`).

<br>

### Comparators

#### sexo

```java
//Comparator para ordenar por "Sexo". Primeiro as "Female", depois os "Male"

public class ComparatorSexo implements Comparator<Person> { //informamos a class que vamos comparar

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getSexo().getName().compareTo(p2.getSexo().getName());
        //como estamos trabalhando com String, usamos o compareTo() do "comparable".
    }
}


//Main Class
 public static void main(String[] args){

    //lista original
    System.out.println("\n ================ Lista original: ================");
    for(Person i : personas){
        System.out.println(i.toString());
    }

    //lista ordenada
    System.out.println("\n ================ Lista ordenada: ================");
    personas.stream()
        .sorted(new SexoComparator()) //dale. Informamos o comparator aki.
        .forEach(i -> System.out.println(i.toString()));
}
```


<br>


#### salary

```java
//Class Comparator

public class SalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getSalary() > p2.getSalary()){
            return 1;
        }
        if(p1.getSalary() < p2.getSalary()){
            return -1;
        }
        return 0;
    } 
}


//Main Class
public static void main(String[] args){

    List<Person> personas = Arrays.asList(p1,p2,p3,p4,p5);

    //lista original
    System.out.println("\n ================ Lista original: ================");
    for(Person i : personas){
        System.out.println(i.toString());
    }


    //lista ordenada
    System.out.println("\n ================ Lista ordenada: ================");
    personas.stream()
        .sorted(new SalaryComparator()) //dale
        .forEach(item -> System.out.println(item.toString()));
}
```

💡 Se quiser ordenar de forma DESC, basta alterar o sinal ou inverter o 1 e -1.

<br>

#### age

```java
public class AgeComparator implements Comparator<Person> { //informamos a Class que vamos comparar

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge().compareTo(p2.getAge()); //ordem ASC
        //return p1.getAge().compareTo(p2.getAge()); //ordem DESC
        
        //poderiamos fazer com 1, 0 e -1 tambem. Dá no mesmo
        // if(p1.getAge() > p2.getAge()){
        //     return -1;
        // }
        // if(p1.getAge() == p2.getAge()){
        //     return 0;
        // }
        // return 1;
        

        //poderiamos fazer assim tambem:
        //return Integer.compare(p1.getAge(), p2.getAge()); // ASC
        //return Integer.compare(p2.getAge(), p1.getAge()); // DESC


        //poderiamos fazer assim:
        //return p2.getAge() - p1.getAge(); ASC
        //return p1.getAge() - p2.getAge(); DESC
    }
}



//Main Class
public static void main(String[] args){

    //lista original
    System.out.println("\n ================ Lista original: ================");
    for(Person i : personas){
        System.out.println(i.toString());
    }


    //lista ordenada
    System.out.println("\n ================ Lista ordenada: ================");
    personas.stream().sorted(new AgeComparator()).forEach(item -> System.out.println(item)); //stream + lambda é bom demais!
    
}
```

Várias formas de fazer. Dale! O importante é saber que sempre que queremos ordenar por um determinado attribute, precisamos antes criar uma Comparator Class e informar o attribute que desejamos comparar.

Assim, podemos ter VÁRIAS Comparators Classes para cada attribute que desejamos comparar.


<br>

💡 Sempre que estiver comparando um attribute String, use o `compareTo()`.


<hr>
<br>

## <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center"> Relembrando

- **Comparable**:
A comparação é definida diretamente na própria classe do objeto. Usamos o método `compareTo()` para escolher qual atributo será o padrão de comparação. Isso significa que, toda vez que compararmos objetos dessa classe, a ordem será sempre baseada nesse atributo específico.

<br>

- **Comparator**:
Aqui, temos algo mais legal. Podemos criar múltiplos comparators, cada um para um atributo diferente da classe. Isso permite que, na hora de comparar ou ordenar objetos dessa classe, possamos escolher qual atributo usar para a comparação.