package carroEletrico;

public interface VeiculoEletricoAutonomo extends Bateria, VeiculoAutonomo {
    public void monitorarBateria();
    public void definirRota(String partida, String destino);
}
