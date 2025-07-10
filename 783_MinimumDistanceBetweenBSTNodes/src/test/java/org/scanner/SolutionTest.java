package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void minDiffInBST() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6));
        Solution solution = new Solution();
        int actual = solution.minDiffInBST(root);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void minDiffInBSTV2() {
        TreeNode root = new TreeNode(90,
                new TreeNode(69,
                        new TreeNode(49, null, new TreeNode(52)),
                        new TreeNode(89)),
                null);
        Solution solution = new Solution();
        int actual = solution.minDiffInBST(root);
        Assertions.assertEquals(1, actual);
    }
}