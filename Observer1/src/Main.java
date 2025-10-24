//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Turma turmaA = new Turma("3A - Programação");

        Aluno a1 = new Aluno("Ana");
        Aluno a2 = new Aluno("Bruno");
        Aluno a3 = new Aluno("Carlos");

        turmaA.adicionarAluno(a1);
        turmaA.adicionarAluno(a2);
        turmaA.adicionarAluno(a3);

        // Observers
        Professor prof = new Professor("Mariana");
        Coordenador coord = new Coordenador("Roberto");
        Diretor diretor = new Diretor("Sônia");

        turmaA.registerObserver(prof);
        turmaA.registerObserver(coord);
        turmaA.registerObserver(diretor);

        // atribuindo notas — a média será atualizada automaticamente nos setters
        a1.setP1(8.0);
        a1.setP2(7.5);

        a2.setP1(5.5);
        a2.setP2(4.0);

        a3.setP1(9.0); // p2 ainda não atribuída -> media parcial = 9.0 (conforme convenção)

        // publica boletim da turma -> todos observers recebem
        turmaA.publicarBoletim();

        // exemplo: atribui a p2 do Carlos e publica novamente
        a3.setP2(8.0); // agora média real será (9+8)/2
        turmaA.publicarBoletim();
    }
}