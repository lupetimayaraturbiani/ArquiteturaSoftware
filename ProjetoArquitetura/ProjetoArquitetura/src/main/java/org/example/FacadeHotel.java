package org.example;

//classe Facade Hotel
public class FacadeHotel {
    //atributos
    private final GerenciarUsuario gereciadorUsuario;
    private final GerenciarPet gerenciadorPet;
    private final GerenciarAdocao gereciadorAdocao;

    //construtor
    public FacadeHotel(GerenciarUsuario um, GerenciarPet pm, GerenciarAdocao am) {
        this.gereciadorUsuario = um;
        this.gerenciadorPet = pm;
        this.gereciadorAdocao = am;
    }


    public Usuario cadastrarUsuario(String nome, String email) {
        return gereciadorUsuario.cadastrarUsuario(nome, email);
    }

    public Pet adicionarPet(String nome, String raca, int idade) {
        return gerenciadorPet.adicionarPet(nome, raca, idade);
    }

    public void atrelarPet(UsuarioInteressado interested) {
        gerenciadorPet.registerObserver(interested);
    }

    public void desatrelarPet(UsuarioInteressado interested) {
        gerenciadorPet.removeObserver(interested);
    }

    public void registrarAdocao(Usuario user, Pet pet) {
        gereciadorAdocao.registrarAdocao(user, pet);
    }
}

