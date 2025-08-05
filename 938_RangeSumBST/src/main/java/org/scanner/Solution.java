package org.scanner;

public class Solution {
    int rsl = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        recInOrder(root, low, high);
        return rsl;
    }

    private void recInOrder(TreeNode root, int low, int high) {
        if (root == null) return;
        recInOrder(root.left, low, high);
        System.out.print(root.val + " ");
        if (root.val >= low && root.val <= high) {
            rsl = root.val + rsl;
        }
        recInOrder(root.right, low, high);
    }
}