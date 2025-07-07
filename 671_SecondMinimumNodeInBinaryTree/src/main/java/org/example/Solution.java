package org.example;

public class Solution {
    int ans = -1;
    public int findSecondMinimumValue(TreeNode root) {
        rec(root, root.val);
        return ans;
    }

    private void rec(TreeNode root, int valParent) {
        if (root == null) return;
        if (root.val > valParent) {
            if (ans == -1) {
                ans = root.val;
            } else if (root.val < ans) {
                ans = root.val;
            }
            return;
        } else if (root.val == valParent) {
            rec(root.left, valParent);
            rec(root.right, valParent);

        }
    }
}