package edu.hw4;

import java.util.List;

class Task7 {

    private Task7() {

    }

    public static Animal getOldestAnimal(List<Animal> list, int k) {
        if ((k < 1) || (k > list.size())) {
            return null;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).age() < list.get(j).age()) {
                    Animal temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list.get(k - 1);
    }
}
