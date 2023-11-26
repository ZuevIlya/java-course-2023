package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String password = "securePassword";

        // when
        boolean result = Task4.validatePassword(password);


        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        String password = "strongPassword@123";

        // when
        boolean result = Task4.validatePassword(password);


        // then
        assertTrue(result);
    }
}
