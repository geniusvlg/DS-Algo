package dek.algorithm.two_pointers;

import java.util.HashMap;

public class FindTwoSum {

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
}
