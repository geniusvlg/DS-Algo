package dek.algorithm.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingTest {
    SlidingWindow slidingWindow = new SlidingWindow();

    @Test
    public void longestSubstringWithoutRepeatingTest() {

        String a = "GEEKSFORGEEKS";
        assertEquals(slidingWindow.longestSubstringWithoutRepeating(a),
                "EKSFORG".length());

        String b = "ABDEFGABEF";
        assertEquals(slidingWindow.longestSubstringWithoutRepeating(b), "BDEFGA".length());

    }
}
