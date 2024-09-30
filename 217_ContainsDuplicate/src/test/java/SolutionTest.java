import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsDuplicate_var1() {
        int[] nums = new int[]{1, 2, 3, 1};
        Boolean actual = new Solution().containsDuplicate(nums);
        Assertions.assertEquals(true, actual);
    }
    @Test
    void containsDuplicate_var2() {
        int[] nums = new int[]{1,2,3,4};
        Boolean actual = new Solution().containsDuplicate(nums);
        Assertions.assertEquals(false, actual);
    }
    @Test
    void containsDuplicate_var3() {
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        Boolean actual = new Solution().containsDuplicate(nums);
        Assertions.assertEquals(true, actual);
    }
}