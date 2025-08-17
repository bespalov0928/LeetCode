package org.example;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void findTarget() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));

        Solution s = new Solution();
        boolean actual = s.findTarget(root, 9);
        Assertions.assertTrue(actual);
    }
    @Test
    public void findTargetV2() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                new TreeNode(6, null, new TreeNode(7)));

        Solution s = new Solution();
        boolean actual = s.findTarget(root, 28);
        Assertions.assertFalse(actual);
    }
}