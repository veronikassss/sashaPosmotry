package org.example;

import java.util.ArrayList;
import java.util.List;

public class DefaultConvector implements Convector {

    @Override
    public List<Client> convert(List<String[]> fc) {

        List<Client> clientsList = new ArrayList<>();

        for(String[] data : fc) {
            if(data.length >= 3){
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String city = data[2];
                Client client = new Client(name, age, city);
                clientsList.add(client);
            }
        }
        return clientsList;
    }
}
