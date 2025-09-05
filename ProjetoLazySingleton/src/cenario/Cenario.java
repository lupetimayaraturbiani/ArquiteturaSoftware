package cenario;

public class Cenario {
    private static Cenario cenario = null;
    private static int cont = 0;
    private static final int MAX_INSTANCIAS = 3;

    private Cenario(){}

    public static Cenario getCenario(){
        if(cont < MAX_INSTANCIAS) {
            cont ++;
            cenario = new Cenario();
            cenario.configuracoes();
            return cenario;
        } else {
            System.out.println("Limite máximo de instâncias atingido.");
            return null;
        }
    }

    public static void configuracoes(){
        System.out.println("Configurando, aguarde...");
    }

}
