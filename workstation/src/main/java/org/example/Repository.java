package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Repository {

    void save(List<Client> clients);
    List<Client> filterOfDublicaters(List<Client> clients);
    List<Client> getAll();
    Client getByID(int ID);
    Client deleteByID(int ID);
}
