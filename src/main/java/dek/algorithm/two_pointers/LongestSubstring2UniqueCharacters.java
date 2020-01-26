package dek.algorithm.two_pointers;

import java.util.HashMap;

public class LongestSubstring2UniqueCharacters {

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

}
