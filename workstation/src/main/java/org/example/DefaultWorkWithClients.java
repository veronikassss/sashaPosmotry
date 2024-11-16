package org.example;

import java.util.List;
import java.util.Scanner;

public class DefaultWorkWithClients implements WorkWithClients {

    final static Parser parser = new DefaultParser();
    final static Convector convector = new DefaultConvector();
    final static Repository repository = new DefaultRepository();
    final static Scanner scanner = new Scanner(System.in);
    final static MyFileWriter myFileWriter = new DefaultFileWriter();

    @Override
    public void menu() {
        System.out.println("choose the option: \n1. save the client\n" +
                "2. get all client\n" +
                "3. search by the ID\n" +
                "4. delete the client by ID\n" +
                "5. exit");
    }

    @Override
    public void passerAndSaveInRepository() {
        System.out.println("write the name of the file: ");
        String filename = scanner.nextLine();

        passAndSave(parser, filename, repository);
        System.out.println("Clients are saved!");

    }

    @Override
    public void passAndSave(Parser parser, String filename, Repository repository) {

        List<String[]> data = parser.pars(filename);
        List<Client> clients = convector.convert(data);
        repository.save(clients);
//        System.out.println("Saving client: " + clients);
    }

    @Override
    public void findClientByID() {
        System.out.println("Write ID, please: ");
        int ID = scanner.nextInt();
        Client client = repository.getByID(ID);
        System.out.println(client);
    }

    @Override
    public void deleteClientByID() {
        System.out.println("Write ID, please: ");
        int ID = scanner.nextInt();
        Client client = repository.deleteByID(ID);
        System.out.println(client + " was deleted!");
    }

    @Override
    public void closeAndSaveInComputer() {
        System.out.println("waiting...we are saving your data");
        List<Client> all = repository.getAll();
        boolean ready = myFileWriter.writer(all, "sydanado.txt");
        System.out.println("okay, now bye!");
    }

    @Override
    public void work() {

        passAndSave(parser, "sydanado.txt", repository);

        menu();

        while (true) {

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    passerAndSaveInRepository();
                    menu();
                    break;
                case 2:
                    repository.getAll();
                    menu();
                    break;
                case 3:
                    findClientByID();
                    menu();
                    break;
                case 4:
                    deleteClientByID();
                    menu();
                    break;
                case 5:
                    closeAndSaveInComputer();
                    break;
                default:
                    System.out.println(" need choose only one of this optiion");

            }
        }
    }
}



