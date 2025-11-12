package org.example;

// Exemplificando Singleton: garante uma única instância do sistema
//classe sistemas
public class Sistema {
    //atributos
    private static Sistema instance;
    private final FacadeHotel facade;

    //construtor(sem parametros)
    private Sistema() {
        GerenciarUsuario um = new GerenciarUsuario();
        GerenciarPet pm = new GerenciarPet();
        GerenciarAdocao am = new GerenciarAdocao();
        this.facade = new FacadeHotel(um, pm, am);
    }

    public static synchronized Sistema getInstance() {
        if (instance == null) {
            instance = new Sistema();
        }
        return instance;
    }

    public FacadeHotel getFacade() {
        return facade;
    }

    //Metodo demo pra testar simular sistema
    public void startDemo() {
        FacadeHotel f = getFacade();
        System.out.println("=== Demo Hotel da Maria (console) ===");

        // Cadastrar usuários
        Usuario alice = f.cadastrarUsuario("Alice", "alice@ex.com");
        Usuario bruno = f.cadastrarUsuario("Bruno", "bruno@ex.com");

        // Inscrever Alice para receber notificações
        UsuarioInteressado intAlice = new UsuarioInteressado(alice);
        f.atrelarPet(intAlice);

        // Adicionar pets (cada add notifica inscritos)
        System.out.println("Adicionando pet 1...");
        Pet p1 = f.adicionarPet("Luna", "SRD", 2);

        System.out.println("Adicionando pet 2...");
        Pet p2 = f.adicionarPet("Thor", "Vira-lata", 3);

        // Bruno se inscreve só depois
        UsuarioInteressado intBruno = new UsuarioInteressado(bruno);
        f.atrelarPet(intBruno);

        System.out.println("Adicionando pet 3...");
        Pet p3 = f.adicionarPet("Mia", "Poodle", 1);

        // Adotar um pet
        f.registrarAdocao(alice, p1);

        System.out.println("Demo finalizada.");
    }
}

