package edu.hw4;

import java.util.List;

class Task16 {

    private Task16() {

    }

    public static List<Animal> getSortedList(List<Animal> list) {
        list.sort((animal1, animal2) -> {
            Animal.Type type1 = animal1.type();
            Animal.Type type2 = animal2.type();
            int typeComp = type1.compareTo(type2);

            if (typeComp != 0) {
                return typeComp;
            }

            Animal.Sex sex1 = animal1.sex();
            Animal.Sex sex2 = animal2.sex();
            int sexComp = sex1.compareTo(sex2);

            if (sexComp != 0) {
                return typeComp;
            }

            return animal1.name().compareTo(animal2.name());
        });
        return list;
    }
}
