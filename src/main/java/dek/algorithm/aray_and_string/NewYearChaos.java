package dek.algorithm.aray_and_string;

public class NewYearChaos {

    public static int minimumBribe(int[] arr) {

        int res = 0;
        for(int i = 0; i < arr.length; ++i) {
            int positionDiff = arr[i] - (i + 1);
            if(positionDiff > 2)
                return -1;
            if(positionDiff > 0)
                res += positionDiff;
        }

        return res;
    }
}
