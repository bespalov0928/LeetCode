public class Solution {
    public int missingNumber(int[] nums) {
        Integer arr[] = new Integer[nums.length + 1];
        for (int num : nums) {
            arr[num] = num;
        }

        for (int x = 0; x <= arr.length; x++) {
            if (arr[x] == null){
                return x;
            }
        }

        return -1;
    }
}
