import cenario.Cenario;

public class Main {
    public static void main(String[] args) {
        Cenario cenario = Cenario.getCenario();
        Cenario cenario1 = Cenario.getCenario();
        Cenario cenario2 = Cenario.getCenario();
        Cenario cenario3 = Cenario.getCenario();
        System.out.println(cenario);
        System.out.println(cenario1);
        System.out.println(cenario2);
        System.out.println(cenario3);
    }
}