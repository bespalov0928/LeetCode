package org.scanner;

public class Solution {
    int prev = -1;

    public boolean isUnivalTree(TreeNode root) {
        return recPreOrder(root);
    }

    private boolean recPreOrder(TreeNode root) {
        if (root == null) return true;
        if (prev == -1) prev = root.val;
        if (root.val != prev) {
            return false;
        }
        boolean left = recPreOrder(root.left);
        boolean right = recPreOrder(root.right);
        return left && right;

    }
}