package main.java.br.com.leekbiel.projeto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Integer number1 = 0;
        Integer number2 = 0;
        Integer resultado = 0;
        Integer opcaoEscolhida = 0;
        Boolean opcaoCorreta = true;
        Boolean reiniciarPrograma = true;

        do{
            // Inputando o primeiro number
            do{
                try{
                    System.out.println("\n\n***** Programa iniciado *****");
                    System.out.print("\nDigite o primeiro número: ");
                    number1 = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Valor inválido. Por favor, insira um number.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(!(opcaoCorreta));


            // Inputando o segundo number
            do{
                try{
                    System.out.print("Digite o segundo número: ");
                    number2 = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Valor inválido. Por favor, insira um number.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(!(opcaoCorreta));


            // Escolha da operação matemática
            do{
                try{
                    System.out.println("\nQual operação matemática deseja fazer?");
                    System.out.println("1- Soma\n2- Subtração\n3- Multiplicação\n4- Divisão");
                    opcaoEscolhida = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Opção incorreta. Por favor, escolha novamente.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                }
            }
            while(opcaoCorreta == false || opcaoEscolhida < 1 || opcaoEscolhida > 4);

            switch(opcaoEscolhida){
                case 1:
                    resultado = number1 + number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d + %d = %d",number1,number2,resultado);
                    break;
                case 2:
                    resultado = number1 - number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d - %d = %d",number1,number2,resultado);
                    break;
                case 3:
                    resultado = number1 * number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d * %d = %d",number1,number2,resultado);
                    break;
                case 4:
                    resultado = number1 / number2;
                    System.out.println("*** Resultado ***");
                    System.out.printf("%d / %d = %d",number1,number2,resultado);
                    break;
                default:
                    System.out.println("Opção incorreta. Por favor, escolha novamente.\n");
                    opcaoCorreta = false;
                    break;
            }

            // Rodar o programa novamente
            do{
                try{
                    System.out.println("\n\n\nDeseja fazer outra operação?");
                    System.out.println("1- Sim\n2- Não");
                    opcaoEscolhida = scan.nextInt();
                    opcaoCorreta = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Opção inválida.\n");
                    opcaoCorreta = false;
                    scan.nextLine();
                } 
            }
            while(opcaoCorreta == false || opcaoEscolhida > 2);

            if(opcaoEscolhida == 1){
                reiniciarPrograma = true;
            }
            else if(opcaoEscolhida == 2){
                reiniciarPrograma = false;
                System.out.println("\nPrograma finalizado");
            }        
        }
        while(reiniciarPrograma == true);
        scan.close();   
    }
}

