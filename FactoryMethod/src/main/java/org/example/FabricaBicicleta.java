package org.example;

public class FabricaBicicleta implements TransporteFactory{
    @Override
    public Transporte criarTransporte(ListaTransportes tipo) {
        switch(tipo){
            case BICICLETA:
                return new Bicicleta("bicicleta comum");
            case BICICLETA_ELETRICA:
                return new BicicletaEletrica("bicicleta elétrica");
            default:
                throw new IllegalArgumentException("Tipo de bicicleta não suportado: " + tipo);
        }
    }
}
