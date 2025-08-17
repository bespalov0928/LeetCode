import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void romanToInt_var1() {
        Integer actual = new Solution().romanToInt("III");
        Assertions.assertEquals(3, actual);
    }
    @Test
    void romanToInt_var2() {
        Integer actual = new Solution().romanToInt("LVIII");
        Assertions.assertEquals(58, actual);
    }
    @Test
    void romanToInt_var3() {
        Integer actual = new Solution().romanToInt("MCMXCIV");
        Assertions.assertEquals(1994, actual);
    }
}