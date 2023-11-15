<h1 align="center">
    Date and Time
    <img src="../../imgs/download_images/calendar_icon.png" alt="image icon" width="90px" align="center">
</h1>


## Introduction <img src="https://cdn-icons-png.flaticon.com/512/1436/1436664.png" alt="imagem" width="50px" align="center">
Para trabalhar com objetos do tipo date, vamos precisar usar o package **java.time**.

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
```

Quando estamos trabalhando com datas, podemos usar as seguintes Classes:

| Class               | Description |
| :---                | :---        |
| `LocalDate`         | Represents a date **(yyyy-MM-dd)**  |
| `LocalTime`         | Represents a time **(HH-mm-ss-ns)** |
| `LocalDateTime`     | Represents both a date and a time **(yyyy-MM-dd-HH-mm-ss-ns)** |
| `DateTimeFormatter` | Usamos para formatar uma data (yyyy-MM-dd) or (dd-MM-yyyy) etc... Podemos escolher como será exibido a data|

📖 Existem inúmeras formas de usar o **DateTimeFormatter**.

💡 Quando estamos trabalhando com uma dessas Classes, nós não instanciamos um objeto. Nós criamos um objeto de forma **static**, referenciando a propria Class.

<br>

Perceba que **MM** e **HH** estão em UPPERCASE LETTERS.

- **MM** --> month
- **m** --> minute
- .
- **HH** --> tempo em 24 horas
- **hh** --> tempo em 12 horas (am or pm)

<hr>
<br>

## LocalDate

Essa Class mostra somente a data.

```java
public static void main(String[] args){
    LocalDate d1 = LocalDate.of(2017, 3, 12);
    System.out.println(d1); //2017-03-12
}
```

<br>

### Current Date (Data atual de hoje)
Vamos usar o `LocalDate.now()`

```java
public static void main(String[] args){
    LocalDate d1 = LocalDate.now();
    System.out.println(d1); //2023-11-15
}
```

<br>

### Pegando o year/month/day de uma data
Basta criar um Integer e usar os methods get()

```java
public class Main{
    public static void main(String[] args){
        LocalDate data = LocalDate.of(2018,4,27);

        Integer year = data.getYear();
        Integer month = data.getMonthValue();
        Integer day = data.getDayOfMonth();

        System.out.println(year); //2018
        System.out.println(month); //4
        System.out.println(day); //27
    }
}
```

<br>

📖 Existem vários outros methods. Por exemplo:

- `getDayOfWeek();` //WEDNESDAY --> Descobre o dia de samana de uma data
- `plusDays();` // adiciona tantos dias
- `minusDays();` // remove tantos dias
- etc...

Podemos adicionar/remover dias/meses/anos

<hr>
<br>

## LocalTime

Essa Class mostra somente a hora.

```java
public static void main(String[] args){
    LocalTime t1 = LocalTime.of(23,59,59);
    System.out.println(t1); //23:59:59
}
```

<br>

### Current Time (Hora atual)

```java
public static void main(String[] args){
    LocalTime t1 = LocalTime.now();
    System.out.println(t1); //10:03:31.677194414 --> Inclusive os nano segundos
}
```

⚠️ Respeite o limite de horas. 1 dia pode ter apenas:

- hour --> 24h
- minute --> 59m
- seconds --> 59s


<br>

### Pegando a hour/minutes/seconds de um tempo
Basta criar um Integer e usar os methods get()

```java
public class Main{
    public static void main(String[] args){
        LocalTime tempo = LocalTime.now();

        Integer hour = tempo.getHour();
        Integer minute = tempo.getMinute();
        Integer second = tempo.getSecond();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
```


<hr>
<br>

## LocalDateTime
Mostra a porra toda. Data + Hora

```java
public static void main(String[] args){
        LocalDateTime dt1 = LocalDateTime.of(2015,05,13, 4,20,30);// yyyy, MM, dd, hh, mm, ss
        LocalDateTime dt2 = LocalDateTime.now(); // yyyy, MM, dd, hh, mm, ss
        
        System.out.println("Data aleatoria:" + dt1);
        System.out.println("Date e hora atual: " + dt2);
    }
```

Esse method `of()`, que usamos para setar uma data, poderia ser preenchido com apenas 2 parametros:
- LocalDate
- LocalTime

Afinal, LocalDateTime é composta de data e tempo. Podemos preencher todos os argumentos, ou podemos passar um LocalDate e um LocalTime:


```java
public static void main(String[] args){
    LocalDate data = LocalDate.of(2095, 04, 17);
    LocalTime hora = LocalTime.of(21, 35, 2);

    LocalDateTime dateEHora = LocalDateTime.of(data,hora);

    System.out.println(dateEHora); //2095-04-17T21:35:02
}
```


<br>

### Pegando o year/month/day/hour/minutes/seconds de um LocalDateTime
Basta criar um Integer e usar os methods get()

```java
public class Main{
    public static void main(String[] args){
        LocalDateTime dataEHora = LocalDateTime.now();

        Integer year = dataEHora.getYear();
        Integer month = dataEHora.getMonthValue();
        Integer day = dataEHora.getDayOfMonth();
        Integer hour = dataEHora.getHour();
        Integer minute = dataEHora.getMinute();
        Integer second = dataEHora.getSecond();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
```

<br>

### Pegando somente a data e o tempo

```java
public static void main(String[] args){
    LocalDateTime dataEHora = LocalDateTime.now();

    LocalDate data = LocalDate.from(dataEHora);
    LocalTime hora = LocalTime.from(dataEHora);

    System.out.println(data);
    System.out.println(hora);
}
```

<hr>
<br>

## DateTimeFormatter (Formatando e deixando a data/hora mais bonitinha)
Aqui, podemos escolher a forma que vamos exibir nossas datas e horas.

Vamos precisar fazer 2 passos:

1. Criar um objeto da Class `DateTimeFormatter` e usar o method  `ofPattern()` para defirnir a formatacao padrao de data

2. Vamos usar o method `.format()` para retornar uma String formatada de uma data. Basta criarmos uma String para armazenar.

<br>

### Formatando LocalDate
✏️ Faça algumas formatacoes em uma data

```java
public class Main{
    public static void main(String[] args){
        LocalDate d1 = LocalDate.of(2015,8,2);

        //formatacao 1
        DateTimeFormatter formatacaoPadrao = DateTimeFormatter.ofPattern("d/M/yy"); 
        String d1Formatada = formatacaoPadrao.format(d1);
        System.out.println("Formatacao 1: " + d1Formatada);

        //formatacao 2
        formatacaoPadrao = DateTimeFormatter.ofPattern("dd/M/yy");
        d1Formatada = formatacaoPadrao.format(d1);
        System.out.println("Formatacao 2: " + d1Formatada); 

        //formatacao 3
        formatacaoPadrao = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        d1Formatada = formatacaoPadrao.format(d1);
        System.out.println("Formatacao 3: " + d1Formatada);

        //formatacao 4
        formatacaoPadrao = DateTimeFormatter.ofPattern("dd/MMMM/yyyy --> EEEE");
        d1Formatada = formatacaoPadrao.format(d1);
        System.out.println("Formatacao 3: " + d1Formatada);

        /* 
        Formatacao 1: 2/8/15
        Formatacao 2: 02/8/15
        Formatacao 3: 02/Aug/2015
        Formatacao 3: 02/August/2015 --> WEDNESDAY
        etc...
        */
    }
}
```

<br>

### Formatando LocalTime
✏️ Faça algumas formatacoes em uma hora

```java
public class Main{
    public static void main(String[] args){
        LocalTime hora = LocalTime.of(21,5,59);

        //formatacao 1
        DateTimeFormatter formatacaoPadrao = DateTimeFormatter.ofPattern("hh:mm:ss a"); //09:05:59 PM
        String horaFormatada = formatacaoPadrao.format(hora);
        System.out.println(horaFormatada);

        //formatacao 2
        formatacaoPadrao = DateTimeFormatter.ofPattern("HH:mm:ss a"); //21:05:59 PM
        horaFormatada = formatacaoPadrao.format(hora);
        System.out.println(horaFormatada);

        //formatacao 2 3
        formatacaoPadrao = DateTimeFormatter.ofPattern("HH:mm:ss"); //21:05:59
        horaFormatada = formatacaoPadrao.format(hora);
        System.out.println(horaFormatada);
    }
}
```

<br>

### Formatando LocalDateTime

✏️ Faça uma formatacao de uma date e hora

```java
public class Main{
    public static void main(String[] args){
        LocalDate data = LocalDate.of(2023,5,14);
        LocalTime hora = LocalTime.now();
        LocalDateTime dataEHora = LocalDateTime.of(data, hora);

        //Antes da formatacao
        System.out.println("\nAntes da formatacao:" + dataEHora);

        //Depois da formatacao --> Padrao BR
        DateTimeFormatter formatacaoPadrao = DateTimeFormatter.ofPattern("dd/MMMM/YYYY -> HH:mm:ss");
        String dateEHoraFormatada = formatacaoPadrao.format(dataEHora);
        System.out.println(dateEHoraFormatada);
    }
}
```

<hr>
<br>


## Descobrindo a diferenca entre duas datas - `Period.between();`

Para saber a diferença de dias/meses/days/horas/etc... entre duas datas, vamos usar a class **Period**;

✏️ Diga a diferenca entre duas datas:

- **Years** de diferenca
- **Months** de diferenca
- **Days** de diferenca

```java
public class Main{
    public static void main(String[] args){
        
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1997, 04, 11);

        System.out.println("Date 1: " + today);
        System.out.println("Date 2: " + birthDate);

        System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨ Diferenca: ¨¨¨¨¨¨¨¨¨¨¨¨");
        Period diferenca = Period.between(birthDate, today);

        System.out.println("Years: " + diferenca.getYears());
        System.out.println("Months: " + diferenca.getMonths());
        System.out.println("Days: " + diferenca.getDays());
        /*
        ¨¨¨¨¨¨¨¨¨¨¨¨ Diferenca: ¨¨¨¨¨¨¨¨¨¨¨¨
        Years: 26
        Months: 7
        Days: 4
        */
    }
}
```

<br>

- Se quiséssemos converter os anos e meses para saber o total de dias entre duas datas.... Ou
- Se quiséssemos converter os anos para saber o total de meses entre duas datas, nós utilizaríamos a Class **ChronoUnit**.


<hr>
<br>


## Praticando <img src="https://cdn4.iconfinder.com/data/icons/language-learning-3/512/practice-study-learning-education-knowledge-512.png" alt="imagem" width="50px" align="center">

✏️ Utilize a Class `LocalDate` and `ChronoUnit` para saber:

- A **diferenca total de anos** entre uma data e outra (IDADE)
- A **diferenca total de meses** entre uma data e outra
- A **diferenca total de dias** entre uma data e outra

<br>

```java
public class Main{
    public static void main(String[] args){
        
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1997, 04, 11);

        System.out.println(today);
        System.out.println(birthDate);

        Long diferencaYears = ChronoUnit.YEARS.between(birthDate, today);
        Long diferencaMonths = ChronoUnit.MONTHS.between(birthDate, today);
        Long diferencaDays = ChronoUnit.DAYS.between(birthDate, today);

        System.out.println(diferencaYears);
        System.out.println(diferencaMonths);
        System.out.println(diferencaDays);
    }
}
```

O legal dessa Class **ChronoUnit** é que ela é extremamente precisa, considerando os meses que tem apenas 28/30/31 dias, ano bissexto, etc...

📖 Lembrando que o method ChronoUnit`.between()` retorna um Long.


<hr>
<br>