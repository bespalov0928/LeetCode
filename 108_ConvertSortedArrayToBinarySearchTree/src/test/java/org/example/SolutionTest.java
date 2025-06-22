package org.example;


import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void sortedArrayToBST() {
        Solution solution = new Solution();
        TreeNode rsl = solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(rsl);
    }
}