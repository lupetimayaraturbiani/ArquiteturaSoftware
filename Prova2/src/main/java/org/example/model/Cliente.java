package org.example.model;

public class Cliente {
    private static int cont = 1;
    private final int id;
    private final String nome;

    public Cliente (String nome) {
        this.id = cont++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente:" + "\n" + "Id: " + id + "\n" + "Nome: " + nome;
    }
}
