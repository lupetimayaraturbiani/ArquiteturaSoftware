package org.example;

public class Departamento implements DepartamentoComponent {
    private String nome;
    private double custo;
    private int funcionarios;

    public Departamento(String nome, double custo, int funcionarios) {
        this.nome = nome;
        this.custo = custo;
        this.funcionarios = funcionarios;
    }

    @Override
    public double getCusto() {
        return custo;
    }

    @Override
    public int getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return nome + " [Funcionários: " + funcionarios + ", Custo: " + custo + "]";
    }
}
