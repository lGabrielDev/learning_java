import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPronta{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Boolean runAgain = false;
        Integer option = 0;
        String[] listaCharacters = {"+","-","*","/"};
        Double number1, number2;
        

        do{
            System.out.println("\n******* Calculadora iniciada! *******\n");

            //operation choice
            option = App.optionChoise(scan);

            String calculateCharacter = listaCharacters[(option-1)];
            
            //number1 input
            number1 = App.number1Input(scan);

            //number2 input
            number2 = App.number2Input(scan, number1, option, calculateCharacter);

            //calcular resultado
            App.resultCalculate(option, number1, number2);

            //run again
            runAgain = App.runAgain(scan);
        }
        while(runAgain);

        scan.close();
    }

     // ======================= methods =======================

        //operation choice
        public static Integer optionChoise(Scanner scan){
            Integer option = 0;
            Boolean isCorrect = true;

            do{
                System.out.println("\nEscolha a operação matemática:\n");
                System.out.println("1- Soma");
                System.out.println("2- Subtração");
                System.out.println("3- Multiplicaçao");
                System.out.println("4- Divisão");

                //verificamos se digitou um número e noa uma String
                try{
                    option = scan.nextInt();

                    //verificamos se é de 1 a 4
                    if(option >= 1 && option <= 4){
                        isCorrect = true;
                    }
                    else{
                        System.out.println("Opção inválida! Escolha entre 1-4\n");
                        isCorrect = false;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Opcao inválida! Digite um NÚMERO!\n");
                    isCorrect = false;
                    scan.nextLine();
                }
            }
            while(isCorrect == false);
            return option;
        }


        // inputar number1
        public static Double number1Input(Scanner scan){
            Double number1 = 0d;
            Boolean isCorrect = true;
            
            do{
                System.out.print("Number1: ");
                try{
                    number1 = scan.nextDouble();
                    isCorrect = true;
                }
                catch(InputMismatchException e){
                    System.out.println("Erro! Number1 não pode ser uma STRING!\n");
                    isCorrect = false;
                    scan.nextLine();
                }
            }
            while(isCorrect == false);

            return number1;   
        }


        // inputar number2
        public static Double number2Input(Scanner scan, Double number1, Integer option, String calculateCharacter){
            Double number2 = 0d;
            Boolean isCorrect = true;

            do{

                System.out.printf("\n%.0f %s ", number1, calculateCharacter);

                try{
                    number2 = scan.nextDouble();
                    //se o numero2 for 0 e estiver na divisao
                    if(number2 == 0 && option == 4){
                        System.out.println("Numer2 não pode ser 0, pois nenhum número divide por 0\n");
                        isCorrect = false;
                    }
                    else{
                        isCorrect = true;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Erro! Number2 não pode ser uma STRING!\n");
                    isCorrect = false;
                    scan.nextLine();
                }
            }
            while(isCorrect == false);
            return number2;   
        
        }


        //result
        public static void resultCalculate(Integer option, Double number1, Double number2){
            Double result = 0d;

            System.out.println("\n=========== RESULT: ===========\n");

            switch(option){
                case 1:
                    result = number1 + number2;
                    System.out.printf("%.0f + %.0f = %.2f", number1, number2, result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.printf("%.0f - %.0f = %.2f", number1, number2, result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.printf("%.0f * %.0f = %.2f", number1, number2, result);
                    break;
                case 4:
                    result = number1 / number2;
                    System.out.printf("%.0f / %.0f = %.2f", number1, number2, result);
                    break;
            }
        }


        //run again?
        public static Boolean runAgain(Scanner scan){
            Boolean isCorrect = true;
            Integer option = 0;

            do{
                System.out.println("\n\nDeseja fazer outra conta?");
                System.out.println("1- SIM");
                System.out.println("2- NÃO");

                try{
                    option = scan.nextInt();
                    //apenas opcoes 1 e 2 válidas
                    if(option != 1 && option != 2){
                        System.out.println("Opção inválida! Escolha entre 1-2\n");
                        isCorrect = false;
                        scan.nextLine();
                    }
                    else{
                        isCorrect = true;
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Opcao inválida! Digite um NÚMERO!\n");
                    isCorrect = false;
                    scan.nextLine();
                }
            }
            while(isCorrect == false);

            if(option == 1){
                return true;
            }
            return false;
        }        
}