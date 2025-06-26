package org.example;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return dp(root, false);
    }

    int dp(TreeNode root, boolean leftSide){
        if (root == null) return 0;
        int left = dp(root.left, true);
        int right = dp(root.right, false);
        if(root.left==null && root.right==null && leftSide){
            return left+right+root.val;
        }else{
            return left+right;
        }
    }
}