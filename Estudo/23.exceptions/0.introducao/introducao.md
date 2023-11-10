<h1 align="center">
    Exceptions
    <img src="https://cdn-icons-png.flaticon.com/512/1331/1331428.png" alt="image icon" width="90px" align="center">
</h1>

As **exceptions** são os erros que acontecem no programa.

No Java, sempre que um erro acontece, o programa é interrompido e é gerado um erro.

O termo usado no Java, é: "Java will throw an **exception**".

```java
public class Programa{
    public static void main(String[] args){
        System.out.println(5/0); // vai popar um erro.
        System.out.println("Olá, mundo!"); // esse código não será executado
    }
}
```
Aqui, temos uma ArithmeticException. Não podemos dividir um número por 0.

Se não tratarmos a exception(erro), os códigos abaixo dessa exception não serão executados.


<hr>
<br>

## NullPointerException
Essa exception ocorre quando não instanciamos um objeto. Quando um objeto tem valor `null`.

```java
Cliente c1 = null;
```

Para corrigir, é só instanciar esse objeto, utilizando o `new`.

```java
Cliente c1 = new Cliente();
```

<hr>
<br>

## Exception tree (Árvore de exceptions)

![image](https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/0.introducao/exception_tree.jpg?raw=true)


- "Throwable é a class pai de todas.
  - Error --> Erros da máquina do usuário(sem memória, pc deu pau, etc...)
  - Exception --> Erros no código
    - Checked exceptions --> Erros que o java reconhece enquanto estamos codando.(`System.out.printBolado`) - Esse command não existe.
    - Unchecked exceptions(runtime) --> Erros que acontecem quando executamos o programa, no runtime.


<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/23.exceptions/1.try_catch/try_catch.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>