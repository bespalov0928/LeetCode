package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void averageOfLevels() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<Double> actual =  s.averageOfLevels(root);
        List<Double> expected = new ArrayList<Double>(Arrays.asList(new Double[]{3.0,14.5,11.0}));
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageOfLevelsV2() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,
                new TreeNode(9, new TreeNode(15), new TreeNode(7)),
                new TreeNode(20));
        List<Double> actual =  s.averageOfLevels(root);
        List<Double> expected = new ArrayList<Double>(Arrays.asList(new Double[]{3.0,14.5,11.0}));
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averageOfLevelsV65() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(2147483647, new TreeNode(2147483647), new TreeNode(2147483647));
        List<Double> actual =  s.averageOfLevels(root);
        List<Double> expected = new ArrayList<Double>(Arrays.asList(new Double[]{2147483647.0, 2147483647.0}));
        Assertions.assertEquals(expected, actual);
    }
}