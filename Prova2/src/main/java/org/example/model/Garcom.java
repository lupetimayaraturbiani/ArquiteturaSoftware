package org.example.model;

public class Garcom implements NotificadorPedido {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[Garçom]: " + mensagem);
    }
}
