package org.example.controller;

import org.example.model.Pedido;
import org.example.model.PedidoFacade;

public class PedidoController {
    private final PedidoFacade facade;

    public PedidoController(PedidoFacade facade) {
        this.facade = facade;
    }

    public void confirmarPedido(Pedido p){
        try {
            facade.confirmarPedido(p);
        } catch (Exception e) {
            System.err.println("Erro ao confirmar: " + e.getMessage());
        }
    }

    public void enviarParaPreparo(Pedido p){
        try {
            facade.prepararPedido(p);
        } catch (Exception e) {
            System.err.println("Erro ao preparar: " + e.getMessage());
        }
    }

    public void entregarPedido(Pedido p){
        try {
            facade.entregarPedido(p);
        } catch (Exception e) {
            System.err.println("Erro ao entregar: " + e.getMessage());
        }
    }

    public void cancelarPedido(Pedido p) {
        try{
            facade.cancelarPedido(p);
        } catch (Exception e) {
            throw new IllegalStateException("Erro ao cancelar: " + e.getMessage());
        }
    }
}
