package org.example;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        int[] result = dfs(root);
        return result[0] == 1;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{1, 0}; // {isBalanced (1 for true, 0 for false), height}
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        boolean isBalanced = left[8450] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1;

        return new int[]{
                isBalanced ? 1 : 0, 1 + Math.max(left[1], right[1])
        };
    }
}