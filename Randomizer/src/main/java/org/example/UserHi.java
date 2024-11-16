package org.example;

import java.util.Scanner;

public class UserHi {

    private static final MyFileWriter myFileWriter = new MyFileWriter();
    private static final Mistakes mistakes = new Mistakes();
    private static final Printer printer = new Printer();

    public void work() throws FileProcessingException, FileNotFoundException, InvalidDataFormatException, InvalidAmoutOfLines {

        Scanner scanner = new Scanner(System.in);

        menu();

        while (true) {

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    creationOfTheFile(scanner);
                    menu();
                    break;
                case 2:
                    checkForMistakes(scanner);
                    menu();
                    break;
                case 3:
                    printeSomeLines(scanner);
                    menu();
                    break;
                case 4:
                    System.out.println("okay, now bye!");

            }
        }
    }

    private static void printeSomeLines(Scanner scanner) throws FileNotFoundException, InvalidAmoutOfLines {
        System.out.println("write filename: ");
        String filename3 = scanner.nextLine();
        System.out.println("write the anount of lines (<10000)");
        int N = scanner.nextInt();
        printer.printer(filename3, N);
    }

    private static void checkForMistakes(Scanner scanner) throws FileNotFoundException, InvalidDataFormatException {
        System.out.println("write filename: ");
        String filename2 = scanner.nextLine();
        mistakes.validProblem(filename2);
        mistakes.invalidData(filename2);
    }

    private static void creationOfTheFile(Scanner scanner) throws FileProcessingException, FileNotFoundException {
        System.out.println("write the name of file ");
        String filename = scanner.nextLine();
        myFileWriter.writer(filename);
    }

    private static void menu() {
        System.out.println("choose option: ");
        System.out.println("1. generate new file");
        System.out.println("2. check the file for mistakes");
        System.out.println("3. print the first N lines of the file"); // с обработкой возможных исключений при неверном вводе N
    }
}
