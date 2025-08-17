public class Solution {
    public int removeDuplicates(int[] nums) {
        //int k = 1;
        int index = 0;
        for(int curr=1; curr<nums.length; curr++){
            if(nums[curr]!=nums[index]) {
                //index;
                nums[++index]=nums[curr];
                //index++;
                //k++;
            }
        }
        return index+1;
    }
}
