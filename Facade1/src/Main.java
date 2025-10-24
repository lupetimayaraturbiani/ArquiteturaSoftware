//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LojaFacade fachada = LojaFacade.getInstancia();

        // Criar alguns produtos
        Produto p1 = fachada.criarProduto("Notebook", "Eletrônicos", 4500.00);
        Produto p2 = fachada.criarProduto("Mouse", "Acessórios", 150.00);

        Produto[] listaProdutos = { p1, p2 };

        // Criar cliente
        Cliente c1 = fachada.criarCliente("Ana Silva", "Rua das Flores", 123, listaProdutos);

        // Exibir informações
        System.out.println(c1.toString());
    }
}