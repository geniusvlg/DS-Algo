package dek.algorithm.divide_and_conquer;

public class MergeSort {

    public static void mergeSort(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        sort(nums, l, r);
    }

    public static void sort(int[] nums, int l, int r) {
        if(l < r) {
            int m = (r + l)/2;
            sort(nums, l, m);
            sort(nums, m + 1, r);

            merge(nums, l, m, r);
        }
    }


    public static void merge(int[] nums, int l, int m, int r) {

        // Create two temp arrays
        int[] L = new int[m - l + 1];
        int[] K = new int[r - m];

        // Assign elements to two temp arrays
        for(int i = 0; i < L.length; ++i)
            L[i] = nums[l + i];
        for(int k = 0; k < K.length; ++k)
            K[k] = nums[m + k + 1];

        // Compare 2 temp arrays and put back to the original
        int i = 0;
        int j = 0;
        int k = l;
        while(i < L.length && j < K.length) {
            if(L[i] < K[j]) {
                nums[k] = L[i];
                ++i;
            } else {
                nums[k] = K[j];
                ++j;
            }
            ++k;
        }

        // For the remaining elements in either of two temp arrays
        while(i < L.length) {
            nums[k] = L[i];
            ++i;
            ++k;
        }

        while(j < K.length) {
            nums[k] = K[j];
            ++j;
            ++k;
        }
    }

}

