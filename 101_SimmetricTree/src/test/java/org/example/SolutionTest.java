package org.example;

//import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void isSymmetric() {
        Solution s = new Solution();
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root1 = new TreeNode(1, root2, root3);

        s.isSymmetric(root1);
    }

    @Test
    public void isSymmetricV2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        Solution s = new Solution();
        s.isSymmetric(root);
    }

    @Test
    public void isSymmetricV3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(3,
                        new TreeNode(5), new TreeNode(6)),
                    new TreeNode(4,
                        new TreeNode(7), new TreeNode(8))),
                new TreeNode(2,
                    new TreeNode(4,
                        new TreeNode(8), new TreeNode(7)),
                    new TreeNode(3,
                        new TreeNode(6), new TreeNode(5))));
        Solution s = new Solution();
        boolean rsl = s.isSymmetric(root);
    }
}