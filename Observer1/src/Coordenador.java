import java.util.List;

public class Coordenador implements Observer {
    private final String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String turmaNome, List<BoletimEntry> boletim) {
        System.out.println("Coordenador " + nome + " recebeu boletim da turma " + turmaNome + " (resumo):");
        for (BoletimEntry e : boletim) {
            // exemplo: destaca alunos com média abaixo de 6
            if (e.getMedia() != null && e.getMedia() < 6.0) {
                System.out.println("  [ATENÇÃO] " + e);
            } else {
                System.out.println("  " + e);
            }
        }
        System.out.println();
    }
}
