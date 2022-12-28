<!--
2D ArrayList

1- Crie 3 ArrayList, cada uma contendo uma lista diferente.
    -lista de comidas
    -lista de bebidas
    -lista de chocolate

    public static void main(String[] args){
        List<String> listaComidas = new ArrayList<String>();

        List<String> listaBebidas = new ArrayList<String>();

        List<String> listaChocolates = new ArrayList<String>();
    }

2- Adicione alguns items para cada lista.

    List<String> listaComidas = new ArrayList<String>();
        listaComidas.add("Hamburguer");
        listaComidas.add("Pizza");
        listaComidas.add("Pastel");

        List<String> listaBebidas = new ArrayList<String>();
        listaBebidas.add("Refrigerante");
        listaBebidas.add("Suco");
        listaBebidas.add("Água");

        List<String> listaChocolates = new ArrayList<String>();
        listaChocolates.add("Castanha");
        listaChocolates.add("Amargo");
        listaChocolates.add("Amêndoa");

-Imprima cada lista
    System.out.println(listaComidas);
    System.out.println(listaBebidas);
    System.out.println(listaChocolates);


3- Crie uma ArrayList que vai receber todas essas 3 listas.

List<List<String>> Listas = new ArrayList<List<String>>();

O que eu estou dizendo é:
"Estou criando uma lista que vai receber listas do tipo String."




4- Adicione as 3 listas pra essa lista global.

    listas.add(listaComidas);
    listas.add(listaBebidas);
    listas.add(listaChocolates);

-Imprima a lista global.
    System.out.println(listas);


5-Imprima cada lista da lista global
    System.out.println(listas.get(0));
    System.out.println(listas.get(1));
    System.out.println(listas.get(2));


6-Imprima a lista de bebidas na posicao 1;

    System.out.println(listas.get(1).get(1));


Easy!

-->