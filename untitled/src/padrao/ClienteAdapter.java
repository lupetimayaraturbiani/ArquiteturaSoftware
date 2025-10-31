package padrao;

public class ClienteAdapter implements Cliente{
    private ClienteLegado clienteLegado;

    public ClienteAdapter(ClienteLegado clienteLegado) {
        this.clienteLegado = clienteLegado;
    }

    @Override
    public String getNome() {
        return clienteLegado.getNomeCliente();
    }
}
