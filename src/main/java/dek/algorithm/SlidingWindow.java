package dek.algorithm;

import java.util.*;

public class SlidingWindow {

    public int[] findTwoSum(int[] set, int target) {
        if(set == null || set.length == 0)
            return null;

        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < set.length; ++i) {
            int remain = target - set[i];
            if(!map.containsKey(remain)) {
                map.put(set[i], i + 1);
            } else {
                res[0] = map.get(remain);
                res[1] = i + 1;
            }
        }

       return res;
    }

    public int minSubArrayBiggerOrEqualsK(int s, int[] nums) {

        return 1;
    }

    public int maxSubArrayEqualsK(int k, int[] nums) {
       return 1;
    }

    public int longestContiguousIncreasingSubarray(int[] nums) {
        return 1;
    }

    public int longestSubstringWithoutRepeating(String input) {
        return 1;
    }

    public int pairsWithGivenSum(int sum, int[] arr) {
        return 1;
    }

    public int pairsWithGivenSumSlidingWindow(int sum, int[] arr) {
        return 1;
    }

    public int pairsWithGivenSumTwoArrays(int sum, int[] arr1, int[] arr2) {
        return 1;
    }

    public int binarySubWithSum(int S, int[] arr) {
        return  1;
    }

    public int[] allAnagramsInString(String s, String p) {
        return null;
    }

    public boolean isMatch(int[] arr1, int[] arr2) {
        return false;
    }

    public boolean permutationInString(String P, String S) {
       return false;
    }

    public int[] substringWithConcatenationOfAllWords(String S, String[] words) {

        return null;
    }

    public String[] longestSubstringAtMostKDistinctCharacters(String S) {
       return null;
    }

    public int longestSubstring2UniqueCharacters(String S) {

        return 1;
    }

    public int pairsHaveDifferenceK(int[] arr, int k) {
        return 1;
    }
}
