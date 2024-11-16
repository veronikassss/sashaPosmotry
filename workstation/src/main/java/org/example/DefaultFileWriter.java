package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DefaultFileWriter implements MyFileWriter {

    public static final String url = "C:\\Users\\USER\\IdeaProjects\\HereWeGoAgain\\src\\main\\resources\\";


    @Override
    public boolean writer(List<Client> clients, String filename) {
        try (FileWriter writer = new FileWriter(url + filename, true)) {
            for (Client client : clients) {
                writer.write(client.write() + "\n");
            }
            System.out.println("Data successfully written to the file");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while writing to the file");
            return false;
        }
    }
}
