package org.scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void increasingBST() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(1), null),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(8,new TreeNode(7), new TreeNode(9))));
        Solution solution = new Solution();
        TreeNode rsl = solution.increasingBST(root);
//        Assertions.
        System.out.println(rsl);
    }
}