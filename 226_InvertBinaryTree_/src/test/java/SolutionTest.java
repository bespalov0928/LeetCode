import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void invertTree() {
        Solution solution = new Solution();
        int[] arr = new int[]{4,2,7,1,3,6,9};
        TreeNode treeNode1 = new TreeNode(1, null, null);
        TreeNode treeNode3 = new TreeNode(3, null, null);
        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode9 = new TreeNode(9, null, null);

        TreeNode treeNode2 = new TreeNode(2, treeNode1, treeNode3);
        TreeNode treeNode7 = new TreeNode(7, treeNode6, treeNode9);

        TreeNode treeNode4 = new TreeNode(4, treeNode2, treeNode7);

        solution.invertTree(treeNode4);
    }
}