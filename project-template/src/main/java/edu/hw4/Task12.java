package edu.hw4;

import java.util.List;

class Task12 {

    private Task12() {

    }

    public static int getCountOfAnimals(List<Animal> list) {
        int count = 0;
        for (Animal animal: list) {
            if (animal.weight() > animal.height()) {
                count = count + 1;
            }
        }
        return count;
    }
}
