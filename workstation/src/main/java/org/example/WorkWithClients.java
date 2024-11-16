package org.example;

public interface WorkWithClients {

    void work();
    void menu();

    void passAndSave(Parser parser, String filename, Repository repository);
    void passerAndSaveInRepository();
    void findClientByID();
    void deleteClientByID();
    void closeAndSaveInComputer();


}
