package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        Optional rightAnswer = Optional.of("2020-10-10");

        // when
        Optional result = Task3.parseDate("2020-10-10");


        // then
        assertEquals(rightAnswer.toString(), result.toString());
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        Optional rightAnswer = Optional.of("2020-12-02");

        // when
        Optional result = Task3.parseDate("2020-12-2");


        // then
        assertEquals(rightAnswer.toString(), result.toString());
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given

        // when
        Optional result = Task3.parseDate("1/3/20");


        // then
        assertEquals(Optional.empty(), result);
    }
}
