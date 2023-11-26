package edu.hw5.Task8Test;

import edu.hw5.Task8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class String3Test {

    @Test
    @DisplayName("101")
    void test1() {
        // given
        String line3 = "0001000";

        // when
        boolean result = Task8.getMatchingStrings3(line3);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("0100")
    void test2() {
        // given
        String line3 = "0100";

        // when
        boolean result = Task8.getMatchingStrings3(line3);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("1: 0000")
    void test3() {
        // given
        String line3 = "101";

        // when
        boolean result = Task8.getMatchingStrings3(line3);

        // then
        assertFalse(result);
    }
}
