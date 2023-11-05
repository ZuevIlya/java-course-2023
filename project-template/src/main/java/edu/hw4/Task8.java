package edu.hw4;

import java.util.List;
import java.util.Optional;

class Task8 {

    private Task8() {

    }

    public static Optional<Animal> getMostHeavyAnimal(List<Animal> list, int k) {
        Animal maxWeightAnimal = null;
        for (Animal animal: list) {
            if (animal.height() < k) {
                if ((maxWeightAnimal == null) || (animal.weight() > maxWeightAnimal.weight())) {
                    maxWeightAnimal = animal;
                }
            }
        }
        return Optional.ofNullable(maxWeightAnimal);
    }
}
