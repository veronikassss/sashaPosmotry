package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WorkWithClients workWithClients = new DefaultWorkWithClients();
        workWithClients.work();

//        List<Printer> printerList = List.of(
//                new QuestionPrinter(),
//                new StarPrinter(),
//                new DefaultPrinter()
//        );
//
//        String example = "hello";
//
//        for (Printer printer : printerList) {
//            printer.print(example);
//        }
    }
}