package org.example;

import java.nio.file.Path;
import java.util.List;

public interface PrinterI {

    List<String> printer(String filename, int N) throws FileNotFoundException, InvalidAmoutOfLines;
    List<String> readAllLines(Path path);
}
