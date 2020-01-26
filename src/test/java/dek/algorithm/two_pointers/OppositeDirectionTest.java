package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeDirectionTest {

    @Test
    public void oppositeDirectionTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] numbers = {2, 7, 11, 15, 16 ,27, 36};
        int target = 34;

        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target)[0], 2);
        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target)[1], 6);

    }
}
