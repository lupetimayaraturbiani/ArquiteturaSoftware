package org.example;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 5000, new Desenvolvimento());
        Funcionario f2 = new Funcionario("Maria", 4000, new Suporte());
        Funcionario f3 = new Funcionario("Natasha", 3500, new Outros());

        f1.mostrarSalario();
        f2.mostrarSalario();
        f3.mostrarSalario();
    }
}