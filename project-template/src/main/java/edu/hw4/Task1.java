package edu.hw4;

import java.util.List;

class Task1 {

    private Task1() {

    }

    public static List<Animal> getSortHeightAnimals(List<Animal> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).height() > list.get(j).height()) {
                    Animal temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
