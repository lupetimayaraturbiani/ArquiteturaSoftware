package org.example;

//classe model Usuário
public class User {
    //atributos
    private final int id;
    private final String nome;
    private final String email;

    //contrutor
    public User(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    //getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("User{id=%d, nome='%s', email='%s'}", id, nome, email);
    }
}

