package dek.algorithm.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsHaveDifferenceKTest {

    SlidingWindow slidingWindow = new SlidingWindow();

    /**
     * Given an array of distinct integer values, count the number of pairs of integers that have difference k.
     * For example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference k = 2,
     * there are four pairs with difference2: (1, 3), (3, 5), (5, 7), (7, 9).
     */
    @Test
    public void pairsHaveDifferenceKTest() {
        int[] arr1 = {1, 7, 5, 9, 2, 12, 3};
        int k = 2;
        assertEquals(slidingWindow.pairsHaveDifferenceK(arr1, k), 4);
    }
}
