public class LojaFacade {
    private static LojaFacade instancia;

    private LojaFacade() {
        // Construtor privado para Singleton
    }

    public static LojaFacade getInstancia() {
        if (instancia == null) {
            instancia = new LojaFacade();
        }
        return instancia;
    }

    public Cliente criarCliente(String nome, String rua, int numero, Produto[] produtos) {
        Endereco endereco = new Endereco(rua, numero);
        return new Cliente(nome, endereco, produtos);
    }

    public Produto criarProduto(String nome, String categoria, double preco) {
        return new Produto(nome, categoria, preco);
    }
}
