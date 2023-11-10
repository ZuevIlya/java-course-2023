package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 10, 10, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 9, 7, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 8, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,7, 5, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 6, 4, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 5, 3, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 4, 2, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 3, 1, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Map<Animal.Type, Integer> animalsMap = Map.of(Animal.Type.CAT, 2, Animal.Type.DOG, 2, Animal.Type.BIRD, 1,
            Animal.Type.FISH, 1, Animal.Type.SPIDER, 2);

        // when
        Map<Animal.Type, Integer> result = Task3.getAnimalsWithAllTypes(animals);

        // then
        assertEquals(result, animalsMap);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 10, 10, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 9, 7, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 8, 6, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3));
        Map<Animal.Type, Integer> animalsMap = Map.of(Animal.Type.CAT, 2, Animal.Type.DOG, 1, Animal.Type.BIRD, 0,
            Animal.Type.FISH, 0, Animal.Type.SPIDER, 0);

        // when
        Map<Animal.Type, Integer> result = Task3.getAnimalsWithAllTypes(animals);

        // then
        assertEquals(result, animalsMap);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<Animal> animals = new ArrayList<>();
        Map<Animal.Type, Integer> animalsMap = Map.of(Animal.Type.CAT, 0, Animal.Type.DOG, 0, Animal.Type.BIRD, 0,
            Animal.Type.FISH, 0, Animal.Type.SPIDER, 0);

        // when
        Map<Animal.Type, Integer> result = Task3.getAnimalsWithAllTypes(animals);

        // then
        assertEquals(result, animalsMap);
    }
}
