package org.scanner;

public class Solution {
    TreeNode rsl, head;

    public TreeNode increasingBST(TreeNode root) {
        recInOrder(root);
        return head;
    }

    private void recInOrder(TreeNode root) {
        if (root == null) return;
        recInOrder(root.left);
        root.left = null;
        if (rsl == null) {
            rsl = root;
            head = root;
        }else {
            rsl.right = root;
            rsl = root;
        }
        recInOrder(root.right);
    }
}