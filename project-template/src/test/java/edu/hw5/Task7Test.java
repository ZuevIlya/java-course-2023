package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task7Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String line1 = "11011";

        // when
        boolean result = Task7.getMatchingStrings1(line1);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        String line1 = "11111";

        // when
        boolean result = Task7.getMatchingStrings1(line1);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test3")
    void test3() {
        // given
        String line1 = "110113";

        // when
        boolean result = Task7.getMatchingStrings1(line1);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test4")
    void test4() {
        // given
        String line2 = "101";

        // when
        boolean result = Task7.getMatchingStrings2(line2);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test5")
    void test5() {
        // given
        String line2 = "100";

        // when
        boolean result = Task7.getMatchingStrings2(line2);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test6")
    void test6() {
        // given
        String line2 = "141";

        // when
        boolean result = Task7.getMatchingStrings2(line2);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test7")
    void test7() {
        // given
        String line3 = "10";

        // when
        boolean result = Task7.getMatchingStrings3(line3);

        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test8")
    void test8() {
        // given
        String line3 = "";

        // when
        boolean result = Task7.getMatchingStrings3(line3);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test9")
    void test9() {
        // given
        String line3 = "1011";

        // when
        boolean result = Task7.getMatchingStrings3(line3);

        // then
        assertFalse(result);
    }

    @Test
    @DisplayName("test10")
    void test10() {
        // given
        String line3 = "141";

        // when
        boolean result = Task7.getMatchingStrings3(line3);

        // then
        assertFalse(result);
    }
}
