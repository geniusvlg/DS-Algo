package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindAllAnagramsInStringTest {

    @Test
    public void FindAllAnagramsInStringTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String s = "cbaebabacd";
        String p = "abc";
        int actual1[] = {0, 6};

        assertArrayEquals(algorithm.getSlidingWindow().allAnagramsInString(s, p), actual1);

        int actual2[] = {0, 1, 2};
        s = "abab";
        p = "ab";
        assertArrayEquals(algorithm.getSlidingWindow().allAnagramsInString(s, p), actual2);
    }
}
