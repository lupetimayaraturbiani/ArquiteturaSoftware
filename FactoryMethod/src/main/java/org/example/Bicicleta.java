package org.example;

public class Bicicleta implements Transporte{
    private String nome;
    private String inicio;
    private String fim;
    private boolean entregue;

    public Bicicleta(String nome){
        this.nome = nome;
    }

    @Override
    public void entregar(boolean entrega) {
        this.entregue = entrega;
        System.out.println("Entrega com bicicleta " + nome + ": " + (entrega ? "Concluída" : "Pendente"));
    }

    @Override
    public void realizarPercurso(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
        System.out.println("Bicicleta percorreu de " + inicio + " até " + fim);
    }

    @Override
    public String toString() {
        return "Bicicleta:\nNome: " + nome + "\nInicio: " + inicio + "\nFim: " + fim;
    }
}
