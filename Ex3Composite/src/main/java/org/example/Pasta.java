package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements FileSystemComponent {
    private String nome;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void add(FileSystemComponent c) {
        children.add(c);
    }

    @Override
    public float getTamanho() {
        return (float) children.stream().mapToDouble(FileSystemComponent::getTamanho).sum();
    }

    @Override
    public String getNome() {
        return nome;
    }
}
