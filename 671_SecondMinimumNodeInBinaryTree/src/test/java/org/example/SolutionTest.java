package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void findSecondMinimumValue() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(2,
                new TreeNode(2),
                new TreeNode(5, new TreeNode(5), new TreeNode(7)));
        int actual = s.findSecondMinimumValue(root);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void findSecondMinimumValueV1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(2, new TreeNode(2), new TreeNode(2));
        int actual = s.findSecondMinimumValue(root);
        Assertions.assertEquals(-1, actual);
    }
}