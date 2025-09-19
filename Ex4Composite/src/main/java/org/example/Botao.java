package org.example;

public class Botao implements GUIComponent {
    private String nome;

    public Botao(String nome) {
        this.nome = nome;
    }

    @Override
    public void render() {
        System.out.println("Renderizando botão: " + nome);
    }
}
