package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstring2UniqueCharactersTest {

    @Test
    public void longestSubstring2UniqueCharactersTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String s = "aabbccddc";
        String actual = "ccddc";
        assertEquals(algorithm.getSlidingWindow().longestSubstring2UniqueCharacters(s), actual.length());

        s = "aabacbeeeebeaabb";
        actual = "beeeebe";
        assertEquals(algorithm.getSlidingWindow().longestSubstring2UniqueCharacters(s), actual.length());

        s = "aaaaaa";
        actual ="";
        assertEquals(algorithm.getSlidingWindow().longestSubstring2UniqueCharacters(s), actual.length());

        s= "aabcd";
        actual = "aab";
        assertEquals(algorithm.getSlidingWindow().longestSubstring2UniqueCharacters(s), actual.length());

    }
}
