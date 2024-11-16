package org.example;

public class QuestionPrinter implements Printer {
    @Override
    public void print(String str) {
        System.out.println(str + "???????????");
    }
}
