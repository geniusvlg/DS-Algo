package dek.algorithm.two_pointers;

import java.util.HashSet;
import java.util.Set;

public class PairsHaveDifferenceK {

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
