package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void sumOfLeftLeaves() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        int actual = s.sumOfLeftLeaves(root);
        Assertions.assertEquals(24, actual);
    }
}