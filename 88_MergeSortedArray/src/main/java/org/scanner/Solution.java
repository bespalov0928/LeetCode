package org.scanner;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int iNums1 = m-1;
        int iNums2 = n-1;
        int icur = nums1.length;

        while(iNums2!=-1){
            if(nums1[iNums1]>=nums2[iNums2]){
                nums1[--icur]=nums1[iNums1];
                iNums1--;
            } else if (nums1[iNums1]<nums2[iNums2]) {
                nums1[--icur]=nums2[iNums2];
                iNums2--;
            }
        }
    }
}