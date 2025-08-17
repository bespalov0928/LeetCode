package org.example;


import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void moveZeroes() {
        Solution solution = new Solution();
        solution.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
    }

    @Test
    public void generate() {
        Solution solution = new Solution();
        solution.generate(5);
    }

}