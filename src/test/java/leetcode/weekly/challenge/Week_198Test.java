package leetcode.weekly.challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Week_198Test {

    @Test
    public void numWaterBottlesTest() {
        Week_198 week_198 = new Week_198();
        assertEquals(week_198.numWaterBottles(9, 3), 13);

        assertEquals(week_198.numWaterBottles(15, 4), 19);

        assertEquals(week_198.numWaterBottles(5, 5), 6);

        assertEquals(week_198.numWaterBottles(2, 3), 2);

    }
}
