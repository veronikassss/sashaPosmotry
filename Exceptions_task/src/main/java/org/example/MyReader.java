package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class MyReader {

    private static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\Exceptions_task\\src\\main\\resources\\";

    public List<String> reader(String filename) throws EmptyFileException {

        Path path = Paths.get(url + filename);

        List<String> data = readAllLines(path);
        List<String> datafile = new ArrayList<>();

        try {
            if (data.isEmpty()) {
                throw new FileNotFoundException("file is empty");
            }

            for (String d : data) {
                datafile.addAll(Arrays.asList(d.trim()));
            }

        } catch (FileNotFoundException e) {
            throw new EmptyFileException(e.getMessage());
        }

        return datafile;
    }

    public List<String> counter(List<String> data) throws InsufficientDataException {

        List<String> recycledData = new ArrayList<>();

        if (data.size() < 5) {
            throw new InsufficientDataException("the length of file less than 5 lines");
        }

        int printedLines = 0;


        for (int i = 0; i < data.size(); i++) {
            String line = data.get(i).trim();
            recycledData.add(line);
            printedLines++;

        }
        return recycledData;
    }

    public List<String> readAllLines(Path path) {

        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

