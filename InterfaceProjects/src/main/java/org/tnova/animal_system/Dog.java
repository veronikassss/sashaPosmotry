package org.tnova.animal_system;

public class Dog implements  Animal{

    @Override
    public String makeSound() {
        return "barking";
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Dog";
    }
}
