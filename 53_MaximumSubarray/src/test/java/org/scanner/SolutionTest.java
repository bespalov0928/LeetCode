package org.scanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    void maxSubArrayCase1() {
        Solution sol = new Solution();
        int rsl = sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println("rsl: " + rsl);
    }
}