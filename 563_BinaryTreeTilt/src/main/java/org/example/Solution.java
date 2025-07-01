package org.example;

public class Solution {
    int rsl = 0;
    public int findTilt(TreeNode root) {
        rec(root);
        return rsl;
    }

    private int rec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = rec(root.left);
        int right = rec(root.right);
        rsl = rsl + (Math.abs(left - right));
        return left + right+ root.val;
    }
}