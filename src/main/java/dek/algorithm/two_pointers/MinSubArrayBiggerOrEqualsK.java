package dek.algorithm.two_pointers;

public class MinSubArrayBiggerOrEqualsK {

    public int minSubArrayBiggerOrEqualsK(int s, int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Integer i , j, min, acc;
        i = j = acc = 0;
        min = Integer.MAX_VALUE;
        while(j < nums.length) {
            acc += nums[j];
            while(acc > s) {
                min = Math.min(min, j - i + 1);
                acc -= nums[i];
                i ++;
            }
            j ++;
        }

        if(min == Integer.MAX_VALUE)
            min = 0;

        return min;
    }
}
