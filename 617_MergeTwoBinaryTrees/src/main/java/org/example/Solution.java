package org.example;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//        rec(root1, root2);
        return rec(root1, root2);
    }

    private TreeNode rec(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode node = new TreeNode((root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0));

        TreeNode left = rec(root1 != null ? root1.left : null, root2 != null ? root2.left : null);
        TreeNode right = rec(root1 != null ? root1.right : null, root2 != null ? root2.right : null);

        if (left != null)node.left = left;
        if (right != null)node.right = right;
        return node;
    }

    private TreeNode recV1(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode left = rec(root1.left, root2.left);
        TreeNode right = rec(root1.right, root2.right);
        TreeNode node = new TreeNode((left != null ? left.val : 0) + (right != null ? right.val : 0));
        if (left != null) node.left = left;
        if (right != null) node.right = right;
        return node;
    }
}