import java.util.Arrays;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Produto[] lista;

    public Cliente() {
        this.nome = "Sem nome";
        this.endereco = new Endereco();
        this.lista = new Produto[0];
    }

    public Cliente(String nome, Endereco endereco, Produto[] lista) {
        this.nome = nome;
        this.endereco = endereco;
        this.lista = lista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto[] getLista() {
        return lista;
    }

    public void setLista(Produto[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nEndereço: " + endereco + "\nProdutos: " + Arrays.toString(lista);
    }
}
