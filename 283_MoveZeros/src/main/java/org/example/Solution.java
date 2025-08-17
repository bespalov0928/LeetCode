package org.example;

import java.util.*;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rsl = new ArrayList<>();
        List<Integer> newList = new ArrayList<>(Arrays.asList(1));
        rsl.add(newList);

        for(int index=1 ; index<numRows ; index++){
            List<Integer> prevList = new ArrayList();
            prevList.add(0);
            for(int num: rsl.get(index-1)){
                prevList.add(num);
            }
            prevList.add(0);
            newList = new ArrayList<>();
            for(int x = 0;x<prevList.size()-1;x++){
                newList.add(prevList.get(x)+prevList.get(x+1));
            }
            rsl.add(newList);
        }
        return rsl;
    }



    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int zero = -1;
        //int no_sero = null;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zero == -1) {
                zero = i;
                continue;
            } else if (nums[i] != 0) {
                if (zero == -1) continue;

                nums[zero] = nums[i];
                nums[i] = 0;
                zero++;
            }
        }
    }

//            int indexBegin = 0;
//            int indexEnd = nums.length()-1;
//            for(int index = 0: index<nums.length(): index++){
//                if(nums[index].equals(0)){
//                    int temp = nums[indexEnd];
//                    nums[indexEnd] = nums[index];
//                    nums[index] = temp;
//                    indexEnd--
//                }else{
//
//                }
//            }

}