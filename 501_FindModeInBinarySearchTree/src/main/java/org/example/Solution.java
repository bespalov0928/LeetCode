package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private Integer max = 0;
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        rec(root, map, list);
        return Arrays.stream(list.toArray(new Integer[list.size()])).mapToInt(i -> i).toArray();
    }

    void rec(TreeNode root, HashMap<Integer, Integer> map, List<Integer> list){
        if(root==null){
            return;
        }
        rec(root.left, map, list);

        int countVal = map.getOrDefault(root.val, 0);
        countVal = countVal + 1;
        if(countVal>max){
            map.clear();
            list.clear();
            list.add(root.val);
        }else if(countVal==max){
            if(!list.contains(root.val)) list.add(root.val);
        }
        map.put(root.val, countVal);
        max = Math.max(countVal, max);

        rec(root.right, map, list);
    }
}