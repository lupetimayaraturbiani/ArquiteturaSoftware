public class TarefaSingleton {

    private static TarefaSingleton instanciaUnica; // 🔹 única instância da classe
    private String codigo;
    private String descricao;
    private Estados estado;

    // 🔒 Construtor privado — impede criar instâncias fora da classe
    private TarefaSingleton(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estado = new Pendente(this);
    }

    // 🔹 Método de acesso à instância única (lazy initialization)
    public static TarefaSingleton getInstance(String codigo, String descricao) {
        if (instanciaUnica == null) {
            instanciaUnica = new TarefaSingleton(codigo, descricao);
        } else {
            System.out.println("⚠️ Já existe uma tarefa instanciada: " + instanciaUnica.getDescricao());
        }
        return instanciaUnica;
    }

    // 🔹 Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    // 🔹 Métodos de ação
    public void acionarAtrasar(){
        estado.atrasar();
    }

    public void acionarConcluida() {
        estado.concluir();
    }

    public void acionarPendente(){
        estado.pendente();
    }

}

