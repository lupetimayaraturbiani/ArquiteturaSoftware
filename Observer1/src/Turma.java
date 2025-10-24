import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma implements Subject{
    private final String nome;
    private final List<Aluno> alunos = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    public Turma(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da turma não pode ser vazio.");
        }
        this.nome = nome.trim();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAluno(Aluno a) {
        if (a == null) throw new IllegalArgumentException("Aluno não pode ser nulo.");
        alunos.add(a);
    }

    public void removerAluno(Aluno a) {
        alunos.remove(a);
    }

    public void publicarBoletim() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if (o == null) return;
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        List<BoletimEntry> snapshot = criarBoletimSnapshot();
        // copia para evitar concorrência/exposição
        List<Observer> observersCopy = new ArrayList<>(observers);
        for (Observer o : observersCopy) {
            try {
                o.update(this.nome, Collections.unmodifiableList(snapshot));
            } catch (Exception e) {
                System.err.println("Erro ao notificar observer: " + e.getMessage());
            }
        }
    }

    private List<BoletimEntry> criarBoletimSnapshot() {
        List<BoletimEntry> list = new ArrayList<>();
        for (Aluno a : alunos) {
            list.add(new BoletimEntry(a.getNome(), a.getP1(), a.getP2(), a.getMedia()));
        }
        return list;
    }
}
