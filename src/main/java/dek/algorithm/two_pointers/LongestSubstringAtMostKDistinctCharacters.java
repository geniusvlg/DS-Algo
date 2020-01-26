package dek.algorithm.two_pointers;

import java.util.HashMap;

public class LongestSubstringAtMostKDistinctCharacters {

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
}
