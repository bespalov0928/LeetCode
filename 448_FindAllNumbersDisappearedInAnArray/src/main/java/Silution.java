import java.util.ArrayList;
import java.util.List;

public class Silution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Integer[] arr = new Integer[nums.length + 1];
        List<Integer> rsl = new ArrayList<>();
        for (int num : nums) {
            arr[num] = num;
        }
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] == null) {
                rsl.add(x);
            }
        }
        return rsl;
    }
}
