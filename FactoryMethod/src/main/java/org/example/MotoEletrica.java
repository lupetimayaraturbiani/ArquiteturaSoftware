package org.example;

public class MotoEletrica implements Transporte{
    private String nome;
    private String inicio;
    private String fim;
    private boolean entregue;

    public MotoEletrica(String nome){
        this.nome = nome;
    }

    @Override
    public void entregar(boolean entrega) {
        this.entregue = entrega;
        System.out.println("Entrega com moto elétrica " + nome + ": " + (entrega ? "Concluída" : "Pendente"));
    }

    @Override
    public void realizarPercurso(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
        System.out.println("Moto elétrica percorreu de " + inicio + " até " + fim);
    }

    @Override
    public String toString() {
        return "Moto Elétrica:\nNome: " + nome + "\nInicio: " + inicio + "\nFim: " + fim;
    }
}
