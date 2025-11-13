package org.example.model;

public class EstadoConfirmado implements Estado {

    @Override
    public void confirmar(Pedido p) throws Exception {
        throw new IllegalStateException("Já esta confirmado");
    }

    @Override
    public void preparar(Pedido p) throws Exception {
        p.setEstado(new EstadoEmPreparo());
        p.notificar("Pedido em preparo:\nID: " + p.getId());
    }

    @Override
    public void entregar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido precisa ser preparado antes da entrega");
    }

    @Override
    public void cancelar(Pedido p) throws Exception {
        p.setEstado(new EstadoCancelado());
        p.notificar("Pedido cancelado:\nID: " + p.getId());
    }

    @Override
    public String nome() {
        return "CONFIRMADO";
    }
}
