package edu.hw4;

import java.util.List;

class Task14 {

    private Task14() {

    }

    public static boolean getDog(List<Animal> list, int k) {
        for (Animal animal: list) {
            if ((animal.type() == Animal.Type.DOG) && (animal.height() > k)) {
                return true;
            }
        }
        return false;
    }
}
