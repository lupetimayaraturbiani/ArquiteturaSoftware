public class Atrasada implements Estados{
    private String rotulo = "Atrasada";
    private TarefaSingleton tarefa;

    public Atrasada(TarefaSingleton tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasar() {
        System.out.println("Já está atrasada!");
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está atrasada!");
    }
}
