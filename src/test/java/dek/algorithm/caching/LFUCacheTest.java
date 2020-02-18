package dek.algorithm.caching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LFUCacheTest {

    @Test
    public void testGet() {
        LFUCache newCahce = new LFUCache(3);
        newCahce.insert(11, 1);
        newCahce.insert(22, 2);
        newCahce.insert(33, 3);
        assertEquals(newCahce.get(11), 1);
        assertEquals(newCahce.get(22), 2);
        assertEquals(newCahce.get(33), 3);
        assertEquals(newCahce.get(44), -1);
        assertEquals(newCahce.get(55), -1);
    }

    @Test
    public void testInsert() {
        LFUCache newCache = new LFUCache(2);

        newCache.insert(1, 1);
        newCache.insert(2, 2);
        assertEquals(newCache.get(1), 1);
        newCache.insert(3, 3);
        assertEquals(newCache.get(2), -1);
        assertEquals(newCache.get(3), 3);
        newCache.insert(4, 4);
        assertEquals(newCache.get(1), -1);
        assertEquals(newCache.get(3), 3);
        assertEquals(newCache.get(4), 4);

    }

}
