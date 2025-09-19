package org.example;

public class ProdutoNormal implements Produto {
    private String nome;
    private double preco;

    public ProdutoNormal(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
