package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String plate = "А123ВЕ777";


        // when
        boolean result = Task5.validateCarPlate(plate);


        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        String plate = "О777ОО177";


        // when
        boolean result = Task5.validateCarPlate(plate);


        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        String plate = "А123ВГ77";


        // when
        boolean result = Task5.validateCarPlate(plate);


        // then
        assertFalse(result);
    }
}
