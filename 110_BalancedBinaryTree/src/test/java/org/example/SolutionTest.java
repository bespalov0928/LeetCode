package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void isBalanced() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        boolean rsl = s.isBalanced(root);
        System.out.println(rsl);
        Assertions.assertTrue(rsl);
    }

    @Test
    public void isBalancedV2() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        boolean rsl = s.isBalanced(root);
        System.out.println(rsl);
        Assertions.assertFalse(rsl);
    }

    @Test
    public void isBalancedV3() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9
                        , new TreeNode(14),
                        new TreeNode(10)
                ),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7
//                                ,new TreeNode(14),
//                                new TreeNode(10)
                        )));
        boolean rsl = s.isBalanced(root);
        System.out.println(rsl);
//        Assertions.assertFalse(rsl);
        Assertions.assertTrue(rsl);
    }
}