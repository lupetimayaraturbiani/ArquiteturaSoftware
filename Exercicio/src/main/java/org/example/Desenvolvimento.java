package org.example;

public class Desenvolvimento implements BonusStrategy {
    @Override
    public double calculaSalarioBonus(double salarioBase) {
        return salarioBase * 1.05;
    }
}
