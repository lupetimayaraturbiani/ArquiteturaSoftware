import java.util.List;

public class Professor implements Observer{
    private final String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String turmaNome, List<BoletimEntry> boletim) {
        System.out.println("Professor " + nome + " recebeu boletim da turma " + turmaNome + ":");
        for (BoletimEntry e : boletim) {
            System.out.println("  " + e);
        }
        System.out.println();
    }
}
