package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void getMinimumDifference() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));
        Solution solution = new Solution();
        int actual = solution.getMinimumDifference(root);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void getMinimumDifferenceV2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                        new TreeNode(12),
                        new TreeNode(49)));
        Solution solution = new Solution();
        int actual = solution.getMinimumDifference(root);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void getMinimumDifferenceV129() {
        TreeNode root = new TreeNode(236,
                new TreeNode(104, null, new TreeNode(227)),
                new TreeNode(701, null, new TreeNode(911)));
        Solution solution = new Solution();
        int actual = solution.getMinimumDifference(root);
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void getMinimumDifferenceV105() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        Solution solution = new Solution();
        int actual = solution.getMinimumDifference(root);
        Assertions.assertEquals(1, actual);
    }
}