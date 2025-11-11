package org.example;

public class Tesla implements VeiculoEletricoAutonomo{
    private String partida, destino;
    private int carga;
    private boolean modoAutonomo;

    public Tesla(String partida) {
        this.partida = partida;
    }

    @Override
    public void monitorarBateria() {
        System.out.println("Carga da bateria: " + carga);
    }

    @Override
    public void definirRota(String partida, String destino) {
        this.partida = partida;
        this.destino = destino;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando....");
    }

    @Override
    public void ligarModoAutonomo() {
        modoAutonomo = true;
    }

    @Override
    public void desligarModoAutonomo() {
        modoAutonomo = false;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "partida='" + partida + '\'' +
                ", destino='" + destino + '\'' +
                ", carga=" + carga +
                ", modoAutonomo=" + modoAutonomo +
                '}';
    }
}
