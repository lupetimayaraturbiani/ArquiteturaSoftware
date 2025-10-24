public class Pendente implements Estados{
    private String rotulo = "Pendente";
    private TarefaSingleton tarefa;

    public Pendente(TarefaSingleton tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente!");
    }

    @Override
    public String toString() {
        return rotulo;
    }
}
