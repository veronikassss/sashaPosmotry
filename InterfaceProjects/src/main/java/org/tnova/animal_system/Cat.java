package org.tnova.animal_system;

public class Cat implements Animal {

    @Override
    public String makeSound() {
        return "meowing";
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Cat";
    }
}
