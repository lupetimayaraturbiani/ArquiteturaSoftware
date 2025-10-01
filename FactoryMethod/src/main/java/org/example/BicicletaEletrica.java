package org.example;

public class BicicletaEletrica implements Transporte{
    private String nome;
    private String inicio;
    private String fim;
    private boolean entregue;

    public BicicletaEletrica(String nome){
        this.nome = nome;
    }

    @Override
    public void entregar(boolean entrega) {
        this.entregue = entrega;
        System.out.println("Entrega com bicicleta elétrica " + nome + ": " + (entrega ? "Concluída" : "Pendente"));
    }

    @Override
    public void realizarPercurso(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
        System.out.println("Bicicleta elétrica percorreu de " + inicio + " até " + fim);
    }

    @Override
    public String toString() {
        return " Bicicleta Elétrica:\nNome: " + nome + "\nInicio: " + inicio + "\nFim: " + fim;
    }
}
