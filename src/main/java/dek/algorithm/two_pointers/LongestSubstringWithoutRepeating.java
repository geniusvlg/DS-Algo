package dek.algorithm.two_pointers;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

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
}
