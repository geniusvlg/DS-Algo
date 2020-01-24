package dek.algorithm.two_pointers;

import java.util.*;

public class SlidingWindow {

    public void printResult(int startIndex, int length, int[] nums) {
        for(int i = 0; i < length; ++i)
            System.out.println(nums[i + startIndex]);

        System.out.println("\n");
    }

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
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Integer i , j, min, acc;
        i = j = acc = 0;
        min = Integer.MAX_VALUE;
        while(j < nums.length) {
            acc += nums[j];
            while(acc > s) {
                min = Math.min(min, j - i + 1);
                acc -= nums[i];
                i ++;
            }
            j ++;
        }

        if(min == Integer.MAX_VALUE)
            min = 0;

        return min;
    }

    public int maxSubArrayEqualsK(int k, int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, - 1);
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
        }

        return max;
    }

    public int longestContiguousIncreasingSubarray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        if(nums.length == 1)
            return 1;

        int max = Integer.MIN_VALUE;
        int accumulation = 1;
        for(int i = 1; i < nums.length; ++ i) {
            if(nums[i] <= nums[i - 1]) {
                max = Math.max(max, accumulation);
                accumulation = 0;
            }
            accumulation ++;

        }

        return max;
    }

    public int longestSubstringWithoutRepeating(String input) {
        if(input == null || input.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = Integer.MIN_VALUE;
        int i, j;
        i = j = 0;
        while(j < input.length()) {
            Character currChar = input.charAt(j);
            while(map.containsKey(currChar)) {
                map.remove(input.charAt(i));
                i++;
            }
            j ++;
            map.put(currChar, 1);
            max = Math.max(max, j - i);
        }

        return max;
    }

    public int pairsWithGivenSumTwoArrays(int sum, int[] arr1, int[] arr2) {
        if(arr1.length == 0 || arr2.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> arr2_map = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> res = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr2.length; ++i) {
            arr2_map.put(arr2[i], i);
        }

        for(int i = 0 ; i < arr1.length; ++i) {
            int remain = sum - arr1[i];
            if(arr2_map.containsKey(remain)) {
                res.put(i, arr2_map.get(remain));
            }
        }

        return res.size();
    }

    public int binarySubWithSum(int S, int[] arr) {
        if(arr.length == 0)
            return 0;


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
