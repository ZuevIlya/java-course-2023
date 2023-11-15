package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        int year = 1925;
        List<LocalDate> result = List.of(LocalDate.of(1925, 2, 13), LocalDate.of(1925, 3, 13), LocalDate.of(1925, 11, 13));


        // when
        List<LocalDate> fridaysOn13th = Task2.findFridaysOn13th(year);


        // then
        assertEquals(fridaysOn13th, result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        LocalDate date = LocalDate.of(2023, 5, 20);
        LocalDate result = LocalDate.of(2023, 5, 5);


        // when
        LocalDate nextFriday13th = Task2.findNextFriday13th(date);


        // then
        assertEquals(nextFriday13th, result);
    }
}
