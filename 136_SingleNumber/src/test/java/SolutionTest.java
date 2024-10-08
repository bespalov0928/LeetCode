import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void singleNumber_var1() {
        int actual = new Solution().singleNumber(new int[]{2, 2, 1});
        int extend = 1;
        Assertions.assertEquals(extend, actual);
    }

    @Test
    void singleNumber_var2() {
        int actual = new Solution().singleNumber(new int[]{4,1,2,1,2});
        int extend = 4;
        Assertions.assertEquals(extend, actual);
    }

    @Test
    void singleNumber_var3() {
        int actual = new Solution().singleNumber(new int[]{1});
        int extend = 1;
        Assertions.assertEquals(extend, actual);
    }
}