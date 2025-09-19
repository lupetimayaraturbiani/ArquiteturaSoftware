package org.example;

public class Ordenador {
    private OrdenacaoStrategy strategy;

    public Ordenador(OrdenacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void ordenar(int[] v) {
        strategy.ordenar(v);
    }
}
