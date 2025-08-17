import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void maxProfit_var2() {
        int actual = new Solution().maxProfit_var2(new int[]{7,1,5,3,6,4});
        Assertions.assertEquals(5, actual);
    }
}