package org.scanner;

public class Solution {
    int rsl = Integer.MAX_VALUE;
    private Integer pred = null;

    public int minDiffInBST(TreeNode root) {
        recV2(root);
        return rsl;
    }
    void recV2(TreeNode root) {
        if (root == null) return;
        recV2(root.left);
        if (pred != null) {
            rsl = Math.min(rsl, root.val-pred);
        }
        pred = root.val;
        recV2(root.right);
    }
}