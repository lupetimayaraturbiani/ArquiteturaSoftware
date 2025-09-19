package org.example;

public class ImpostoIp1 implements Imposto {
    @Override
    public double calcular(double valor) {
        return valor * 0.10;
    }
}
