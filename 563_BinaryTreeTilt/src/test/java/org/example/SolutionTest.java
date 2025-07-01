package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void findTilt() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution s = new Solution();
        int actual = s.findTilt(root);
        Assertions.assertEquals(1, actual);
    }
    @Test
    public void findTiltV2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7)));
        Solution s = new Solution();
        int actual = s.findTilt(root);
        Assertions.assertEquals(15, actual);
    }
    @Test
    public void findTiltV3() {
        TreeNode root = new TreeNode(21,
                new TreeNode(7, new TreeNode(1,
                        new TreeNode(3),
                        new TreeNode(3)), new TreeNode(1)),
                new TreeNode(14, new TreeNode(2), new TreeNode(2)));
        Solution s = new Solution();
        int actual = s.findTilt(root);
        Assertions.assertEquals(9, actual);
    }
}