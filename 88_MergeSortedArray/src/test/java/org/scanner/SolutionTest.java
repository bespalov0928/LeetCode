package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeV1() {

        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        int[] extend = new int[]{1, 2, 2, 3, 5, 6};
        Assertions.assertArrayEquals(nums1, extend);
    }
}