package dek.algorithm.two_pointers;

public class LongestContiguousIncreasingSubarray {

    public int longestContiguousIncreasingSubarray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;

        if(nums.length == 1)
            return 1;

        int max = Integer.MIN_VALUE;
        int accumulation = 1;
        for(int i = 1; i < nums.length; ++ i) {
            if(nums[i] <= nums[i - 1]) {
                max = Math.max(max, accumulation);
                accumulation = 0;
            }
            accumulation ++;

        }

        return max;
    }
}
