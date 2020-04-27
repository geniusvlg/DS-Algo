package dek.algorithm.aray_and_string;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void moveZeroesTest() {
        int[] in = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(in);
        assertArrayEquals(in, new int[]{1,3,12,0,0});
    }
}
