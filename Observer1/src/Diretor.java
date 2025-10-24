import java.util.List;

public class Diretor implements Observer{
    private final String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String turmaNome, List<BoletimEntry> boletim) {
        System.out.println("Diretor " + nome + " recebeu boletim da turma " + turmaNome + " — número de alunos: " + boletim.size());
        long reprovados = boletim.stream().filter(e -> e.getMedia() != null && e.getMedia() < 6.0).count();
        System.out.println("  Alunos abaixo de 6.0: " + reprovados);
        System.out.println();
    }
}
