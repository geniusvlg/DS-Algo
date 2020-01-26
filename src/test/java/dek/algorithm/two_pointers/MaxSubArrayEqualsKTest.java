package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubArrayEqualsKTest {

    /** Given an array nums and target value k, find the maximum length of a subarray that sums to k.
     If there isn’t one, return 0 instead.
     **/
    @Test
    public void maxSubArrayEqualsKTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");
        int k = 3;
        int[] nums = {1, -1, 5, -2, 3};
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums), 4);

        int[] nums1 = {10, 5, 2, 7, 1, 9};
        k = 15;
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums1), 4);

        int[] nums2 = {-5, 8, -14, 2, 4, 12};
        k = -5;
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums2), 5);

        int[] nums3 = {3, -7, 8, 2, 9, -1};
        k = 10;
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums3), 3);
    }
}
