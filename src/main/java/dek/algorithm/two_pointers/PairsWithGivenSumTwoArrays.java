package dek.algorithm.two_pointers;

import java.util.HashMap;

public class PairsWithGivenSumTwoArrays {

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
}
