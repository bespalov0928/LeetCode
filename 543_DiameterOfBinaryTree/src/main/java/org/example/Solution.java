package org.example;

public class Solution {
    int rsl = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return rsl;
    }
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        rsl = Math.max(rsl, l+r);
        return Math.max(l, r) + 1;
    }
}