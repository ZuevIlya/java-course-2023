package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task15Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("Cat cat First", Animal.Type.CAT, Animal.Sex.F, 4, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("Dog dog First", Animal.Type.DOG, Animal.Sex.F, 4, 40, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 8, 3, 1, false);
        Animal animal8 = new Animal("Spider Second", Animal.Type.SPIDER, Animal.Sex.M, 2, 101, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Map<Animal.Type, Integer> rightAnswerMap = Map.of(
            Animal.Type.CAT, 8,
            Animal.Type.DOG, 14,
            Animal.Type.BIRD, 15,
            Animal.Type.FISH, 0,
            Animal.Type.SPIDER, 1
            );

        // when
        Map<Animal.Type, Integer> result = Task15.getSumWeightsOfAnimals(animals, 3,10);

        // then
        assertEquals(result, rightAnswerMap);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("Dog dog First", Animal.Type.DOG, Animal.Sex.F, 4, 40, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 12, false);
        List<Animal> animals = new ArrayList<>(List.of(animal2, animal3, animal4, animal5, animal6));
        Map<Animal.Type, Integer> rightAnswerMap = Map.of(
            Animal.Type.CAT, 0,
            Animal.Type.DOG, 14,
            Animal.Type.BIRD, 15,
            Animal.Type.FISH, 0,
            Animal.Type.SPIDER, 0
        );

        // when
        Map<Animal.Type, Integer> result = Task15.getSumWeightsOfAnimals(animals, 3,10);

        // then
        assertEquals(result, rightAnswerMap);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<Animal> animals = new ArrayList<>();
        Map<Animal.Type, Integer> rightAnswerMap = Map.of(
            Animal.Type.CAT, 0,
            Animal.Type.DOG, 0,
            Animal.Type.BIRD, 0,
            Animal.Type.FISH, 0,
            Animal.Type.SPIDER, 0
        );

        // when
        Map<Animal.Type, Integer> result = Task15.getSumWeightsOfAnimals(animals, 3,10);

        // then
        assertEquals(result, rightAnswerMap);
    }
}
