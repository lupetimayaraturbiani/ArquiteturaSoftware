package simulador;

import configuracao.Configuracao;

public class Simulador extends Thread {

    @Override
    public void run(){
        Configuracao config = Configuracao.getInstacia();
        System.out.println(config);
    }

    public static void main (String[] args){
        Simulador simula1 = new Simulador();
        Simulador simula2 = new Simulador();
        Simulador simula3 = new Simulador();
        Simulador simula4 = new Simulador();

        simula1.start();
        simula2.start();
        simula3.start();
        simula4.start();
    }
}
