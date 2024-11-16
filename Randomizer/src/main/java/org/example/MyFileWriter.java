package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MyFileWriter {

    private static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\Randomizer\\src\\main\\resources\\";
//            "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\Randomizer\\src\\main\\java\\org\\example";
    private static final Repozitory rep = new Repozitory();

    public boolean writer(String filename) throws FileProcessingException, FileNotFoundException {

        try (FileWriter file = new FileWriter(url + filename)) {
            file.write("id, age, name\n");

            for (int ID = 1; ID <= 10000; ID++) {
                int age = rep.randomAge();
                String name = rep.randomName();
                file.write(ID + "," + age + "," + name + "\n");
            }
            return true;
        } catch (java.io.FileNotFoundException e) {
            System.err.println("the file isnt found " + e.getMessage());
            throw new FileNotFoundException("trouble with access to file " + filename + e);
        } catch (IOException e) {
            System.err.println("trouble with enter-out" + e.getMessage());
            throw new FileProcessingException("trouble with access to file " + filename + e);
        } catch (InvalidDataFormatException e) {
            System.err.println("the mistake with " + e.getMessage());
            return false;
        }
    }
    }

