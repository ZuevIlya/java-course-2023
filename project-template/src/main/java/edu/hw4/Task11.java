package edu.hw4;

import java.util.ArrayList;
import java.util.List;

class Task11 {
    private final static int HEIGHT = 100;

    private Task11() {

    }

    public static List<Animal> getBitesAnimals(List<Animal> list) {
        List<Animal> bitesAnimalsList = new ArrayList<>();
        for (Animal animal: list) {
            if ((animal.bites()) && (animal.height() > HEIGHT)) {
                bitesAnimalsList.add(animal);
            }
        }
        return bitesAnimalsList;
    }
}
