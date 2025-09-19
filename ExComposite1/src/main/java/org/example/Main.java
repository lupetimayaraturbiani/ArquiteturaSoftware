package org.example;

public class Main {
    public static void main(String[] args) {
        Departamento d1 = new Departamento("Financeiro", 50000, 10);
        Departamento d2 = new Departamento("Recursos Humanos", 30000, 5);
        Departamento d3 = new Departamento("TI", 70000, 15);
        Departamento d4 = new Departamento("Comercial", 40000, 8);


        Diretoria g1 = new Diretoria("Gerência A");
        g1.add(d1);
        g1.add(d2);

        Diretoria g2 = new Diretoria("Gerência B");
        g2.add(d3);
        g2.add(d4);

        Diretoria diretoria = new Diretoria("Diretoria Geral");
        diretoria.add(g1);
        diretoria.add(g2);

        System.out.println(diretoria);
    }
}