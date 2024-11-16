package org.example;

import java.util.InputMismatchException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InputMismatchException, NegativeNumberException, DivisionByZeroException, EmptyFileException, InsufficientDataException, InvalidIndexException {


//        Input input = new Input();
//        input.input();

//        MyReader myReader = new MyReader();
//
//        try {
//            List<String> data = myReader.reader("3.txt");
//            List<String> recycledData = myReader.counter(data);
//
//            for (String d : data) {
//                System.out.println(d);
//            }
//
//        } catch (EmptyFileException | InsufficientDataException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

        UserArray userArray = new UserArray();
        userArray.input();
    }
}