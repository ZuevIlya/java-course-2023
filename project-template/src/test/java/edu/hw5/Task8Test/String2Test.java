package edu.hw5.Task8Test;

import edu.hw5.Task8;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class String2Test {

    @Test
    @DisplayName("first 0 odd 001")
    void test4() {
        // given
        String line2 = "001";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("first 0 even 001111")
    void test5() {
        // given
        String line2 = "001111";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("first 1 even 111101")
    void test6() {
        // given
        String line2 = "111101";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("first 1 odd 11000")
    void test7() {
        // given
        String line2 = "11000";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertFalse(result);
    }
}
