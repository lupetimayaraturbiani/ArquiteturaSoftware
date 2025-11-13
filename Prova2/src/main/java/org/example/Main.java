package org.example;

import org.example.model.Pedido;
import org.example.controller.PedidoController;
import org.example.model.PedidoFacade;
import org.example.model.Cozinha;
import org.example.model.Garcom;

public class Main {
    public static void main(String[] args) {
        try {
            PedidoFacade facade = new PedidoFacade();
            Pedido pedido = facade.criarPedido("João da Silva", "1x Pizza Calabresa");

            pedido.adicionar(new Garcom());
            pedido.adicionar(new Cozinha());

            PedidoController controller = new PedidoController(facade);

            controller.confirmarPedido(pedido);
            controller.enviarParaPreparo(pedido);
            controller.entregarPedido(pedido);

            Pedido pedido2 = facade.criarPedido("Maria", "2x Suco Natural");
            pedido2.adicionar(new Garcom());
            controller.cancelarPedido(pedido2);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}