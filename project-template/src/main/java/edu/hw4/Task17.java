package edu.hw4;

import java.util.List;

class Task17 {

    private Task17() {

    }

    public static boolean getInfoAboutBites(List<Animal> list) {
        int dogs = 0;
        int bitesDogs = 0;
        int spiders = 0;
        int bitesSpiders = 0;
        for (Animal animal: list) {
            if (animal.type() == Animal.Type.DOG) {
                dogs = dogs + 1;
                if (animal.bites()) {
                    bitesDogs = bitesDogs + 1;
                }
            }
            if (animal.type() == Animal.Type.SPIDER) {
                spiders = spiders + 1;
                if (animal.bites()) {
                    bitesSpiders = bitesSpiders + 1;
                }
            }
        }
        if ((dogs == 0) || (spiders == 0)) {
            return false;
        } else {
            return (bitesSpiders / spiders) > (bitesDogs / dogs);
        }

    }
}
