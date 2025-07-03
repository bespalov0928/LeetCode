package org.example;

public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        boolean rsl = areTreeEqual(root, subRoot);
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return rsl || left || right;

    }

    private boolean areTreeEqual(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        boolean rsl = root.val == subRoot.val;
        boolean left = areTreeEqual(root.left, subRoot.left);
        boolean right = areTreeEqual(root.right, subRoot.right);
        return rsl && left && right;
    }
}