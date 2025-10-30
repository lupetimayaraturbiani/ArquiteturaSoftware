

package padrao;

import java.util.ArrayList;
import java.util.List;

public class NaveJogador implements Jogador{
    private List<Inimigo> lista;
    private String nome;
    private Acao acao;

    public NaveJogador(String nome) {
        this.nome=nome;
        lista=new ArrayList<>();
    }
    
    
    
    @Override
    public void adicionarInimigo(Inimigo inimigo) {
       lista.add(inimigo);
    }

    @Override
    public void adicionaAcoes(Acao acao) {
      this.acao=acao;
      notificar();
    }

    @Override
    public void notificar() {
      for(Inimigo inimigo:lista){
       inimigo.atualizar(acao);
      }
    }
    
}
