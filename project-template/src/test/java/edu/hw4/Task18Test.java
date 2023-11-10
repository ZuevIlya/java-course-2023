package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task18Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("Cat cat First", Animal.Type.CAT, Animal.Sex.F, 4, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("DogZog First", Animal.Type.DOG, Animal.Sex.M, 4, 40, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 15, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal animal8 = new Animal("Spider Second", Animal.Type.SPIDER, Animal.Sex.F, 2, 101, 3, true);
        List<Animal> animals1 = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Animal fish1 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 10, false);
        Animal fish2 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 5, false);
        Animal fish3 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 14, false);
        Animal fish4 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 11, false);
        List<Animal> animals2 = new ArrayList<>(List.of(fish1, fish2, fish3, fish4));
        List<List<Animal>> listOfLists = List.of(animals1, animals2);

        // when
        Animal result = Task18.getTheHeaviestFish(listOfLists);

        // then
        assertEquals(result, animal6);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal1 = new Animal("Cat cat First", Animal.Type.CAT, Animal.Sex.F, 4, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("DogZog First", Animal.Type.DOG, Animal.Sex.M, 4, 40, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 15, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.M, 8, 3, 1, true);
        Animal animal8 = new Animal("Spider Second", Animal.Type.SPIDER, Animal.Sex.F, 2, 101, 3, true);
        List<Animal> animals1 = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Animal fish1 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 10, false);
        Animal fish2 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 5, false);
        Animal fish3 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 30, false);
        Animal fish4 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 11, false);
        List<Animal> animals2 = new ArrayList<>(List.of(fish1, fish2, fish3, fish4));
        List<List<Animal>> listOfLists = List.of(animals1, animals2);

        // when
        Animal result = Task18.getTheHeaviestFish(listOfLists);

        // then
        assertEquals(result, fish3);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<Animal> animals1 = new ArrayList<>();

        List<Animal> animals2 = new ArrayList<>();
        List<List<Animal>> listOfLists = List.of(animals1, animals2);

        // when
        Animal result = Task18.getTheHeaviestFish(listOfLists);

        // then
        assertNull(result);
    }
}
