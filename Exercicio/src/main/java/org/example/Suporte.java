package org.example;

public class Suporte implements BonusStrategy {
    @Override
    public double calculaSalarioBonus(double salarioBase) {
        return salarioBase * 1.04;
    }
}
