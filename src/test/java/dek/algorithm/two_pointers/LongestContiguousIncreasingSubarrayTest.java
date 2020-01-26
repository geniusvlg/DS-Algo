package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestContiguousIncreasingSubarrayTest {

    /**
     * FInd the longest contiguous increasing subarray (not equal)
     */
    @Test
    public void longestContiguousIncreasingSubarrayTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] nums = {1,3,5,4,7};
        assertEquals(algorithm.getSlidingWindow().longestContiguousIncreasingSubarray(nums), 3);

        int[] nums1 = {5, 6, 3, 5, 7, 8, 9, 1, 2};
        assertEquals(algorithm.getSlidingWindow().longestContiguousIncreasingSubarray(nums1), 5);

        int[] nums2 = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
        assertEquals(algorithm.getSlidingWindow().longestContiguousIncreasingSubarray(nums2), 4);

        int[] nums3 = {1};
        assertEquals(algorithm.getSlidingWindow().longestContiguousIncreasingSubarray(nums3), 1);
    }
}
