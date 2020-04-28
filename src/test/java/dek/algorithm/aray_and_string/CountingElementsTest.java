package dek.algorithm.aray_and_string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingElementsTest {

    @Test
    public void countElementsTest() {
        int[] in = {1, 2, 3};
        assertEquals(CountingElements.countElements(in),2);
        int[] in_2 = {1,1,3,3,5,5,7,7};
        assertEquals(CountingElements.countElements(in_2),0);
        int[] in_3 = {1,3,2,3,5,0};
        assertEquals(CountingElements.countElements(in_3),3);
        int[] in_4 = {1,1,2,2};
        assertEquals(CountingElements.countElements(in_4),2);
    }
}
