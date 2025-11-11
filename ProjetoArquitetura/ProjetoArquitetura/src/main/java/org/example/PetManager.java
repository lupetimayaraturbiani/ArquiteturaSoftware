package org.example;

import java.util.ArrayList;
import java.util.List;

//classe de gereciamento de pets
public class PetManager {
    //atributos
    private final List<Pet> pets = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();
    private int nextId = 1;

    //construtor
    public Pet addPet(String nome, String raca, int idade) {
        Pet pet = new Pet(nextId++, nome, raca, idade);
        pets.add(pet);
        notifyObservers(pet);
        return pet;
    }

    //metodos de gerenciamento
    public List<Pet> listPets() {
        return new ArrayList<>(pets);
    }

    public void registerObserver(Observer o) {
        if (!observers.contains(o)) observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    private void notifyObservers(Pet p) {
        for (Observer o : observers) {
            o.update(p);
        }
    }
}

