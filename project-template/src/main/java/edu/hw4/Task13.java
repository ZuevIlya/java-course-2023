package edu.hw4;

import java.util.ArrayList;
import java.util.List;

class Task13 {

    private Task13() {

    }

    public static List<Animal> getAnimalsWithMoreToWordsInName(List<Animal> list) {
        List<Animal> animalsWithLongNames = new ArrayList<>();
        for (Animal animal: list) {
            int words = animal.name().split("\s+").length;
            if (words > 2) {
                animalsWithLongNames.add(animal);
            }
        }
        return animalsWithLongNames;
    }
}
