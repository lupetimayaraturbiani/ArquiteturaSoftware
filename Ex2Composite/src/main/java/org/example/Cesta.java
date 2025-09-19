package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cesta implements Produto{
    private List<Produto> produtos = new ArrayList<>();

    public void add(Produto p){
        produtos.add(p);
    }

    @Override
    public double getPreco() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}
