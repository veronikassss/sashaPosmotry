package org.example;

import java.util.Scanner;

public class Calcul {

    public int cul(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("write your number ");
        String numbers = scanner.nextLine();

        int itog = value(numbers);


    }

    public int value(String num) {

        String[] numbers = num.split(" ");

        int x = Integer.parseInt(numbers[0]);
        int y = Integer.parseInt(numbers[2]);

        int result = 0;

        boolean isPlus = numbers[1].equals("+");
        boolean isMinus = numbers[1].equals("-");
        boolean isDivide = numbers[1].equals("/");
        boolean isMultiply = numbers[1].equals("*");

        if(isPlus) {
            result = x + y;
        } if(isMinus) {
            result = x - y;
        } if(isDivide) {
            result = x / y;
        } if(isMultiply) {
            result = x * y;
        }

        return result;
    }
}
