import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void missingNumber_var1() {
        int nums[] = new int[]{3,0,1};
        var actual = new Solution().missingNumber(nums);
        Assertions.assertEquals(actual, 2);
    }
    @Test
    void missingNumber_var2() {
        int nums[] = new int[]{0,1};
        var actual = new Solution().missingNumber(nums);
        Assertions.assertEquals(actual, 2);
    }
    @Test
    void missingNumber_var3() {
        int nums[] = new int[]{9,6,4,2,3,5,7,0,1};
        var actual = new Solution().missingNumber(nums);
        Assertions.assertEquals(actual, 8);
    }
}