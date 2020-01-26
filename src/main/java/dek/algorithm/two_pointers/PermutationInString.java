package dek.algorithm.two_pointers;

public class PermutationInString {

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
}
