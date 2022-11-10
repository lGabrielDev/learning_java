# Lendo arquivos utilizando linguagem Java

## Introdução
Assim como em outras linguagens, na linguagem *Java* também é possível manipular arquivos. Geralmente, o termo utilizado para manipulacao de arquivo é *'File handling'.*<br>


Nesse artigo, vamos trabalhar com leitura de arquivos.

Aqui, abordaremos 3 formas de leitura de arquivo:
* Utilizando a class **BufferedReader**.<br>
* Utilizando a class **Scanner**.<br>
* Utilizando a class **Files**.<br>

<br>

## BufferedReader

Uma das formas para ler arquivos é utilizando a class **BufferedReader**.



A class **BufferedReader** recebe como argumento no constructor um objeto do tipo **FileReader**. <br>
A class **FileReader** recebe como argumento no constructor um objeto do tipo "**File**". Essa class "**File**" representa o arquivo que vamos ler.<br>



#### Passo a passo - BufferedReader

1. Crie um objeto da class **File**: <br>
*Essa class representa o arquivo.*

```java

File arquivo = new File("caminho/arquivo.txt");

```

2. Crie um objeto da class FileReader:

```java

FileReader fr = new FileReader(arquivo);

```  
<br>

3. Crie um objeto da class BufferedReader:

```java

File arquivo = new File("caminho/arquivo.txt");
FileReader fr = new FileReader(arquivo);
BufferedReader br = new BufferedReader(fr);

```


Você poderia também instanciar diretamente a class FileReader no constructor da class BufferedReader.

```java

BufferedReader br = new BufferedReader(
    new FileReader("caminho/arquivo.txt")
); 

```

Na dua formas, o resultado seria o mesmo.

<br>

4. Importe os seguites packages:

```java

import java.io.File;
import java.io.FileReader;

```


<br>

Quando estamos tentando ler um arquivo, pode acontecer de o arquivo não existir. O arquivo não existindo, é lançado uma "**IOException**", interrompendo nosso programa.

Para evitar esse problema, precisamos tratar essa possível "**IOException**."

4. Trate a "**IOException**" utilizando o "**try catch**" ou lance a *Exception* utilizando o "**throws**":

```Java
    
    File arquivo = new File("caminho/arquivo1.txt");
    
    try{
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
    }
    catch(IOException e){
        System.out.println("Erro. Arquivo não encontrado.");
    }

```


Lembrando que, podemos passar no constructor do objeto **FileReader** tanto o objeto do tipo **File** quanto uma **String** representando o caminho do arquivo.

*Nesse caso, passamos como argumento um objeto da class **File**.*

<br>


Para ler o arquivo, vamos utilizar o method "**readLine()**" 

O method **readLine()** é um method da class **BufferedReader()** e serve para ler a próxima linha do arquivo.



5. Crie uma String que vai receber a próxima linha do arquivo.

```java

String linhaAtual = br.readLine();

```

<br>


6. Crie um while loop para ler/imprimir todas as linhas do arquivo:

```java

String linhaAtual = br.readLine();

while(linhaAtual != null){
    System.out.println(linhaAtual);
    linhaAtual = br.readLine();
}

```
<br>

Traduzindo esse while loop, ficaria assim: <br>
*"A variable vai receber a primeira linha do arquivo. Enquanto essa linha tiver conteúdo, será impresso a linha atual e a variable receberá a proxima linha."*

Assim, conseguimos imprimir todas as linhas do arquivo. A partir do momento que não tiver mais conteúdo nele, o while loop encerra.




7. Feche a leitura do arquivo.

```java

br.close();
fr.close();

```
Assim como na class **Scanner**, aqui também precisamos fechar a class **BufferedReader**. <br>

É como se tivéssemos dizendo: <br>
"*br.readLine() -> Inicie a leitura do arquivo*" <br>
"*br.close()    -> Finalize a leitura do arquivo*"


*Faça o mesmo para a class* **FileReader**.


<br>
<br>
<br>

## Scanner
Outra forma de ler arquivos é através da class **Scanner**. <br>
*Geralmente essa class é utilizada para ler o input do usuário, mas também serve para leitura de arquivos.*


#### Passo a passo - Scanner

Diferente do primeiro exemplo , ao invés de utilizar a class *BufferedReader* para ler um arquivo, vamos utilizar a class **Scanner**.


1. Crie um objeto **File**. Esse objeto vai representar o arquivo que será lido.

```java

File arquivo = new File("caminho/arquivo.txt");

```

Não esqueca de importar o package **java.io**:

```java

    import java.io.File;

```



2. Crie um objeto da class **Scanner**. Essa será a class responsável pela leitura do arquivo:

```java

Scanner scan = new Scanner(arquivo);

```


Perceba que no constructor da class **Scanner** passamos como argumento um objeto da class **File**.


Se quiséssemos ler o input do usuário, colocaríamos dessa forma:

```java

Scanner scan = new Scanner(System.in);

```



Não esqueca de importar o package **java.util**:

```java

   import java.util.Scanner;

```

<br>

 A leitura de arquivos, como falado antes, é uma ação sensível. Se tentarmos ler um arquivo que não exista, vai dar problema. Assim, uma **FileNotFoundException** aconteceria.

Para prever esse tipo de problema, vamos tratar essa possível **FileNotFoundException**.

3. Trate a **Exception** utilizando o **try catch** ou lance com o **throws**:

```java
try{
    Scanner scan = new Scanner(file);
}
catch(FileNotFoundException e){
    System.out.println("Erro. Arquivo não encontrado.");
}

```
   
<br>


Para ler o arquivo, vamos utilizar o method **.scan.nextLine()** da class **Scanner**.

4. Crie um *while loop* para ler todas as linhas do arquivo:

```java

try{
    Scanner scan = new Scanner(arquivo);
    while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
}
    scan.close();
}
catch(FileNotFoundException e){
    System.out.println("Erro. Arquivo não encontrado.");
}

```

Traduzindo o loop, teríamos:

"Enquanto meu objeto scan tiver uma proxima linha, imprima a proxima linha. Quando não tiver mais linha o loop encerra.".

*Sempre que terminar a leitura de um arquivo, feche o objeto Scanner utilizando o method '.close()'*.

```java

scan.close();

```


<br>
<br>
<br>

## Files
Outra forma para ler arquivos, é utilizando a class **Files**.
Aqui, utilizaremos o method **.readAllLines()**.



#### Passo a passo - Files
1. Crie uma String que receberá o caminho do arquivo:

```java

String caminho = "caminho/arquivo.txt"

```


Como o method **.readAllLines()** recebe um objeto **Path** como argumento, precisamos criar esse objeto.


2. Crie um objeto **Path** para representar o arquivo que vamos ler:
    
```java

String caminho = "caminho/arquivo.txt"
Path arquivo = Paths.get(caminho);

```

Não esqueça de importar a class **Paths** e a interface **Path**:

```java

import java.nio.file.Path;
import java.nio.file.Paths;

```

3. Crie uma estrutura de dados do tipo **List**.<br>
O objetivo aqui, é armazenar em cada posicao da array uma linha do arquivo.

```java

List<String> linhasDoArquivo = Files.readAllLines(arquivo);

```
Perceba que essa estrutura armazena objetos do tipo **String**. Isso, porque cada posicao da array receberá uma linha do arquivo.

Perceba também que essa estrutura de **lista** do tipo **String** vai receber todas as linhas do arquivo. <br>

Não esqueca de importar os packages **java.util** e **java.nio**:

```java
import java.util.List;
import java.nio.file.Files;

```


4. Trate uma possível **Exception** utilizando **try catch** ou lance um **throws**

```java

public static void main(String[] args) throws Exception{

}

```

5. Crie um **for loop** ou um **for each loop** para imprimir todas as posicoes da *array*:


##### for each loop
```java

for(String i : linhasDoArquivo){
    System.out.println(i);
}

```


Ou...

##### for loop

```java

for(int i = 0; i < linhasDoArquivo.size(); i++){
    System.out.println(linhasDoArquivo.get(i));
}

```


Done.


Se tiver alguma dúvida, confira o código completo:

* [BufferedReader](https://github.com/lGabrielDev/Java_ler_arquivos/blob/main/buffered_reader.java)
* [Scanner](https://github.com/lGabrielDev/Java_ler_arquivos/blob/main/scanner.java)
* [Files](https://github.com/lGabrielDev/Java_ler_arquivos/blob/main/files.java)