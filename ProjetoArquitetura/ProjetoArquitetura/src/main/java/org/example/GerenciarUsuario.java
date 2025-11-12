package org.example;

//importando bibliotecas de array e listas
import java.util.ArrayList;
import java.util.List;

//Classe que gerencia usuarios
public class GerenciarUsuario {
    //atributos
    private final List<Usuario> usuarios = new ArrayList<>();
    private int nextId = 1;

    //construtor com parâmentros
    public Usuario cadastrarUsuario(String nome, String email) {
        Usuario u = new Usuario(nextId++, nome, email);
        usuarios.add(u);
        return u;
    }

    //métodos de gerenciamento de usuários
    public Usuario findById(int id) {
        return usuarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public List<Usuario> listarUsuarios() {
        return new ArrayList<>(usuarios);
    }
}

