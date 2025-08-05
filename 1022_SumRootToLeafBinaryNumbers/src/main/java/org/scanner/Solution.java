package org.scanner;

public class Solution {
    Integer value = 0;
    public int sumRootToLeaf(TreeNode root) {
        String binaryStr = "";
        recInOrder(root, binaryStr);
        return value;
    }

    private void recInOrder(TreeNode root, String binaryStr) {
        if (root == null)return;
        binaryStr = binaryStr + root.val;
        recInOrder(root.left, binaryStr);
        if (root.left == null && root.right == null) {
            value = value + Integer.parseInt(binaryStr, 2);
        }
        recInOrder(root.right, binaryStr);
    }

//    public static void main(String[] args) {
//        String binaryString = "101";
//        int decimalValue = Integer.parseInt(binaryString, 2);
//        System.out.println(decimalValue);
//    }
}