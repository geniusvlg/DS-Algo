package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindPermutationInStringTest {

    @Test
    public void FindPermutationInStringTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String p = "ab";
        String s = "eidbaooo";
        assertTrue(algorithm.getSlidingWindow().permutationInString(p, s));

        s = "eidboaoo";
        assertFalse(algorithm.getSlidingWindow().permutationInString(p, s));
    }
}
