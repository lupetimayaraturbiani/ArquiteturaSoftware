public class Aluno {
    private final String nome;
    private Double p1;
    private Double p2;
    private Double media;

    public Aluno(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome.trim();
        this.p1 = null;
        this.p2 = null;
        this.media = null;
    }

    public String getNome() {
        return nome;
    }

    public Double getP1() {
        return p1;
    }

    public Double getP2() {
        return p2;
    }

    public Double getMedia() {
        return media;
    }

    public void setP1(Double nota) {
        this.p1 = validarNota(nota);
        atualizarMedia();
    }

    public void setP2(Double nota) {
        this.p2 = validarNota(nota);
        atualizarMedia();
    }

    private Double validarNota(Double nota) {
        if (nota == null) return null;
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve estar entre 0.0 e 10.0");
        }
        return nota;
    }

    private void atualizarMedia() {
        if (p1 == null && p2 == null) {
            media = null;
        } else if (p1 != null && p2 != null) {
            media = (p1 + p2) / 2.0;
        } else if (p1 != null) {
            media = p1;
        } else {
            media = p2;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", media=" + media +
                '}';
    }
}
