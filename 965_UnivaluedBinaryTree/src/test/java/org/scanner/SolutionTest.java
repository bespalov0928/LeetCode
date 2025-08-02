package org.scanner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void isUnivalTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1, new TreeNode(1), new TreeNode(1)),
                new TreeNode(1, null, new TreeNode(1)));
        Solution solution = new Solution();
        boolean actual = solution.isUnivalTree(root);
        Assertions.assertTrue(actual);
    }

    @Test
    public void isUnivalTreeV1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1, new TreeNode(5), new TreeNode(1)),
                new TreeNode(1));
        Solution solution = new Solution();
        boolean actual = solution.isUnivalTree(root);
        Assertions.assertFalse(actual);
    }
}