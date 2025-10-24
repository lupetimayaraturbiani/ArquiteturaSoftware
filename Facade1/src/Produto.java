public class Produto {
    private String nome;
    private String categoria;
    private double preco;

    public Produto() {
        this.nome = "Sem nome";
        this.categoria = "Geral";
        this.preco = 0.0;
    }

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (" + categoria + ") - R$" + preco;
    }
}
