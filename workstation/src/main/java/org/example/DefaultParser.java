package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements Parser {

    public static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\src\\main\\resources\\";

    @Override
    public List<String[]> pars(String filename)  {

        Path path = Paths.get(url + filename);

        List<String> lines = readAllLines(path);
        List<String[]> futureClients = new ArrayList<>();

        for (String line : lines) {
            String[] data = line.split(",");
            futureClients.add(data);
        }
        return futureClients;
    }

    @Override
    public List<String> readAllLines(Path path) {

        try {
            return Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
