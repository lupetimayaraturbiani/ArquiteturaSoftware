public class Concluida implements Estados{
    private String rotulo = "Concluida";
    private TarefaSingleton tarefa;

    public Concluida(TarefaSingleton tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        System.out.println("Já está concluída!");
    }

    @Override
    public void concluir() {
        System.out.println("Já está concluída!");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }
}
