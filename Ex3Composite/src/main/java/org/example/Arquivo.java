package org.example;

public class Arquivo implements FileSystemComponent {
    private String nome;
    private float tamanho;

    public Arquivo(String nome, float tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public float getTamanho() {
        return tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
