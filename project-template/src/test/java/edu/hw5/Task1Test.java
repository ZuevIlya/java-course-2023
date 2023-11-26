package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        List<String> input = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-04-02, 01:20"
        );
        String rightAnswer = "3ч 40м";

        // when
        String result = Task1.calculateAverageTime(input);


        // then
        assertEquals(result, rightAnswer);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        List<String> input = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-05-02, 01:20"
        );
        String rightAnswer = "363ч 40м";

        // when
        String result = Task1.calculateAverageTime(input);


        // then
        assertEquals(result, rightAnswer);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        List<String> input = List.of(
            "2022-03-12, 20:20 - 2022-03-12, 23:50",
            "2022-04-01, 21:30 - 2022-05-02, 03:20"
        );
        String rightAnswer = "364ч 40м";

        // when
        String result = Task1.calculateAverageTime(input);


        // then
        assertEquals(result, rightAnswer);
    }
}
