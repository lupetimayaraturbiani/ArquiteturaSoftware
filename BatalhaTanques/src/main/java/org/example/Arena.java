package org.example;

import roboTanque.CoresRGB;
import roboTanque.RoboTanque;

public class Arena {
    public static void main(String[] args) {
        RoboTanque xaropada = new RoboTanque(0,0, CoresRGB.GREEN, CoresRGB.BLUE);
        xaropada.movNorte();
        xaropada.movNorte();
        xaropada.movLeste();
        xaropada.atirar();
        System.out.println(xaropada);
    }
}