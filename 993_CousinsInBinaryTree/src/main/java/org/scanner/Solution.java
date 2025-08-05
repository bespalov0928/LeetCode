package org.scanner;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    TreeNode parX = null, parY=null;
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean rsl = false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(root);
        int lenghQueue = q.size();

        while (!q.isEmpty()) {
            TreeNode nodeX = null, nodeY = null;
            int size = lenghQueue;
            for (int i = 1; i <= size; i++) {
                TreeNode node = q.poll();
                if (node.val == x) {
                    nodeX = node;
                }
                if (node.val == y) {
                    nodeY = node;
                }

                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                lenghQueue = q.size();
            }

            if (nodeX != null && nodeY != null) {
                rsl = checkParentPreOrder(root, nodeX, nodeY);

            }
            if (rsl) {
                break;
            }
        }

        return rsl;
    }

    private boolean checkParentPreOrder(TreeNode root, TreeNode nodeX, TreeNode nodeY) {
        if (root == null) return false;

        if ((root.left != null && root.left == nodeX) || (root.right != null && root.right == nodeX)) {
            parX = root;
        }
        if ((root.left != null && root.left == nodeY) || (root.right != null && root.right == nodeY)) {
            parY = root;
        }
        if (parX != null && parY != null) {
            if (parX != parY) {
                parX=null;
                parY = null;
                return true;
            }
        }
        boolean left = checkParentPreOrder(root.left, nodeX, nodeY);
        boolean right = checkParentPreOrder(root.right, nodeX, nodeY);
        return left || right;
    }
}