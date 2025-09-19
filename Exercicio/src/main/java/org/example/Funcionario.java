package org.example;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private BonusStrategy bonusStrategy;

    public Funcionario(String nome, double salarioBase, BonusStrategy bonusStrategy) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonusStrategy = bonusStrategy;
    }

    public double getSalarioBonus(){
        return bonusStrategy.calculaSalarioBonus(salarioBase);
    }

    public void mostrarSalario(){
        System.out.println("Funcionário: " + nome + "\nSalário Base: R$" + salarioBase + "\nSalário com Bônus: R$" + getSalarioBonus() + "\n");
    }
}
