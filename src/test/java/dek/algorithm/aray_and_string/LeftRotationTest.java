package dek.algorithm.aray_and_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotationTest {

    @Test
    public void rotateLefTempArrayTest() {
        LeftRotation leftRotation = new LeftRotation();
        int d = 4;
        int[] arr = {1, 2, 3, 4, 5};
        assertArrayEquals(leftRotation.rotateLefTempArray(d, arr), new int[]{5, 1, 2, 3, 4});

        d = 2;
        int[] arr2 = {1, 2, 3, 4, 5};
        assertArrayEquals(leftRotation.rotateLefTempArray(d, arr2), new int[]{3, 4, 5, 1, 2});

        d = 7;
        int[] arr3 = {98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81};
        assertArrayEquals(leftRotation.rotateLefTempArray(d, arr2), new int[]{26, 54, 63, 24, 17, 32, 81, 98, 67, 35, 1, 74, 79, 7});
    }

    @Test
    public void rotateLeftOneByOneTest() {
        LeftRotation leftRotation = new LeftRotation();
        int d = 4;
        int[] arr = {1, 2, 3, 4, 5};
        leftRotation.rotateLeftOneByOne(d, arr);
        assertArrayEquals(arr, new int[]{5, 1, 2, 3, 4});

        d = 2;
        int[] arr2 = {1, 2, 3, 4, 5};
        leftRotation.rotateLeftOneByOne(d, arr2);
        assertArrayEquals(arr, new int[]{3, 4, 5, 1, 2});

        d = 7;
        int[] arr3 = {98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81};
        leftRotation.rotateLeftOneByOne(d, arr3);
        assertArrayEquals(arr, new int[]{26, 54, 63, 24, 17, 32, 81, 98, 67, 35, 1, 74, 79, 7});
    }
}
