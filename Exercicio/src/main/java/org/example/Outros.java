package org.example;

public class Outros implements BonusStrategy{
    @Override
    public double calculaSalarioBonus(double salarioBase) {
        return salarioBase * 1.03;
    }
}
