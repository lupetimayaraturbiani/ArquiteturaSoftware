package org.example;

public class Main {
    public static void main(String[] args) {
        Cesta cesta = new Cesta();

        cesta.add(new ProdutoNormal("Nutella", 45));
        cesta.add(new ProdutoPromocional("Café Moído", 30, 25));

        System.out.println("Preço total da cesta: R$ " + cesta.getPreco());
    }
}