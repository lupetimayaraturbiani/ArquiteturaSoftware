//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TarefaSingleton tarefa1 = TarefaSingleton.getInstance("001", "Realizar um exemplo de padrão State");
        System.out.println("Estado atual: " + tarefa1.getEstado());
        tarefa1.acionarAtrasar();

        TarefaSingleton tarefa2 = TarefaSingleton.getInstance("002", "Outra descrição qualquer");
        System.out.println("Mesma instância? " + (tarefa1 == tarefa2)); // true
    }
}