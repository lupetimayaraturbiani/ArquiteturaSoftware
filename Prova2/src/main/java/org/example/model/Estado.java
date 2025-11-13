package org.example.model;

public interface Estado {
    void confirmar(Pedido p) throws Exception;
    void preparar(Pedido p) throws Exception;
    void entregar(Pedido p) throws Exception;
    void cancelar(Pedido p) throws Exception;
    String nome();
}
