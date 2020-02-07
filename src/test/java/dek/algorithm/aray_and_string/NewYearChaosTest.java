package dek.algorithm.aray_and_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewYearChaosTest {

    @Test
    public void minimumBribeTest() {

        int[] arr = {2, 1, 5, 3, 4};
        assertEquals(NewYearChaos.minimumBribe(arr), 3);

        int[] arr2 = {2, 5, 1, 3, 4};
        assertEquals(NewYearChaos.minimumBribe(arr2), -1);

        int[] arr3 = {1, 2, 5, 3, 7, 8, 6, 4};
        assertEquals(NewYearChaos.minimumBribe(arr3), 7);
    }
}
