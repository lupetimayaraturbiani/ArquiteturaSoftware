package org.example.model;

public class EstadoCancelado implements Estado {

    @Override
    public void confirmar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido cancelado, operação inválida.");
    }

    @Override
    public void preparar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido cancelado, operação inválida.");
    }

    @Override
    public void entregar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido cancelado, operação inválida.");
    }

    @Override
    public void cancelar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido já esta cancelado");
    }

    @Override
    public String nome() {
        return "CANCELADO";
    }
}
