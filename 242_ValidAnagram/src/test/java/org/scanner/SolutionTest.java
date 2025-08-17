package org.scanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        Solution solution = new Solution();
        boolean rsl = solution.isAnagram("anagram", "nagaram");
        assertTrue(rsl);
    }
}