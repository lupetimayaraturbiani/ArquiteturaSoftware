package org.example;

public class Main {
    public static void main(String[] args) {
        Orcamento o1 = new Orcamento(1000);
        Orcamento o2 = new Orcamento(2000);
        Orcamento o3 = new Orcamento(500);

        System.out.println("Orçamento 1 com ip1: " + o1.calcularComImposto(new ImpostoIp1()));
        System.out.println("Orçamento 2 com ip2: " + o2.calcularComImposto(new ImpostoIp2()));
        System.out.println("Orçamento 3 com ip3: " + o3.calcularComImposto(new ImpostoIp3()));
    }
}