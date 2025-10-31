import padrao.Cliente;
import padrao.ClienteAdapter;
import padrao.ClienteLegado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClienteLegado clienteLegado = new ClienteLegado("Teste");

        Cliente cliente = new ClienteAdapter(clienteLegado);
        System.out.println(cliente.getNome());
    }
}