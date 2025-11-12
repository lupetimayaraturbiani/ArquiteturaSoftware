package org.example;

import java.util.ArrayList;
import java.util.List;

//classe de gerenciamento de adoção
public class GerenciarAdocao {
    private final List<String> records = new ArrayList<>();

    //construtor
    public void registrarAdocao(Usuario user, Pet pet) {
        String rec = String.format("Adoção registrada: user=%s, pet=%s", user, pet);
        records.add(rec);
        System.out.println("[ADOPTION] " + rec);
    }

    public List<String> listarAdocoes() {
        return new ArrayList<>(records);
    }
}

