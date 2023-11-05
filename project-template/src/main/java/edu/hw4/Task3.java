package edu.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Task3 {

    private Task3() {

    }

    public static Map<Animal.Type, Integer> getAnimalsWithAllTypes(List<Animal> list) {
        Map<Animal.Type, Integer> countOfAnimals = new HashMap<>();
        for (Animal.Type type: Animal.Type.values()) {
            countOfAnimals.put(type, 0);
        }
        for (Animal animal: list) {
            int count = countOfAnimals.get(animal.type());
            countOfAnimals.replace(animal.type(), count + 1);
        }
        return countOfAnimals;
    }
}
