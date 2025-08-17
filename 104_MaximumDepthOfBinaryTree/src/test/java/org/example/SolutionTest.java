package org.example;


import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void maxDepth() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));
        int rsl = s.maxDepth(root);
        System.out.println(rsl);
    }
}