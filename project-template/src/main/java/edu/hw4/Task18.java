package edu.hw4;

import java.util.List;

class Task18 {

    private Task18() {

    }

    public static Animal getTheHeaviestFish(List<List<Animal>> listOfLists) {
        Animal fishWithMaxWeight = null;
        for (List<Animal> list: listOfLists) {
            for (Animal animal: list) {
                if (animal.type() == Animal.Type.FISH) {
                    if ((fishWithMaxWeight == null) || (animal.weight() > fishWithMaxWeight.weight())) {
                        fishWithMaxWeight = animal;
                    }
                }
            }
        }
        return fishWithMaxWeight;

    }
}
