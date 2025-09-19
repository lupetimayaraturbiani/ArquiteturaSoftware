package org.example;

public class ImpostoIp2 implements Imposto{

    @Override
    public double calcular(double valor) {
        return valor * 0.15;
    }
}
