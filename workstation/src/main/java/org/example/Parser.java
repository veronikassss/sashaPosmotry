package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface Parser {

  List<String[]> pars(String filename);

  List<String> readAllLines(Path path);

}
