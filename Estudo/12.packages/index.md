<h1 align="center">
    Packages
    <img src="https://cdn-icons-png.flaticon.com/512/2821/2821739.png" alt="image icon" width="90px" align="center">
</h1>

## Introduction

Para o java, os diretórios/pastas são chamados de packages.

| sistema operacional | pasta <img src="https://cdn-icons-png.flaticon.com/512/3767/3767094.png" alt="folder icon" width="20px" align="center"> |
| :---                | :---  |
| Linux               | directories|
| Windows             | folders |
| git                 | repositories |
| **java**            | **packages** |


Dentro desses packages/diretórios temos as classes.


Sempre que criamos um projeto, é gerado um package `src`. Esse diretório é o package padrão.

:warning: Não é recomendado criar classes direto na pasta `src`. Geralmente seguimos essa estrutura de diretórios:

```txt
src/main/java/com/companyName/Main.java
etc...
```
<hr>
<br>

## Configure Classpath
Sempre que criamos um projeto, precisamos configurar o **classpath** desse projeto. Ou seja, informar o diretório/package `src/`.

Assim que criar o projeto, informe para a IDE(vsCode) qual é a pasta `src/` do projeto.

```vscode
CTRL + SHIFT + P
"Configure Classpath"
```

<hr>
<br>

## Informando o package
Sempre que criamos uma Class, precisamos informar o package que ela está.

```java
package main.java.br.com.leekbiel.projeto.classes;
```

Se uma Class estiver dentro de um package, obrigatoriamente precisamos colocar na primeira linha dessa Class o package que ela está.
<hr>
<br>

## Importando uma class
Sempre que queremos utilizar uma Class , precisamos importá-la.

- Class Scanner
- Class Math
- Class ArrayList
- Class Cars ou qualquer outra Class...

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//etc...
```

:bulb: Aqui, também informamos no início da Class, lá em cima.


<br>

### Importando todas as classes de um package
Ao invés de informar uma class específica, informamos o `*`:
```java
import java.util.*;
```

<br>
<br>

<!-- Next Page Button -->
<a href="https://github.com/lGabrielDev/02.java/blob/main/Estudo/13.modifiers/index.md">
    <img src="https://cdn-icons-png.flaticon.com/512/8175/8175884.png" alt="Next page button" width="50px" align="right">
</a>