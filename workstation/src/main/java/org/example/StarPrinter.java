package org.example;

public class StarPrinter implements Printer {
    @Override
    public void print(String str) {
        System.out.println("***" + str + "***");
    }
}
