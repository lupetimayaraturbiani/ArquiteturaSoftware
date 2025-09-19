package org.example;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentoComponent{
    private String nome;
    private List<DepartamentoComponent> children = new ArrayList<>();

    public Diretoria(String nome) {
        this.nome = nome;
    }

    public void add(DepartamentoComponent d){
        children.add(d);
    }

    @Override
    public double getCusto() {
        return children.stream().mapToDouble(DepartamentoComponent::getCusto).sum();
    }

    @Override
    public int getFuncionarios() {
        return children.stream().mapToInt(DepartamentoComponent::getFuncionarios).sum();
    }

    @Override
    public String toString() {
        return nome + " (Funcionários: " + getFuncionarios() + ", Custo: " + getCusto() + ")";
    }
}
