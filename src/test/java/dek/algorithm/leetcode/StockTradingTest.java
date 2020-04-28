package dek.algorithm.leetcode;

import leetcode.StockTrading;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class StockTradingTest {

    @Test
    public void maxProfitTest() {
        int[] input = {7, 6, 4, 3, 1};
        assertEquals(StockTrading.maxProfit(input),0);

        int[] input_2 = {1, 2, 3, 4, 5};
        assertEquals(StockTrading.maxProfit(input_2), 4);

        int[] input_3 = {7,6,4,3,1};
        assertEquals(StockTrading.maxProfit(input_3), 0);
    }
}
