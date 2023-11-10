package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 4, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 150, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 3, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 8, 3, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 2, 101, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        List<Animal> rightAnswerList = List.of(animal3, animal8);
        // when
        List<Animal> result = Task11.getBitesAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 4, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 150, 6, false);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 3, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 8, 3, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 2, 100, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        List<Animal> rightAnswerList = new ArrayList<>();
        // when
        List<Animal> result = Task11.getBitesAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<Animal> animals = new ArrayList<>();
        List<Animal> rightAnswerList = new ArrayList<>();
        // when
        List<Animal> result = Task11.getBitesAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }
}
