package org.example;

//classe usuario interessado que implementa interface observer
public class UsuarioInteressado implements Observer {
    private final Usuario user;

    public UsuarioInteressado(Usuario user) {
        this.user = user;
    }

    //sobreescrita metodo update
    @Override
    public void atualizar(Pet novoPet) {
        System.out.println("[NOTIF] Para " + user.getNome() + " (" + user.getEmail() + "): novo pet disponível -> " + novoPet);
    }

    public Usuario getUser() {
        return user;
    }
}

