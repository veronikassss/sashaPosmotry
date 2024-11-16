package org.example;

import java.util.Random;

public class Repozitory {

    private static final Random random = new Random();

    public int randomAge() throws InvalidDataFormatException {
        int age = random.nextInt(120) + 1;
        if (age < 1 || age > 120) {
            throw new InvalidDataFormatException("uncorrected age" + age + "write up 1 to 120");
        }
        return age;
    }

    public String randomName() throws InvalidDataFormatException {

        String alphavit = "abcdefghijklmnopqrstuvwxyz";

        int minLetters = 4;
        int maxLetters = 10;

        int randomAmountOfLetters = minLetters + random.nextInt(maxLetters - minLetters + 1);

        if (randomAmountOfLetters < 4 || randomAmountOfLetters > 10) {
            throw new InvalidDataFormatException("uncorrected lengh of name " + randomAmountOfLetters);
        }

        StringBuilder randomName = new StringBuilder(randomAmountOfLetters);

        for (int i = 0; i <randomAmountOfLetters; i++) {
            char randomLetter = alphavit.charAt(random.nextInt(alphavit.length()));
            randomName.append(randomLetter);
        }

        if (randomName.length() > 0) {
            randomName.setCharAt(0,Character.toUpperCase(randomName.charAt(0)));
        }

       if (Character.isLowerCase(randomName.charAt(0))) {
            throw new InvalidDataFormatException("the first letter isnt upper case");
        }

        return randomName.toString();
    }
}
