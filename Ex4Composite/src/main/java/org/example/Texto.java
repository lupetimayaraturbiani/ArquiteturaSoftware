package org.example;

public class Texto implements GUIComponent {
    private String conteudo;

    public Texto(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void render() {
        System.out.println("Renderizando texto: " + conteudo);
    }
}
