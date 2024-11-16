package org.example;

import java.util.Scanner;

public class UserArray {

    public int input() throws InvalidIndexException {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("write the index, please ");

        int index = 0;
        boolean validIndex = false;

        while (!validIndex) {
            try {
                index = scanner.nextInt();
                System.out.println("The element of the array in " + index + " is " + array[index]);

                try {
                    if (index < 0 || index > array.length) {
                        throw new InvalidIndexException("the index or negative or more than boundaris of array");
                    }

                validIndex = true;

            } catch (InvalidIndexException e) {
                    System.out.println(e.getMessage());
            }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("this index is more than bounders of our array. Write right index");
                scanner.nextLine();
            }
        }
        return array[index];
    }
}
