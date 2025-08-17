package org.example;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    public boolean findTarget(TreeNode root, int k) {
        rec(root, k);

        return map.containsValue(true);
    }

    void rec(TreeNode root, int k) {
        if (root == null) return;
        map.put(root.val, map.containsKey(k- root.val) ? true : false);
        rec(root.left, k);
        rec(root.right, k);
    }
}