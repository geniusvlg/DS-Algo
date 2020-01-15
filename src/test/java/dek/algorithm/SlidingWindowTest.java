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

    @Test
    public void oppositeDirectionTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] numbers = {2, 7, 11, 15, 16 ,27, 36};
        int target = 34;

        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target).get(0), 2);
        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target).get(1), 6);

    }

    @Test
    public void findOptimalSubArrayTest() {

        /** Given an array of n positive integers and a positive integer s, find the
         minimal length of a contiguous subarray of which the sum >= s
         */

        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int s = 7;
        int[] nums = {2, 3, 1, 2 ,4, 3};
        int[] actual = {3, 4};

        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums), actual.length);

    }

    @Test
    public void maxSubArrayEqualsKTest() {
        /** Given an array nums and target value k, find the maximum length of a subarray that sums to k.
         If there isn’t one, return 0 instead.
         **/

        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");
        int k = 3;
        int[] nums = {1, -1, 5, -2, 3};
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums), 4);

        int[] nums1 = {10, 5, 2, 7, 1, 9};
        k = 15;
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums1), 4);

        int[] nums2 = {-5, 8, -14, 2, 4, 12};
        k = -5;
        assertEquals(algorithm.getSlidingWindow().maxSubArrayEqualsK(k, nums2), 5);

    }

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

    @Test
    public void longestSubstringWithoutRepeating() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String string1 = "abcabcbb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringWithoutRepeating(string1), 3);

        String string2 = "bbbbb";
        assertEquals(algorithm.getSlidingWindow().longestSubstringWithoutRepeating(string2), 1);
    }

    @Test
    public void pairsWithGivenSumTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] arr = {1, 5, 7, -1};
        int k = 6;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumSlidingWindow(k, arr), 2);

        int[] arr2 = {1, 5, 7, -1, 5};
        k = 6;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumSlidingWindow(k, arr2), 3);

        int[] arr3 = {3, -1, 4, -2};
        k = 2;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumSlidingWindow(k, arr3), 2);

        int[] arr4 = {10, 12, 13, 15, -1, 7, 6,
                5, 4, 2, -2, -4, 1};
        k = 11;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumSlidingWindow(k, arr4), 6);
    }

    @Test
    public void pairsWithGivenSumTwoArraysTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int arr1[] = {-1, -2, 4, -6, 5, 7};
        int arr2[] = {6, 3, 4, 0};
        int k = 8;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumTwoArrays(k, arr1, arr2), 2);

        int arr3[] = {1, 2, 4, 5, 7};
        int arr4[] = {5, 6, 3, 4, 8};
        k = 9;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumTwoArrays(k, arr3, arr4), 3);
    }

    @Test
    public void binarySubWithSum() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int[] arr = {1, 0, 1, 0, 1};
        int S = 2;
        assertEquals(algorithm.getSlidingWindow().binarySubWithSum(S, arr), 4);
    }

    @Test
    public void allAnagramsInStringTest() {
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

    @Test
    public void permutationInStringTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String p = "ab";
        String s = "eidbaooo";
        assertTrue(algorithm.getSlidingWindow().permutationInString(p, s));

        s = "eidboaoo";
        assertFalse(algorithm.getSlidingWindow().permutationInString(p, s));
    }

    @Test
    public void substringWithConcatenationOfAllWordsTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words), new int[]{0, 9}, "message here");

        s = "wordgoodgoodgoodbestword";
        String[] words2 = {"word","good","best","word"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words2), new int[]{}, "hahahahaha");

        s = "catbatatecatatebat";
        String[] words3 = {"cat", "ate", "bat"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words3), new int[]{0 ,3, 9}, "hohohoho");

        s = "abcdababcd";
        String[] words4 = {"ab", "ab", "cd"};
        assertArrayEquals(algorithm.getSlidingWindow().substringWithConcatenationOfAllWords(s, words4), new int[]{0 ,2, 4}, "hehehehehe");
    }

    @Test
    public void longestSubstringAtMostKDistinctCharacterTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        String S = "abcbbbbcccbdddadacb";
        //assertArrayEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S), new String[]{"bcbbbbcccb"});
        assertEquals(algorithm.getSlidingWindow().longestSubstring2UniqueCharacters(S), "bcbbbbcccb".length());

        S = "aabbcc";
        //assertArrayEquals(algorithm.getSlidingWindow().longestSubstringAtMostKDistinctCharacters(S), new String[]{"aabb" , "bbcc"});

    }
}
