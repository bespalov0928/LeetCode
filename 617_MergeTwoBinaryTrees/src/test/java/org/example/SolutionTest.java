package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void mergeTrees() {
        TreeNode root1 = new TreeNode(1,
                new TreeNode(3, new TreeNode(5),null),
                new TreeNode(2));
        TreeNode root2 = new TreeNode(2,
                new TreeNode(1, null, new TreeNode(4)),
                new TreeNode(3, null, new TreeNode(7)));

        Solution solution = new Solution();
        TreeNode actual = solution.mergeTrees(root1, root2);
        Assertions.assertEquals(root1, actual);
    }
}