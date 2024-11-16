package org.example;

import java.util.List;

public interface MyFileWriter {

    public static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\src\\main\\resources";

    boolean writer(List<Client> clients, String filename);
}
