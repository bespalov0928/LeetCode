package org.example;


import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void searchBST() {
        TreeNode expected = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root = new TreeNode(4,
                expected,
                new TreeNode(7));
        Solution s = new Solution();
        TreeNode actual = s.searchBST(root, 2);

        Assertions.assertEquals(expected, actual);
    }
}