package org.example;

import java.util.ArrayList;
import java.util.List;

public class Painel implements GUIComponent{
    private String nome;
    private List<GUIComponent> components = new ArrayList<>();

    public Painel(String nome) {
        this.nome = nome;
    }

    public void add(GUIComponent c) {
        components.add(c);
    }

    @Override
    public void render() {
        System.out.println("Painel: " + nome);
        for (GUIComponent c : components) {
            c.render();
        }
    }
}
