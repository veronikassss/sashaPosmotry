package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.channels.FileChannel.open;
import static java.nio.file.Files.readAllLines;

public class Printer implements PrinterI {

    private static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\Randomizer\\src\\main\\resources\\";

    public List<String> printer(String filename, int N) throws FileNotFoundException, InvalidAmoutOfLines {

        Path path = Paths.get(url + filename);

        List<String> lines = readAllLines(path);
        List<String> linesThatShow = new ArrayList<>();

        int printedLines = 0;

        if (lines.isEmpty()) {
            throw new FileNotFoundException("the file is  empty sorry");
        }

        for (int i = 1; i < lines.size() && printedLines <= N; i++) {
            String line = lines.get(i).trim();
            System.out.println(line);
            linesThatShow.add(line);
            printedLines++;


            if (N > 10000) {
                throw new InvalidAmoutOfLines("it is more than limit of lines");
            }

            if (linesThatShow.size() >= N) {
                break;
            }
        }
        return linesThatShow;
    }

    public List<String> readAllLines(Path path) {

        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
