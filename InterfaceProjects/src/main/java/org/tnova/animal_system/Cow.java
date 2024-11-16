package org.tnova.animal_system;

public class Cow implements Animal {

    @Override
    public String makeSound() {
       return "mooing";
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Cow";
    }

}
