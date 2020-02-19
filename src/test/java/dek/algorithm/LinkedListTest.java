package dek.algorithm;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

public class LinkedListTest {
    private final static List<Integer> items = Arrays.asList(1, 2, 3, 4);

    @Test
    public void testNewWithItems() {
        LinkedList<Integer> list = new LinkedList<>(this.items);

        assertEquals(4, list.size());
        assertTrue(list.containsAll(this.items));
    }

    @Test
    public void testEmpty() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        assertTrue(list.size() == 0);
    }

    @Test
    public void testInsertOnEmptyList() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insert(1);

        assertEquals(1, list.size());
        assertTrue(list.contains(1));
    }

    @Test
    public void testInsertOnEmptiedList() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(1);
        list.removeLast();

        list.insert(1);

        assertEquals(1, list.size());
        assertTrue(list.contains(1));
    }

    @Test
    public void testInsertItems() {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insert(this.items);

        assertEquals(this.items.size(), list.size());
        assertTrue(list.containsAll(this.items));
    }

    @Test
    public void testRemoveIf() {
        LinkedList<Integer> list = new LinkedList<>(this.items);

        list.removeIf(item -> item % 2 == 1);

        assertEquals(2, list.size());
        assertTrue(list.contains(2));
        assertTrue(list.contains(4));
        assertFalse(list.contains(1));
        assertFalse(list.contains(3));
    }

    @Test
    public void testRemoveLast() {
        LinkedList<Integer> list = new LinkedList<>(this.items);

        for (int i = this.items.size() - 1; i >= 0; i--) {
            list.removeLast();

            assertEquals(i, list.size());
            assertFalse(list.contains(this.items.get(i)));
        }
    }

    @Test
    public void testRemoveLastOnEmpty() {
        LinkedList<Integer> list = new LinkedList<>();

        list.removeLast();

        assertEquals(0, list.size());
        assertFalse(list.contains(0));
    }
}