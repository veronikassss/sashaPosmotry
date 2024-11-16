package org.tnova.calculator_interface;

public class MultiplyOperation implements Operation {

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
