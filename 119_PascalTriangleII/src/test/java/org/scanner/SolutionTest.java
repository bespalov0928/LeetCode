package org.scanner;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void getRow() {
        Solution s = new Solution();
        List<Integer> rsl = s.getRow(3);
        Assertions.assertArrayEquals(new Integer[]{1,3,3,1}, rsl.toArray());
        System.out.println(rsl);
    }
}