import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    void removeDuplicates_var1() {
        int[] arr = new int[]{1,1,2};
        var actual = new Solution().removeDuplicates(arr);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void removeDuplicates_var2() {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        var actual = new Solution().removeDuplicates(arr);
        Assertions.assertEquals(5, actual);
    }
}