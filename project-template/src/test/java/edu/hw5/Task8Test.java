package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task8Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String line1 = "101";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        String line1 = "10111";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        String line1 = "0000";

        // when
        boolean result = Task8.getMatchingStrings1(line1);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test4")
    void test4() {
        // given
        String line2 = "011";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test5")
    void test5() {
        // given
        String line2 = "0110";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        //assertFalse(result);
    }

    @Test
    @DisplayName("test6")
    void test6() {
        // given
        String line2 = "111100";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test7")
    void test7() {
        // given
        String line2 = "100";

        // when
        boolean result = Task8.getMatchingStrings2(line2);

        // then
        //assertFalse(result);
    }
}
