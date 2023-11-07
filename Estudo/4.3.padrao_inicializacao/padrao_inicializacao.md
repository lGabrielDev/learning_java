<h1 align="center">
    Padrão de inicialização
    <img src="https://cdn-icons-png.flaticon.com/512/8339/8339934.png" alt="" width="90px" align="center">
</h1>

Sempre que criamos uma primitive variable de escopo GLOBAL, ela já vêm com um valor default.

- `int,double,float,long`(qualquer primitive datatype de número) --> **0**
- `boolean` --> **false**
- `String` --> **null**

```java
public class Programa{
    //attributes globais

    // primitive numbers datatype
    static short number1;
    static long number2;
    static int number3;
    static double number4;
    static float number5;

    static boolean valor;
    static String texto;

    public static void main(String[] args){
        System.out.println(Programa.number1); // 0
        System.out.println(Programa.number2); // 0
        System.out.println(Programa.number3); // 0
        System.out.println(Programa.number4); // 0
        System.out.println(Programa.number5); // 0
  
        System.out.println(valor); // false
        System.out.println(texto); // null
    }
}
```

⚠️ lembrando que o java atribui valores somente para variables GLOBAIS.
Se você criar uma variable local, dentro de um method, e não atribuir valor, vai dar erro. As variables locais **DEVEM ser inicializadas.**


<br>

## Relembrando <img src="https://cdn-icons-png.flaticon.com/512/201/201652.png" alt="imagem" width="50px" align="center">

- **primitive variable de escopo GLOBAL** --> O java automaticamente atribui um valor default (**0**,**false**,**null**)

- **primitive variable de escopo local** --> Precisamos inicializar a variable com algum valor, se não vai dar erro.

<br>
<br>


<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/4.3.wrapper_classes/wrapper_classes.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>