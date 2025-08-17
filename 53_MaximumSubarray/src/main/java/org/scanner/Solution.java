package org.scanner;

public class Solution {
    public int maxSubArray(int[] nums) {
        int subarrSum = nums[0];
        int max = nums[0];
        for(int indx=1; indx<nums.length; indx++){
            subarrSum = Math.max(nums[indx], subarrSum+nums[indx]);
            max = Math.max(subarrSum, max);
        }
        return max;
    }
}