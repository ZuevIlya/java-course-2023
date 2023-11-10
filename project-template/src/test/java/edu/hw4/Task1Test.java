package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 10, 35, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 10, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 15, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,17, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 10, 3, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 1, 3, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 2, 5, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        List<Animal> rightAnswerList = List.of(animal7, animal8, animal5, animal6, animal3, animal4, animal2, animal1);

        // when
        List<Animal> result = Task1.getSortHeightAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 10, 10, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 9, 10, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 8, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,7, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 6, 3, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 5, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 4, 4, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 3, 3, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        List<Animal> rightAnswerList = List.of(animal8, animal7, animal6, animal5, animal4, animal3, animal2, animal1);

        // when
        List<Animal> result = Task1.getSortHeightAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        Animal animal1 = new Animal("CatFirst", Animal.Type.CAT, Animal.Sex.F, 10, 10, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 9, 10, false);
        Animal animal3 = new Animal("DogFirst", Animal.Type.DOG, Animal.Sex.F, 4, 8, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 6,7, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 6, 3, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 5, 12, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 4, 4, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 3, 3, 3, true);
        List<Animal> animals = new ArrayList<>();
        List<Animal> rightAnswerList = new ArrayList<>();

        // when
        List<Animal> result = Task1.getSortHeightAnimals(animals);

        // then
        assertEquals(result, rightAnswerList);
    }
}

