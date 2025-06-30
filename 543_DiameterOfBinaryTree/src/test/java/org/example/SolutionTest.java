package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));
        Solution sol = new Solution();
        int actuator = sol.diameterOfBinaryTree(root);
        Assertions.assertEquals(3, actuator);

    }
    @Test
    public void diameterOfBinaryTreeV2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);
        Solution sol = new Solution();
        int actuator = sol.diameterOfBinaryTree(root);
        Assertions.assertEquals(1, actuator);

    }

}