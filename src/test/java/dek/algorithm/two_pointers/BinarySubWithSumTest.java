package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySubWithSumTest {

    /**
     *  In an array of 1s and 0s, how many non-empty subarrays have sum S?
     */
    @Test
    public void binarySubWithSumTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] arr = {1, 0, 1, 0, 1};
        int S = 2;
        assertEquals(algorithm.getSlidingWindow().binarySubWithSum(S, arr), 4);
    }
}
