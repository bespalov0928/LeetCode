import java.util.HashMap;

public class Solution {
    public int singleNumber(int[] nums) {
        int rsl = 0;
        var cnt = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (cnt.containsKey(num)) {
                cnt.put(num, 2);
            } else {
                cnt.put(num, 1);
            }
        }
        for (var x : cnt.entrySet()) {
            if (x.getValue().equals(1)) {
                rsl = x.getKey();
                break;
            }
        }
        return rsl;
    }

}
