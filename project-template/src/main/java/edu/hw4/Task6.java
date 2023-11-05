package edu.hw4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Task6 {

    private Task6() {

    }

    public static Map<Animal.Type, Animal> getMaxWeightOfAllTypes(List<Animal> list) {
        Map<Animal.Type, Animal> maxWeightMap = new HashMap<>();
        for (Animal animal: list) {
            if (!maxWeightMap.containsKey(animal.type())) {
                maxWeightMap.put(animal.type(), animal);
            } else {
                int maxWeight = maxWeightMap.get(animal.type()).weight();
                if (animal.weight() > maxWeight) {
                    maxWeightMap.replace(animal.type(), animal);
                }
            }
        }
        return maxWeightMap;
    }
}
