package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindOptimalSubArrayTest {
    SlidingWindow slidingWindow = new SlidingWindow();

    /** Given an array of n positive integers and a positive integer s, find the
     minimal length of a contiguous subarray of which the sum > s
     */

    @Test
    public void findOptimalSubArrayTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int s = 7;
        int[] nums = {2, 3, 1, 2 ,4, 3};
        int[] actual = {2, 4, 3};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums), actual.length);

        s = 51;
        int[] nums_2 = {1, 4, 45, 6, 0, 19};
        int[] actual_2 = {4, 5, 6};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_2), actual_2.length);

        s = 9;
        int[] nums_3 = {1, 10, 5, 2, 7};
        int[] actual_3 = {10};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_3), actual_3.length);

        s = 280;
        int[] nums_4 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] actual_4 = {100, 1, 0, 200};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_4), actual_4.length);

        s = 8;
        int[] nums_5 = {1, 2, 4};
        int[] actual_5 = {};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_5), actual_5.length);
    }
}
