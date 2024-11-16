package org.tnova.animal_system;

import java.util.Scanner;

public class UserSelection {

    public void work() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greeting! Choose animal: " + "\n" + "1. Cat" + "\n" + "2. Dog" + "\n" + "3. Cow" + "\n" + "4. Bird");

        int option = scanner.nextInt();
        Animal selectedAnimal = null;

        switch (option){
            case 1:
                selectedAnimal = new Cat();
                break;
            case 2:
                selectedAnimal = new Dog();
                break;
            case 3:
                selectedAnimal = new Cow();
                break;
            case 4:
                selectedAnimal = new Bird();
        }

        System.out.println( selectedAnimal.toString() + " is " + selectedAnimal.makeSound());



    }


}
