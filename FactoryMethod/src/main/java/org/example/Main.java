package org.example;

public class Main {
    public static void main(String[] args) {
        //criando bicicletas
        TransporteFactory fabricaBicicleta = new FabricaBicicleta();
        Transporte bike1 =fabricaBicicleta.criarTransporte(ListaTransportes.BICICLETA);
        bike1.realizarPercurso("rio de janeiro", "são paulo");
        bike1.entregar(true);

        Transporte bike2 = fabricaBicicleta.criarTransporte(ListaTransportes.BICICLETA_ELETRICA);
        bike2.realizarPercurso("guarulhos", "osasco");
        bike2.entregar(true);

        //criando motos
        TransporteFactory fabricaMoto = new FabricaMoto();
        Transporte moto1 = fabricaMoto.criarTransporte(ListaTransportes.MOTO);
        moto1.realizarPercurso("jurubatuba", "senac santo amaro");
        moto1.entregar(true);

        Transporte moto2 = fabricaMoto.criarTransporte(ListaTransportes.MOTO_ELETRICA);
        moto2.realizarPercurso("tremembé", "vila guilherme");
        moto2.entregar(true);
    }
}