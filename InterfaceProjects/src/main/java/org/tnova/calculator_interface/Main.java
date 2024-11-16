package org.tnova.calculator_interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operation addition = new AdditionOperation();
        Operation subtraction = new SubtractionOperation();
        Operation multiplication = new MultiplyOperation();
        Operation division = new DivideOperation();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greeting! Choose write first number: ");

        double number1 = scanner.nextInt();

        System.out.println("Greeting! Choose write second number: ");

        double number2 = scanner.nextInt();

        menu();

        while (true) {

            int option = scanner.nextInt();

        switch (option) {
            case 1:
                double result = addition.calculate(number1,number2);
                System.out.println(result);
                menu();
                break;
            case 2:
                double result2 = subtraction.calculate(number1,number2);
                System.out.println(result2);
                menu();
                break;
            case 3:
                double result3 = multiplication.calculate(number1,number2);
                System.out.println(result3);
                menu();
                break;
            case 4:
                double result4 = division.calculate(number1,number2);
                if(number2 == 0) {
                    System.out.println("Choose another number, sorry");
                    break;
                }
                System.out.println(result4);
                menu();
                break;
            case 5:
                System.out.println("okay, now bye!");
                break;
            default:
                System.out.println("we dont have another option sorry");
        }
    }
}

    private static void menu() {
        System.out.println("Greeting! Choose operation: ");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication ");
        System.out.println("4. division");
        System.out.println("5.exit");
    }
}
