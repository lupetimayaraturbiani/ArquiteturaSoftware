package org.example;

public class ImpostoIp3 implements Imposto {
    @Override
    public double calcular(double valor) {
        return valor * 0.25;
    }
}
