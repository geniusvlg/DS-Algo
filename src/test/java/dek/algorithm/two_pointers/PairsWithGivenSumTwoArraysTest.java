package dek.algorithm.two_pointers;

import dek.algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairsWithGivenSumTwoArraysTest {


    @Test
    public void pairsWithGivenSumTwoArraysTest() {
        Algorithm algorithm = Algorithm.Algorithm("slidingWindow");

        int arr1[] = {-1, -2, 4, -6, 5, 7};
        int arr2[] = {6, 3, 4, 0};
        int k = 8;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumTwoArrays(k, arr1, arr2), 2);

        int arr3[] = {1, 2, 4, 5, 7};
        int arr4[] = {5, 6, 3, 4, 8};
        k = 9;
        assertEquals(algorithm.getSlidingWindow().pairsWithGivenSumTwoArrays(k, arr3, arr4), 3);
    }
}
