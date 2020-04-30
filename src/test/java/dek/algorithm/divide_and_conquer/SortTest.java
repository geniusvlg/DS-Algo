package dek.algorithm.divide_and_conquer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    int[] nums = {38, 27, 43, 3, 9, 82, 10};

    @Test
    public void mergeSortTest() {
        MergeSort.mergeSort(nums);
        assertArrayEquals(nums, new int[]{3, 9, 10, 27, 38, 43, 82});
    }

    @Test
    public void quickSortTest() {

    }
}
