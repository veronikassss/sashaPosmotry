package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public int input() throws NegativeNumberException, DivisionByZeroException {

        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        boolean validamount = false;

        while (!validamount) {
            try {
                System.out.println("write your number (it can not be zero) " );
                num1 = scanner.nextInt();

                System.out.println("write second number ");
                num2 = scanner.nextInt();

                try {
                    if (num1 < 0 || num2 < 0) {
                        throw new NegativeNumberException("the numbers can not be negative");
                    }

                try {
                    if(num1 == 0) {
                        throw new ArithmeticException("we can not divide on zero, sorry");
                    }

                validamount = true;

                int num3 = num1 / num2;

                System.out.println("the result is: " + num3);

            } catch (ArithmeticException e) {
                    throw new DivisionByZeroException("as we say, write another number");
                }
            }catch (NegativeNumberException e) {
                    System.out.println("the numbers can not be negative, write another");
                    scanner.nextLine();
            }
            }  catch (InputMismatchException e) {
                System.out.println("invalid data, please, write numbers ");
                scanner.nextLine();
            }
        }
        return num1 + num2;
    }
}
