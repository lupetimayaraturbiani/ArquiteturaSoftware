package org.example;

public class FabricaMoto implements TransporteFactory{
    @Override
    public Transporte criarTransporte(ListaTransportes tipo) {
        switch (tipo){
            case MOTO:
                return new Moto("moto comum");
            case MOTO_ELETRICA:
                return new MotoEletrica("moto elétrica");
            default:
                throw new IllegalArgumentException("Tipo de moto não suportado: " + tipo);
        }
    }
}
