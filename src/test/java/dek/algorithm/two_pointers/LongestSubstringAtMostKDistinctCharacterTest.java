package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringAtMostKDistinctCharacterTest {

    @Test
    public void longestSubstringAtMostKDistinctCharacterTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String S = "eceba";
        int k = 3;
        String actual = "eceb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);

        S = "WORLD";
        actual = "WORL";
        k = 4;
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);

        S = "aabbcc";
        k = 1;
        actual = "aa";
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);

        S = "aabbcc";
        k = 2;
        actual = "aabb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);

        S = "aabbcc";
        k = 3;
        actual = "aabbcc";
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);

        S = "aaabbb";
        k = 3;
        actual = "aaabbb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S, k), actual);
    }
}
