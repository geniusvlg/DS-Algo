package dek.algorithm.two_pointers;

import java.util.HashMap;

public class MaxSubArrayEqualsK {

    /**
     * Using prefix backward
     * @param k
     * @param nums
     */
    public int maxSubArrayEqualsK(int k, int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, - 1);
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if(map.containsKey(sum - k)) {
                max = Math.max(max, i - map.get(sum - k));
            }
        }

        return max;
    }
}
