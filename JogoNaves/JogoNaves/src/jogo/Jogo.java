
package jogo;
import padrao.*;
public class Jogo {

    public static void main(String[] args) {
        Jogador naveJogador=new NaveJogador("Nave do Gerson");
        Inimigo inimigo1=new NaveInimiga("Inimigo1");
        Inimigo inimigo2=new NaveInimiga("Inimigo2");
        Inimigo inimigo3=new NaveInimiga("Inimigo3");
        
        inimigo1.adicinarAlvo(naveJogador);
        inimigo2.adicinarAlvo(naveJogador);
        inimigo3.adicinarAlvo(naveJogador);
        
        naveJogador.adicionaAcoes(Acao.RECUAR);
        naveJogador.adicionaAcoes(Acao.VIRAR_DIREITA);
        naveJogador.adicionaAcoes(Acao.VIRAR_ESQUERDA);
    }
    
}
