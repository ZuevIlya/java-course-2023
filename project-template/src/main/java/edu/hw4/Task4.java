package edu.hw4;

import java.util.List;

class Task4 {

    private Task4() {

    }

    public static Animal getLongestName(List<Animal> list) {
        if (list.size() == 0) {
            return null;
        }
        Animal longestNameAnimal = list.get(0);
        for (Animal animal: list) {
            if (animal.name().length() > longestNameAnimal.name().length()) {
                longestNameAnimal = animal;
            }
        }
        return longestNameAnimal;
    }
}
