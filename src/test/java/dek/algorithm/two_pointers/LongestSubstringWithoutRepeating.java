package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeating {

    @Test
    public void longestSubstringWithoutRepeating() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String string1 = "abcabcbb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringWithoutRepeating(string1), 3);

        String string2 = "bbbbb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringWithoutRepeating(string2), 1);
    }

}
