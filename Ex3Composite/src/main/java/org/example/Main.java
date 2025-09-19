package org.example;

public class Main {
    public static void main(String[] args) {
        Arquivo a1 = new Arquivo("foto.png", 2.5f);
        Arquivo a2 = new Arquivo("musica.mp3", 5.0f);

        Pasta pasta = new Pasta("Meus Arquivos");
        pasta.add(a1);
        pasta.add(a2);

        System.out.println("Pasta: " + pasta.getNome() + " - Tamanho total: " + pasta.getTamanho() + "MB");
    }
}