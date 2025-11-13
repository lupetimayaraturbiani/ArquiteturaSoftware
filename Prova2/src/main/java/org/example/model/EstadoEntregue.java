package org.example.model;

public class EstadoEntregue implements Estado{

    @Override
    public void confirmar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido já foi entregue.");
    }

    @Override
    public void preparar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido já foi entregue.");
    }

    @Override
    public void entregar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido já foi entregue.");
    }

    @Override
    public void cancelar(Pedido p) throws Exception {
        throw new IllegalStateException("Não é possível cancelar um pedido que já foi entregue.");
    }

    @Override
    public String nome() {
        return "ENTREGUE";
    }
}
