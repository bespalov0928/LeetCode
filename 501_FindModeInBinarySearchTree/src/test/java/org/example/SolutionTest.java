package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void findMode() {
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(2)));

        TreeNode root1 = new TreeNode(2,new TreeNode(1), null);

        Solution s = new Solution();
        int[] actual = s.findMode(root1);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(new int[]{2}, actual);
    }

    @Test
    public void findModeV3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0,
                        new TreeNode(0,
                            new TreeNode(0),
                                null),
                        new TreeNode(0)),
                new TreeNode(1,
                        new TreeNode(1),
                        new TreeNode(1)));


        Solution s = new Solution();
        int[] actual = s.findMode(root);
        System.out.println(Arrays.toString(actual));
        Assertions.assertArrayEquals(new int[]{2}, actual);
    }
}