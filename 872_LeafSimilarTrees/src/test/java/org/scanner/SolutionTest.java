package org.scanner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void leafSimilar() {
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));
        TreeNode root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));
        Solution solution = new Solution();
        boolean rsl = solution.leafSimilar(root1, root2);
        Assertions.assertTrue(rsl);
    }
    @Test
    public void leafSimilarV1() {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        Solution solution = new Solution();
        boolean rsl = solution.leafSimilar(root1, root2);
        Assertions.assertFalse(rsl);
    }
}