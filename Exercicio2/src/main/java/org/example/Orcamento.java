package org.example;

public class Orcamento {
    private double valor;

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double calcularComImposto(Imposto imposto){
        return valor + imposto.calcular(valor);
    }
}
