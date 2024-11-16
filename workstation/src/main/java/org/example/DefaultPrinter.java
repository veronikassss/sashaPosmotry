package org.example;

public class DefaultPrinter implements Printer {
    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
