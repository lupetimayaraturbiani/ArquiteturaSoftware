package org.example.model;

public class Cozinha implements NotificadorPedido {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("[Cozinha]: " + mensagem);
    }
}
