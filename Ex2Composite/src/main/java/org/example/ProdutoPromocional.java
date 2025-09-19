package org.example;

public class ProdutoPromocional implements Produto {
    private String nome;
    private double preco;
    private double desconto;

    public ProdutoPromocional(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double getPreco() {
        return preco - (preco * desconto / 100);
    }
}
