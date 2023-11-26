package edu.hw5.Task8Test;

import edu.hw5.Task8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class String1Test {

    @Test
    @DisplayName("101")
    void test1() {
        // given
        String line1 = "101";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("10111")
    void test2() {
        // given
        String line1 = "10111";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("0000")
    void test3() {
        // given
        String line1 = "0000";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertFalse(result);
    }
}
