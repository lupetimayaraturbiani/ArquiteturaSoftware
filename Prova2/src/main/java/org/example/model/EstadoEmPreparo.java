package org.example.model;

public class EstadoEmPreparo implements Estado {

    @Override
    public void confirmar(Pedido p) throws Exception {
        throw new IllegalStateException("Não pode confirmar enquanto em preparo...");
    }

    @Override
    public void preparar(Pedido p) throws Exception {
        throw new IllegalStateException("Já está em preparo!");
    }

    @Override
    public void entregar(Pedido p) throws Exception {
        p.setEstado(new EstadoEntregue());
        p.notificar("Pedido Entregue:\nID: " + p.getId());
    }

    @Override
    public void cancelar(Pedido p) throws Exception {
        throw new IllegalStateException("Não é possível cancelar pedido que está em preparação");
    }

    @Override
    public String nome() {
        return "EM_PREPARO";
    }
}
