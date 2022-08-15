package com.nucleusfinancial.interview.code;

import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static junit.framework.TestCase.assertTrue;

public class BubbleSortTest {

    @Test
    public void sort_small_array() {
        Map<String, Object> result = BubbleSort.sort(new int[] { 3, 1, 4, 1, 5, 9, 2, 6 });
        assertEquals(5, result.get("itor"));
        assertEquals(8, result.get("swaps"));
        assertTrue(Arrays.equals((int[]) result.get("array"), new int[] { 1, 1, 2, 3, 4, 5, 6, 9 }));
    }

    @Test
    public void sort_sorted_list() {
        Map<String, Object> result = BubbleSort.sort(new int[] { 1, 2, 3 });
        assertEquals(1, result.get("itor"));
        assertEquals(0, result.get("swaps"));
        assertTrue(Arrays.equals((int[]) result.get("array"), new int[] { 1, 2, 3 }));
    }

    @Test
    public void sort_list_of_1_element() {
        Map<String, Object> result = BubbleSort.sort(new int[] { 1 });
        assertEquals(1, result.get("itor"));
        assertEquals(0, result.get("swaps"));
        assertTrue(Arrays.equals((int[]) result.get("array"), new int[] { 1 }));
    }

}