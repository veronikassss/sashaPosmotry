package org.tnova.animal_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal cow = new Cow();
        Animal cat = new Cat();
        Animal dog = new Dog();

        List<Animal> animals = new ArrayList<>();

        animals.add(cow);
        animals.add(cat);
        animals.add(dog);

        UserSelection userSelection = new UserSelection();
        userSelection.work();

        for (Animal animal : animals) {
            System.out.println(animal.toString() + " is " + animal.makeSound());
        }
    }
}


