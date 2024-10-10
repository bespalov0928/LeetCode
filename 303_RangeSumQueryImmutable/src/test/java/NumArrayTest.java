import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {

    @org.junit.jupiter.api.Test
    void sumRange_var1() {
        NumArray  numArray  = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1, numArray.sumRange(0, 2));
        Assertions.assertEquals(-1, numArray.sumRange(2, 5));
        Assertions.assertEquals(-3, numArray.sumRange(0, 5));
    }
}