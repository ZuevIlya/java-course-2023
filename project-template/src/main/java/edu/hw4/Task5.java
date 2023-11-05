package edu.hw4;

import java.util.List;

class Task5 {

    private Task5() {

    }

    public static Animal.Sex getMaxCountOfSex(List<Animal> list) {
        int girls = 0;
        int boys = 0;
        for (Animal animal: list) {
            if (animal.sex().equals(Animal.Sex.F)) {
                girls = girls + 1;
            } else {
                boys = boys + 1;
            }
        }
        if (girls > boys) {
            return Animal.Sex.F;
        } else {
            return Animal.Sex.M;
        }
    }
}
