package org.example.model;

public class EstadoCriado implements Estado{

    @Override
    public void confirmar(Pedido p) throws Exception {
        p.setEstado(new EstadoConfirmado());
        p.notificar("Pedido confirmado!\nID: " + p.getId());
    }

    @Override
    public void preparar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido precisa ser confirmado antes do preparo");
    }

    @Override
    public void entregar(Pedido p) throws Exception {
        throw new IllegalStateException("Pedido precisa ser confirmado antes da entrega");
    }

    @Override
    public void cancelar(Pedido p) throws Exception {
        p.setEstado(new EstadoCancelado());
        p.notificar("Pedido cancelado:\nID: " + p.getId());
    }

    @Override
    public String nome() {
        return "CRIADO";
    }
}
