package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchInsert() {
    Solution s = new Solution();
    int[] arr = new int[]{1,3,5,6};
    int rsl = s.searchInsert(arr, 5);
        Assertions.assertEquals(5, rsl);
    }
    @Test
    void searchInsertV2() {
    Solution s = new Solution();
    int[] arr = new int[]{1,3,5,6};
    int actual = s.searchInsert(arr, 2);
        Assertions.assertEquals(1, actual);
    }
}