package org.example.model;

public class PedidoFacade {
    public Pedido criarPedido(String nomeCliente, String descricao){
        Cliente cliente = new Cliente(nomeCliente);
        Pedido pedido = new Pedido(cliente, descricao);
        System.out.println("Pedido criado: " + pedido);
        return pedido;
    }

    public void confirmarPedido(Pedido p) throws Exception{
        p.confirmar();
    }
    public void prepararPedido(Pedido p) throws Exception{
        p.preparar();
    }
    public void entregarPedido(Pedido p) throws Exception{
        p.entregar();
    }
    public void cancelarPedido(Pedido p) throws Exception{
        p.cancelar();
    }
}
