package org.example;


public class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        rec(root);
        return minDiff;
    }

    void rec(TreeNode root) {
        if (root == null) {
            return;
        }
        rec(root.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, Math.abs(prev - root.val));
        }
        prev = root.val;
        rec(root.right);
    }
}