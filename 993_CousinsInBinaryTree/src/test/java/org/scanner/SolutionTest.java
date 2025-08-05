package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isCousins() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3));
        Solution solution = new Solution();
        boolean expected = solution.isCousins(root, 4, 3);
        Assertions.assertFalse(expected);
    }

    @Test
    void isCousinsV2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4)),
                new TreeNode(3, null, new TreeNode(5)));
        Solution solution = new Solution();
        boolean expected = solution.isCousins(root, 5, 4);
        Assertions.assertTrue(expected);
    }

    @Test
    void isCousinsV3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4)),
                new TreeNode(3));
        Solution solution = new Solution();
        boolean expected = solution.isCousins(root, 2, 3);
        Assertions.assertFalse(expected);
    }

    @Test
    void isCousinsV4() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(8, new TreeNode(9), null),
                        new TreeNode(3,
                                null,
                                new TreeNode(4, new TreeNode(6), null))),
                new TreeNode(5, null, new TreeNode(7)));
        Solution solution = new Solution();
        boolean expected = solution.isCousins(root, 9, 4);
        Assertions.assertTrue(expected);
    }
}