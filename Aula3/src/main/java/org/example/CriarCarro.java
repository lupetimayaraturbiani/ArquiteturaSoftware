package org.example;

import carroEletrico.Tesla;

public class CriarCarro {
    public static void main(String[] args) {
        Tesla models = new Tesla(100);
        models.definirRota("Zona Norte", "Senac");


    }
}