package edu.hw4;

import java.util.List;

class Task9 {

    private Task9() {

    }

    public static int getCountOfPaws(List<Animal> list) {
        int count = 0;
        for (Animal animal: list) {
            count = count + animal.paws();
        }
        return count;
    }
}
