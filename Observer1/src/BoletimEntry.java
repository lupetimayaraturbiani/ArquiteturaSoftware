public class BoletimEntry {
    private final String nomeAluno;
    private final Double p1;
    private final Double p2;
    private final Double media;

    public BoletimEntry(String nomeAluno, Double p1, Double p2, Double media) {
        this.nomeAluno = nomeAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.media = media;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public Double getP1() {
        return p1;
    }

    public Double getP2() {
        return p2;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return nomeAluno + " | P1: " + (p1 == null ? "-" : p1)
                + " | P2: " + (p2 == null ? "-" : p2)
                + " | Média: " + (media == null ? "-" : String.format("%.2f", media));
    }
}
