package dek.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SlidingWindowTest {

    private SlidingWindow slidingWindow = new SlidingWindow();

    @Test
    public void longestSubstringWithoutRepeatingTest() {

        String a = "GEEKSFORGEEKS";
        assertEquals(slidingWindow.longestSubstringWithoutRepeating(a), "EKSFORG".length());

        String b = "ABDEFGABEF";
        assertEquals(slidingWindow.longestSubstringWithoutRepeating(b), "BDEFGA".length());

    }

    /**
     * Given an array of distinct integer values, count the number of pairs of integers that have difference k.
     * For example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference k = 2,
     * there are four pairs with difference2: (1, 3), (3, 5), (5, 7), (7, 9).
     */
    @Test
    public void pairsHaveDifferenceKTest() {
        int[] arr1 = {1, 7, 5, 9, 2, 12, 3};
        int k = 2;
        assertEquals(slidingWindow.pairsHaveDifferenceK(arr1, k), 4);
    }

    /**
     * Example: Given a smaller strings and a bigger string b, design an algorithm to find all permuta­ tions
     * of the shorter string within the longer one.Print the location of each permutation.
     */
    @Test
    public void findPermutation() {
        String S = "cbaebabacd";
        String T = "abc";

    }


    /**
     * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
     */
    @Test
    public void findStartIndicesOfAnagram() {

    }
}
