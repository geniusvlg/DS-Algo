package dek.algorithm.two_pointers;

import java.util.HashMap;

public class BinarySubWithSum {

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
}
