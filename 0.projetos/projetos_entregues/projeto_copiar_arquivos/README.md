
# Copiando arquivos utilizando Java

## Objetivo<br>
Copiar um arquivo utilizando linguagem Java.

## Requisitos<br>   
* JDK instalado.



## Introdução

Sempre que queremos copiar um arquivo, a lógica que temos que seguir é a segunte:

*1-*  Qual o arquivo que eu quero copiar.<br>
*2-*  Para onde eu vou copiar esse arquivo.<br>


Uma das maneiras de copiar um arquivo utilizando Java é através do method **Files.copy()**.


Para melhor visualização, vamos copiar um arquivo e colar esse arquivo no mesmo diretório.


Vamos lá!


## Passo a passo:

No Java, uma das maneiras de representar um arquivo é utilizando a interface **"Path"** juntamente com a class **"Paths"**:

```java

    Path arquivo = Paths.get("");

```

Perceba que esse objeto recebe uma String que representa o caminho do arquivo.



O method **"Files.copy()"** recebe como argumento 2 objetos do tipo **"Path"**.

*Argumento 1 -> Arquivo que será copiado* <br>
*Argumento 2 -> Novo arquivo*<br>


Vamos criar esses 2 objetos:

1. Crie 2 objetos "**Path**":

    O primeiro objeto **"Path"** vai receber o caminho do arquivo para copiar.<br>
    O segundo objeto **"Path"** vai receber o caminho do novo arquivo.

```java

    Path arquivo = Paths.get("/caminho/arquivoTal.txt");
    Path arquivoNovo = Paths.get(arquivo.getParent().toString() + "/arquivo_novo.txt");

```


Perceba que o novo arquivo recebe o caminho do pai do arquivo antigo transformado para String + nome desse novo arquivo.


2. Importe os seguintes packages:
    ```java

        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;

    ```

Pronto. Temos nossos arquivos.

Temos um objeto "Path" com o arquivo que será copiado.<br>
Temos outro objeto "Path" com o novo arquivo.<br>



3. Copiando o arquivo:

Use o method **"Files.copy()"**:

```java

Files.copy(arquivo, arquivoNovo);
System.out.println("Arquivo copiado com sucesso!");

```

Como vimos anteriormente, o method **"Files.copy()"** recebe como argumento dois objetos do tipo "**Path**" que representam a origem e o destino.


Como esse method pode gerar uma *exception* caso o arquivo não exista, precisamos tratar essa possível *exception*.

4- Trate a *exception* utilizando o **try catch** ou lance a *exception* utilizando o "**throws**":

```java

try{
    Files.copy(arquivo,arquivoNovo);
    System.out.println("Arquivo copiado com sucesso!");
}
catch(Exception e){
    System.out.println("Erro. Arquivo não encontrado.");
}

```

Pronto. O arquivo foi copiado com sucesso!

Se o method não funcionar, verifique se o caminho do arquivo foi digitado corretamente.
