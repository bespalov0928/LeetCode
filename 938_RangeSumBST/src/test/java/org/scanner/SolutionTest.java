package org.scanner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void rangeSumBST() {
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));
        Solution solution = new Solution();
        int actual = solution.rangeSumBST(root, 7, 15);
        Assertions.assertEquals(32, actual);
    }
}