package dek.algorithm.aray_and_string;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
       int lastFoundNon0 = 0;
       for(int i = 0; i < n; ++i) {
           if(nums[i] != 0) {
               nums[lastFoundNon0] = nums[i];
               lastFoundNon0 ++;
           }

       }

       for(int i = lastFoundNon0; i < n; ++i)
           nums[i] = 0;
    }
}
