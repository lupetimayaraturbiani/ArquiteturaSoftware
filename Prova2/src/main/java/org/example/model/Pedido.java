package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject{
    private static int count = 1;

    private final int id;
    private final Cliente cliente;
    private String descricao;
    private Estado estado;
    private final List<NotificadorPedido> notificacoes = new ArrayList<>();

    public Pedido(Cliente cliente, String descricao) {
        this.id = count++;
        this.cliente = cliente;
        this.descricao = descricao;
        this.estado = new EstadoCriado();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pedido.count = count;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado novo) throws Exception{
        if(notificacoes.isEmpty() && !(novo instanceof EstadoCancelado)){
            throw new IllegalStateException("Uma instância não pode mudar de estado sem ter ao menos um notificado");
        }
        this.estado = novo;
    }

    public List<NotificadorPedido> getNotificacoes() {
        return notificacoes;
    }

    @Override
    public void adicionar(NotificadorPedido notificadorP) {
        if(notificadorP != null) {
            notificacoes.add(notificadorP);
        }
    }

    @Override
    public void remover(NotificadorPedido notificadorP) {
        notificacoes.remove(notificadorP);
    }

    @Override
    public void notificar(String msg) {
        for (NotificadorPedido notificador : new ArrayList<>(notificacoes)) {
            notificador.atualizar(msg);
        }
    }

    public void confirmar() throws Exception{
        estado.confirmar(this);
    }
    public void preparar() throws Exception{
        estado.preparar(this);
    }
    public void entregar() throws Exception{
        estado.entregar(this);
    }
    public void cancelar() throws Exception{
        estado.cancelar(this);
    }

    @Override
    public String toString() {
        return "Informações do Pedido\nId: " + id + "\nCliente: " + cliente + "\nDescricao: " + descricao + "\nEstado: " + estado.nome();
    }
}
