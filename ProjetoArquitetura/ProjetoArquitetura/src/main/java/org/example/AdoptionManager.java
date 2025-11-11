package org.example;

import java.util.ArrayList;
import java.util.List;

//classe de gerenciamento de adoção
public class AdoptionManager {
    private final List<String> records = new ArrayList<>();

    //construtor
    public void registerAdoption(User user, Pet pet) {
        String rec = String.format("Adoção registrada: user=%s, pet=%s", user, pet);
        records.add(rec);
        System.out.println("[ADOPTION] " + rec);
    }

    public List<String> listRecords() {
        return new ArrayList<>(records);
    }
}

