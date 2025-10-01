package org.example;

public class Moto implements Transporte{
    private String nome;
    private String inicio;
    private String fim;
    private boolean entregue;

    public Moto(String nome){
        this.nome = nome;
    }

    @Override
    public void realizarPercurso(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
        System.out.println("Moto percorreu de " + inicio + " até " + fim);
    }

    @Override
    public void entregar(boolean entrega) {
        this.entregue = entrega;
        System.out.println("Entrega com moto " + nome + ": " + (entrega ? "Concluída" : "Pendente"));
    }

    @Override
    public String toString() {
        return "Moto:\nNome: " + nome + "\nInicio: " + inicio + "\nFim: " + fim;
    }
}
