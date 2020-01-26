package dek.algorithm.two_pointers;

import javax.print.DocFlavor;
import java.util.*;

public class SlidingWindow {
    /**
     * return res.stream().mapToInt(e -> e).toArray();
     */

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

    /**
     * Using prefix backward
     * @param k
     * @param nums
     */
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

    /**
     * Using prefix forward
     * @param S
     * @param arr
     * @return numbers of sub array
     */
    public int binarySubWithSum(int S, int[] arr) {
       if(arr.length == 0)
           return 0;

       int res = 0;
       int sum = 0;


         HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        int[] prefix = new int[arr.length + 1];
        for(int i = 0; i < arr.length; ++i)
            prefix[i + 1] = prefix[i] + arr[i];

        for(int x: prefix) {
            res += count.getOrDefault(x, 0);
            count.put(x + S, count.getOrDefault(x + S, 0) + 1);
        }

       return res;
    }

    /**
     * @param s
     * @param p
     * @return positions of all anagrams of p in s else return null
     */
    public int[] allAnagramsInString(String s, String p) {
        if(s.length() < p.length())
            return null;

        int[] map_p = new int[26];
        int[] map_s = new int[26];

        for(int i = 0; i < p.length(); ++i) {
            map_p[p.charAt(i) - 'a'] ++;
            map_s[s.charAt(i) - 'a'] ++;
        }

        int i, j;
        i = 0;
        j = p.length();
        j = p.length();
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(j < s.length()) {
            if(isMatch(map_p, map_s))
                res.add(i);

            map_s[s.charAt(j) - 'a'] ++;
            map_s[s.charAt(i) - 'a'] --;
            i ++;
            j ++;
        }

        if(isMatch(map_p, map_s))
            res.add(i);

        return res.stream().mapToInt(e -> e).toArray();
    }

    public boolean isMatch(int[] arr1, int[] arr2) {
        for(int i = 0 ; i < arr1.length; ++i) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public boolean permutationInString(String P, String S) {
        if(P.length() > S.length()) {
            return false;
        }

        int[] map_P = new int[26];
        int[] map_S = new int[26];

        for(int i = 0; i < P.length(); ++i) {
            map_P[P.charAt(i) - 'a'] ++;
            map_S[S.charAt(i) - 'a'] ++;
        }

        int i = 0;
        int j = P.length();
        while(j < S.length()) {
            if(isMatch(map_P, map_S))
                return true;

            map_S[S.charAt(j) - 'a'] ++;
            map_S[S.charAt(i) - 'a'] --;
            j ++;
            i ++;
        }

        if(isMatch(map_P, map_S))
            return true;

        return false;
    }

    public int[] substringWithConcatenationOfAllWords(String S, String[] words) {
        return null;
    }

    public String longestSubstringAtMostKDistinctCharacters(String S, int K) {
        if(S == null || S.length() == 0 || K == 0) {
            return "";
        }

        String temp = "";
        String ans = "";
        HashMap<Character, Integer> dupCount = new HashMap<Character, Integer>();
        int i, j;
        i = j = 0;
        while(j < S.length()) {
            Character currChar = S.charAt(j);
            dupCount.put(currChar, dupCount.getOrDefault(currChar, 0) + 1);
            while(dupCount.size() > K) {
                Character dupChar = S.charAt(i);
                dupCount.put(dupChar, dupCount.getOrDefault(dupChar, 0) - 1);
                i ++;

                if(dupCount.get(dupChar) == 0)
                    dupCount.remove(dupChar);

                temp = temp.substring(1);
            }

            temp += currChar;
            if(temp.length() > ans.length()) {
                ans =temp;
            }
            j ++;
        }

        return ans;
    }

    public int longestSubstring2UniqueCharacters(String S) {
        if(S == null || S.length() == 0)
            return 0;

        HashMap<Character, Integer> duplicat_count = new HashMap<Character, Integer>();
        int i , j, max;
        i = j = 0;
        max = 0;
        while(j < S.length()) {
            Character currChar = S.charAt(j);
            duplicat_count.put(currChar, duplicat_count.getOrDefault(currChar, 0) + 1);
            while(duplicat_count.size() > 2) {
                Character dupChar = S.charAt(i);
                duplicat_count.put(dupChar, duplicat_count.getOrDefault(dupChar, 0) - 1);
                i ++;

                if(duplicat_count.get(dupChar) == 0)
                    duplicat_count.remove(dupChar);
            }

            if(duplicat_count.size() == 2)
                max = Math.max(max, j - i + 1);
            j ++;
        }

        return max;
    }

    public int pairsHaveDifferenceK(int[] arr, int k) {
        if(arr.length == 0 || arr == null)
            return 0;

       int res = 0;
       int n = arr.length;
       int positiveDiff;
       int negativeDiff;
       Set<Integer> set = new HashSet<Integer>();
       for(int i = 0; i < n; ++i) {
           positiveDiff = arr[i] + k;
           negativeDiff = Math.abs(arr[i] - k);
           if(set.contains(positiveDiff)) {
               res ++;
           }

           if(set.contains(negativeDiff)) {
               res ++;
           }

           set.add(arr[i]);

       }

        return res;
    }
}
