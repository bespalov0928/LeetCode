import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SilutionTest {

    @Test
    void findDisappearedNumbers_var1() {
        int[] expected = new int[]{5, 6};
        ArrayList<Integer> actual = (ArrayList<Integer>) new Silution().findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        Assertions.assertEquals(new String("[5, 6]"), actual.toString());
    }
    @Test
    void findDisappearedNumbers_var2() {
        int[] expected = new int[]{5, 6};
        ArrayList<Integer> actual = (ArrayList<Integer>) new Silution().findDisappearedNumbers(new int[]{1, 1});
        Assertions.assertEquals(new String("[2]"), actual.toString());
    }
}