package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void sumRootToLeaf() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0, new TreeNode(0), new TreeNode(1)),
                new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        Solution solution = new Solution();
        int rsl = solution.sumRootToLeaf(root);
        Assertions.assertEquals(22, rsl);
    }
}