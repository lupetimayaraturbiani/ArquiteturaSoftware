package configuracao;

public class Configuracao {
    private static Configuracao config;

    public Configuracao() {
    }

    public static Configuracao getInstacia(){
        if (config == null) {
              config = new Configuracao();
        }
        return config;
    }
}
