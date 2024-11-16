package org.tnova.calculator_interface;

public class DivideOperation implements Operation {

    @Override
    public double calculate(double a, double b) {

        if (b == 0) {
            System.out.println("a division by zero is prohibition");
        }
        return a / b;
    }
}
