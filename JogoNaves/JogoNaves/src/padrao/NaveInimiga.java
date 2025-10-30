
package padrao;

public class NaveInimiga implements Inimigo{
    private String nome;
    private Acao acao;

    public NaveInimiga(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(Acao acao) {
        this.acao=acao;
        System.out.println(nome+" - "+this.acao);
    }

    @Override
    public void adicinarAlvo(Jogador jogador) {
        jogador.adicionarInimigo(this);
    }
    
}
