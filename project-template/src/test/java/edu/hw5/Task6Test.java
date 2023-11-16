package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task6Test {

    @Test
    @DisplayName("test1")
    void test1() {
        // given
        String t = "achfdbaabgabcaabg";
        String s = "abc";

        // when
        boolean result = Task6.isSubsequence(s, t);


        // then
        assertTrue(result);
    }

    @Test
    @DisplayName("test2")
    void test2() {
        // given
        String t = "achfdbaabgabcaabg";
        String s = "abcd";

        // when
        boolean result = Task6.isSubsequence(s, t);


        // then
        assertFalse(result);
    }
}
