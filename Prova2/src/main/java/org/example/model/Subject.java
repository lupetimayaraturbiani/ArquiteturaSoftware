package org.example.model;

public interface Subject {
    void adicionar(NotificadorPedido notificadorP);
    void remover(NotificadorPedido notificadorP);
    void notificar(String msg);
}
