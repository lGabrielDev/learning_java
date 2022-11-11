# Escrevendo em arquivos utilizando linguagem Java

## Introdução
Assim como em outras linguagens, na linguagem *Java* também é possível manipular arquivos. Geralmente, o termo utilizado para manipulacao de arquivo é *'File handling'.*<br>


Nesse artigo, vamos aprender a editar um arquivo.

Aqui, abordaremos 2 formas de escrever em um arquivo:
* Utilizando a class **BufferedWriter**.<br>
* Utilizando a class **Files**.<br>

<br>

## BufferedWriter

Uma das formas para escrever em um arquivo é utilizando a class **BufferedWriter**.



A class **BufferedWriter** recebe como argumento no constructor um objeto do tipo **FileWriter**. <br>
A class **FileWriter** recebe como argumento no constructor um objeto do tipo "**File**". Essa class "**File**" representa o arquivo.<br>



#### Passo a passo - BufferedWriter

1. Crie um objeto da class **File**: <br>
*Esse objeto será o arquivo que vamos editar.*

```java

File arquivo = new File("caminho/arquivo.txt");

```

<br>

*Não esqueca de importar o package **java.io.File***:

```java

import java.io.File;

```

<br>
<br>


2. Crie um objeto da class FileWriter:

```java

FileWriter fw = new FileWriter(arquivo,false);

```  


A class FileWriter pode receber 2 argumentos no constructor.

*Argumento 1 ->* Um objeto **String** (caminho do arquivo) ou um objeto **File**.<br>
*Argumento 2 ->* valor **Boolean**.

   Esse argumento *booleano* representa se o que será escrito será de forma "*append*" ou não.

	TRUE  -> Acrescentar no final do arquivo (Append) .
	FALSE -> Sobreescrever o arquivo.

<br>

*Não esqueca de importar o package **java.io.FileWriter***:

```java

import java.io.FileWriter;

```

<br>
<br>



O ato de instanciar a class **FileWriter** é considerado pelo java uma ação *sensível*. Se você tentar escrever em um arquivo que não existe, será *lançado* uma **IOException** e o programa encerra.

3. Para resolver isso, trate a **IOException** utilizando o **try catch** ou lance a *exception* utilizando o **throws**.


```java

try{
    FileWriter fw = new FileWriter(arquivo,false);
}
catch(IOException e){
    System.out.println("Erro. Arquivo não encontrado.");
}

```

<br>


*Não esqueca de importar o package **java.io.IOException***:

```java

import java.io.IOException;

```
<br>
<br>



4. Crie um objeto da class **BufferedWriter**: <br>
*Essa será a class responsável por permitir editar um arquivo*.


```java

File arquivo = new File("caminho/teste.txt");
        
try{
    FileWriter fw = new FileWriter(arquivo,false);
    BufferedWriter bw = new BufferedWriter(fw);
}
...

```


Você também poderia instanciar diretamente a class **FileWriter** no constructor da class **BufferedWriter**.

```java

File arquivo = new File("caminho/teste.txt");
BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo,false));

```

Na dua formas, o resultado seria o mesmo.

<br>



*Não esqueca de importar o package **java.io.BufferedWriter***:

```java

import java.io.BufferedWriter;

```


<br>

Pronto. Temos nossos objetos criados.<br>
Agora, vamos editar esse arquivo.



Para editar um arquivo vamos utilizar o method "**.write()**" <br>

O method **.write()** é um method da class **BuffereWriter()** e serve para editar um arquivo.


5. Escreva o conteúdo do arquivo:


```java

bw.write("Conteúdo do arquivo");
bw.close();

```
<br>

Assim como na class **Scanner**, aqui também precisamos fechar a class **BufferedWriter**. <br>

É como se tivéssemos dizendo: <br>
"*bw.write()    -> Inicie a edicao do arquivo*" <br>
"*bw.close()    -> Finalize a edicao do arquivo*"

<br>
<br>
<br>


## Files

#### Passo a passo - Files
Outra forma de escrever em um arquivo é utilizando a class **Files** juntamente com o method **.write()** .

Nesse method, precisamos passar como argumentos um objeto **Path** e o conteúdo que queremos escrever.


1. Crie 2 *String variables* que vão representar:
    * caminho do arquivo
    * conteudo do arquivo

```java

String caminho = "caminho/arquivo.txt";
String conteudo = "Conteúdo do arquivo";

```
<br>
<br>

2. Crie um objeto **Path** que representará o arquivo:

```java

String caminho = "caminho/arquivo.txt";
String conteudo = "Conteúdo do arquivo";
Path arquivo = Paths.get(caminho);

```

*Não esqueca de importar o package **java.nio***

```java

import java.nio.file.Path;
import java.nio.file.Paths;

```
<br>
<br>


3. Use o method **.write()** para escrever no arquivo:

```java

Files.write(arquivo, conteudo.getBytes());

```

*Perceba que, passamos como argumento o arquivo que queremos editar e o conteudo(String) transformado para Bytes.*


<br>
<br>

4. Como a ação de escrever em um documento é uma ação *sensível*, precisamos tratar uma possível **Exception**.

Da mesma forma que fizemos no exemplo anterior, vamos tratar essa *exception* utilizando o **try catch**:


```java

try{
    Files.write(arquivo, conteudo.getBytes());
}
catch(IOException e){
    System.out.println("Erro. Arquivo não encontrado.");
}

```
<br>
<br>

Diferente do primeiro exemplo, não precisamos fechar o objeto.
Afinal, estamos utilizando o method de maneira **static**.

<br>

Se tiver alguma dúvida, consulte o código completo:

* [BufferedWriter](https://github.com/lGabrielDev/Java_editar_arquivos-/blob/main/buffered_writer.java)
* [Files](https://github.com/lGabrielDev/Java_editar_arquivos-/blob/main/files.java)
