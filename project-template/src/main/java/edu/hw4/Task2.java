package edu.hw4;

import java.util.ArrayList;
import java.util.List;

class Task2 {

    private Task2() {

    }

    public static List<Animal> getSortWeightAnimals(List<Animal> list, int k) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).weight() < list.get(j).weight()) {
                    Animal temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        List<Animal> sortedList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            sortedList.add(list.get(i));
        }
        return sortedList;
    }
}
