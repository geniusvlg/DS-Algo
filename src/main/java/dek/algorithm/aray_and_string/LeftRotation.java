package dek.algorithm.aray_and_string;

/**
 * A left rotation operation on an array shifts each of the array's elements 1 unit to the left.
 */
public class LeftRotation {

    public int[] rotateLefTempArray(int d, int[] arr) {
        int[] res = new int[arr.length];

        int i = d;
        while(i < arr.length) {
            res[i - d] = arr[i];
            ++ i;
        }

        for(int j = 0; j < d; ++j) {
            res[j + (arr.length - d)] = arr[j];
        }

        return res;
    }

    public void rotateLeftOneByOne(int d, int[] arr) {
        for(int i = 0; i < d; ++i) {
            int temp = arr[0];
            int j;
            for(j = 0; j < arr.length - 1; ++j) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }
}
