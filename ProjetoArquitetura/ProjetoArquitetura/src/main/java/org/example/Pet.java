package org.example;

//classe model Pet
public class Pet {
    //atributos
    private final int id;
    private final String nome;
    private final String raca;
    private final int idade;

    //construtor
    public Pet(int id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    //getters e setters
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getRaca() { return raca; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return String.format("Pet{id=%d, nome='%s', raca='%s', idade=%d}", id, nome, raca, idade);
    }
}

