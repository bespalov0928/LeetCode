import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbStairs_var1() {
        var actual = new Solution().climbStairs_var3(2);
        Assertions.assertEquals(2, actual);
    }
    @Test
    void climbStairs_var2() {
        var actual = new Solution().climbStairs_var3(3);
        Assertions.assertEquals(3, actual);
    }
    @Test
    void climbStairs_var3() {
        var actual = new Solution().climbStairs_var3(4);
//        Assertions.assertEquals(3, actual);
    }
}