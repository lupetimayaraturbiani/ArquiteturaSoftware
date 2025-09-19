package org.example;

public class Main {
    public static void main(String[] args) {
        Painel tela = new Painel("Tela Principal");

        tela.add(new Texto("Bem-vindo(a) ao sistema!"));
        tela.add(new Botao("Login"));
        tela.add(new Botao("Cadastrar"));

        tela.render();
    }
}