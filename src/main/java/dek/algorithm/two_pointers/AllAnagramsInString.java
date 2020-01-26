package dek.algorithm.two_pointers;

import java.util.ArrayList;

public class AllAnagramsInString {

    public boolean isMatch(int[] arr1, int[] arr2) {
        for(int i = 0 ; i < arr1.length; ++i) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
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
}
