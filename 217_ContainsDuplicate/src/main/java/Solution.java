import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        var cnt = new HashSet<>();
        for (Integer num:nums) {
            if (cnt.contains(num)){
                return true;
            }
            cnt.add(num);
        }
        return false;
    }

}
