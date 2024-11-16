package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Mistakes {

    private static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\Randomizer\\src\\main\\resources";

    public void validProblem(String filename) throws FileNotFoundException {

        File file = new File(url + "\\" + filename);

        if (!file.exists()) {
            throw new FileNotFoundException("the file doesnt exist " + filename);
        } else {
            System.out.println("the file exist");
        }
        if (!file.canRead()) {
            throw new FileNotFoundException("the file cannt be read" + filename);
        } else {
            System.out.println("the file can be read");
        }
    }

    public void invalidData(String filename) throws InvalidDataFormatException {

        boolean hasErrors = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(url + "\\" + filename))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (lineNumber == 1) {
                    lineNumber++;
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length != 3) {
                    System.out.println("Ошибка в строке " + lineNumber + ": " + line);
                    continue;
                }

                int age = Integer.parseInt(parts[1].trim());
                String name = parts[2].trim();

                if (age < 1 || age > 120) {
                    throw new InvalidDataFormatException("uncorrected age in the line " + lineNumber + ": " + age);
                }
                if (name.length() < 4 || name.length() > 10) {
                    throw new InvalidDataFormatException("uncorrected length of name in the line " + lineNumber + ": " + name);
                }

                if (Character.isLowerCase(name.charAt(0))) {
                    throw new InvalidDataFormatException("the first letter isnt upper case in the line " + lineNumber);
                }
            }
            if (!hasErrors) {
                System.out.println("all lines are cool, congratulation");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Некорректный формат имени/возраста в файле");
        }
    }
}
