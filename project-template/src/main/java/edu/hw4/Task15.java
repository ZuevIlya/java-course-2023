package edu.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Task15 {

    private Task15() {

    }

    public static Map<Animal.Type, Integer> getSumWeightsOfAnimals(List<Animal> list, int k, int l) {
        Map<Animal.Type, Integer> sumWeightsMap = new HashMap<>();
        for (Animal.Type type: Animal.Type.values()) {
            sumWeightsMap.put(type, 0);
        }
        for (Animal animal: list) {
            if ((animal.age() >= k) && (animal.age() <= l)) {
                int weight = sumWeightsMap.get(animal.type());
                weight = weight + animal.weight();
                sumWeightsMap.replace(animal.type(), weight);
            }
        }
        return sumWeightsMap;
    }
}
