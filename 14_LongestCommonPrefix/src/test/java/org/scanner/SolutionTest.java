package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        Solution solution = new Solution();
        String[] arr = new String[]{"flower","flow","flight"};
        String rsl = solution.longestCommonPrefix(arr);
        Assertions.assertEquals("fl", rsl);
    }
}