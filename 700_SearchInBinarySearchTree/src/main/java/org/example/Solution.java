package org.example;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = rec(root, val);
        return node;
    }

    private TreeNode rec(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            return root;
        }
        TreeNode l = rec(root.left, val);
        TreeNode r = rec(root.right, val);
        if (l != null){
            return l;
        }else if (r != null){
            return r;
        }else return null;
    }
}