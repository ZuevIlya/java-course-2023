package edu.hw4;

import java.util.ArrayList;
import java.util.List;

class Task10 {

    private Task10() {

    }

    public static List<Animal> getAnimals(List<Animal> list) {
        List<Animal> animalsWithDiffPawsAndAge = new ArrayList<>();
        for (Animal animal: list) {
            if (animal.age() != animal.paws()) {
                animalsWithDiffPawsAndAge.add(animal);
            }
        }
        return animalsWithDiffPawsAndAge;
    }
}
