package org.example;

//classe usuario interessado que implementa interface observer
public class InterestedUser implements Observer {
    private final User user;

    public InterestedUser(User user) {
        this.user = user;
    }

    //sobreescrita metodo update
    @Override
    public void update(Pet novoPet) {
        System.out.println("[NOTIF] Para " + user.getNome() + " (" + user.getEmail() + "): novo pet disponível -> " + novoPet);
    }

    public User getUser() {
        return user;
    }
}

