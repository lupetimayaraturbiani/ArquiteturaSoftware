package org.example;

//importando bibliotecas de array e listas
import java.util.ArrayList;
import java.util.List;

//Classe que gerencia usuarios
public class UserManager {
    //atributos
    private final List<User> users = new ArrayList<>();
    private int nextId = 1;

    //contrutor com parâmentros
    public User registerUser(String nome, String email) {
        User u = new User(nextId++, nome, email);
        users.add(u);
        return u;
    }

    //métodos de gerenciamento de usuários
    public User findById(int id) {
        return users.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public List<User> listUsers() {
        return new ArrayList<>(users);
    }
}

