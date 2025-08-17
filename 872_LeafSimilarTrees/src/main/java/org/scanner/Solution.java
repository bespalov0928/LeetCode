package org.scanner;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, list1);
        dfs(root2, list2);

        return list1.equals(list2);
    }
    void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            list.add(root.val);
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }
}