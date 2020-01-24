package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SlidingWindowTest {
    SlidingWindow slidingWindow = new SlidingWindow();

    @Test
    public void longestSubstringWithoutRepeatingTest() {

        String a = "GEEKSFORGEEKS";
        assertEquals(slidingWindow.longestSubstringWithoutRepeating(a),
                "EKSFORG".length());

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

        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target)[0], 2);
        assertEquals(algorithm.getSlidingWindow().findTwoSum(numbers, target)[1], 6);

    }

    /** Given an array of n positive integers and a positive integer s, find the
     minimal length of a contiguous subarray of which the sum > s
     */

    @Test
    public void findOptimalSubArrayTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int s = 7;
        int[] nums = {2, 3, 1, 2 ,4, 3};
        int[] actual = {2, 4, 3};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums), actual.length);

        s = 51;
        int[] nums_2 = {1, 4, 45, 6, 0, 19};
        int[] actual_2 = {4, 5, 6};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_2), actual_2.length);

        s = 9;
        int[] nums_3 = {1, 10, 5, 2, 7};
        int[] actual_3 = {10};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_3), actual_3.length);

        s = 280;
        int[] nums_4 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] actual_4 = {100, 1, 0, 200};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_4), actual_4.length);

        s = 8;
        int[] nums_5 = {1, 2, 4};
        int[] actual_5 = {};
        assertEquals(algorithm.getSlidingWindow().minSubArrayBiggerOrEqualsK(s, nums_5), actual_5.length);
    }

    /** Given an array nums and target value k, find the maximum length of a subarray that sums to k.
     If there isn’t one, return 0 instead.
     **/
    @Test
    public void maxSubArrayEqualsKTest() {
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

    /**
     * FInd the longest contiguous increasing subarray (not equal)
     */
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
