package dek.algorithm.aray_and_string;

import java.util.HashSet;

public class CountingElements {

    public static int countElements(int[] arr) {
        int n = arr.length;
        int res = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i =0 ; i < n; ++i)
            hashSet.add(arr[i]);

        for(int i = 0; i < n; ++i) {
            int newX = arr[i] + 1;
            if(hashSet.contains(newX)) {
                res ++;
            }
        }
        return res;
    }
}
