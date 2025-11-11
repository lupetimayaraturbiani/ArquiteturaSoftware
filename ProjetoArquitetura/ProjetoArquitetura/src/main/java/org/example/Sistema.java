package org.example;

// Exemplificando Singleton: garante uma única instância do sistema
//classe sistemas
public class Sistema {
    //atributos
    private static Sistema instance;
    private final FacadeHotel facade;

    //construtor(sem parametros)
    private Sistema() {
        UserManager um = new UserManager();
        PetManager pm = new PetManager();
        AdoptionManager am = new AdoptionManager();
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
        User alice = f.registerUser("Alice", "alice@ex.com");
        User bruno = f.registerUser("Bruno", "bruno@ex.com");

        // Inscrever Alice para receber notificações
        InterestedUser intAlice = new InterestedUser(alice);
        f.subscribeToNewPets(intAlice);

        // Adicionar pets (cada add notifica inscritos)
        System.out.println("Adicionando pet 1...");
        Pet p1 = f.addPet("Luna", "SRD", 2);

        System.out.println("Adicionando pet 2...");
        Pet p2 = f.addPet("Thor", "Vira-lata", 3);

        // Bruno se inscreve só depois
        InterestedUser intBruno = new InterestedUser(bruno);
        f.subscribeToNewPets(intBruno);

        System.out.println("Adicionando pet 3...");
        Pet p3 = f.addPet("Mia", "Poodle", 1);

        // Adotar um pet
        f.registerAdoption(alice, p1);

        System.out.println("Demo finalizada.");
    }
}

