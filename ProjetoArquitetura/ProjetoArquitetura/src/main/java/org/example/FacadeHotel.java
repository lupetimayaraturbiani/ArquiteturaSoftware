package org.example;

//classe Facade Hotel
public class FacadeHotel {
    //atributos
    private final UserManager userManager;
    private final PetManager petManager;
    private final AdoptionManager adoptionManager;

    //construtor
    public FacadeHotel(UserManager um, PetManager pm, AdoptionManager am) {
        this.userManager = um;
        this.petManager = pm;
        this.adoptionManager = am;
    }


    public User registerUser(String nome, String email) {
        return userManager.registerUser(nome, email);
    }

    public Pet addPet(String nome, String raca, int idade) {
        return petManager.addPet(nome, raca, idade);
    }

    public void subscribeToNewPets(InterestedUser interested) {
        petManager.registerObserver(interested);
    }

    public void unsubscribeFromNewPets(InterestedUser interested) {
        petManager.removeObserver(interested);
    }

    public void registerAdoption(User user, Pet pet) {
        adoptionManager.registerAdoption(user, pet);
    }
}

