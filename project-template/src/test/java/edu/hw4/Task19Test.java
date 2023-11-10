package edu.hw4;

import edu.hw4.Task19.Task19;
import edu.hw4.Task19.ValidationError;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task19Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Animal animal1 = new Animal("Cat First", Animal.Type.CAT, Animal.Sex.F, 4, 65, 8, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 5, false);
        Animal animal3 = new Animal("Dog First", Animal.Type.DOG, Animal.Sex.F, 4, 50, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, -6,50, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 25, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, null, 1, 10, 2, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 2, 3, 1, false);
        Animal animal8 = new Animal("", null, Animal.Sex.M, 2, 1, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Map<String, Set<ValidationError>> rightAnswerMap = Map.of(
            animal1.name(), Set.of(
                new ValidationError("Height", "Cats can't have that much height"),
                new ValidationError("Weight", "Cats can't have that much weight")
            ),
            animal4.name(), Set.of(
                new ValidationError("Age", "Age cannot be negative")
            ),
            animal6.name(), Set.of(
                new ValidationError("Sex", "Sex is null")
            ),
            animal8.name(), Set.of(
                new ValidationError("Name", "Empty name"),
                new ValidationError("Type", "You need to choose the type")
            )
        );

        // when
        Map<String, Set<ValidationError>> result = Task19.getAnimalErrors(animals);

        // then
        assertEquals(result, rightAnswerMap);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Animal animal1 = new Animal("Cat First", Animal.Type.CAT, Animal.Sex.F, 4, 30, 4, true);
        Animal animal2 = new Animal("CatSecond", Animal.Type.CAT, Animal.Sex.M, 12, 30, 5, false);
        Animal animal3 = new Animal("Dog First", Animal.Type.DOG, Animal.Sex.F, 4, 50, 6, true);
        Animal animal4 = new Animal("DogSecond", Animal.Type.DOG, Animal.Sex.M, 5,50, 8, false);
        Animal animal5 = new Animal("Bird", Animal.Type.BIRD, Animal.Sex.F, 4, 25, 15, false);
        Animal animal6 = new Animal("Fish", Animal.Type.FISH, Animal.Sex.M, 1, 10, 2, false);
        Animal animal7 = new Animal("SpiderFirst", Animal.Type.SPIDER, Animal.Sex.F, 2, 3, 1, false);
        Animal animal8 = new Animal("SpiderSecond", Animal.Type.SPIDER, Animal.Sex.M, 2, 1, 3, true);
        List<Animal> animals = new ArrayList<>(List.of(animal1, animal2, animal3, animal4, animal5, animal6, animal7, animal8));
        Map<String, Set<ValidationError>> rightAnswerMap = new HashMap<>();

        // when
        Map<String, Set<ValidationError>> result = Task19.getAnimalErrors(animals);

        // then
        assertEquals(result, rightAnswerMap);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<Animal> animals = new ArrayList<>();
        Map<String, Set<ValidationError>> rightAnswerMap = new HashMap<>();

        // when
        Map<String, Set<ValidationError>> result = Task19.getAnimalErrors(animals);

        // then
        assertEquals(result, rightAnswerMap);
    }
}
