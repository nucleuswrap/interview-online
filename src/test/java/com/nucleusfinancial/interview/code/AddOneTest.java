package com.nucleusfinancial.interview.code;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AddOneTest {

    @Test
    public void verify_addOne_to_0() {
        assertArrayEquals(new int[] {1}, AddOne.addOne(new int[] { 0 }));
    }

    @Test
    public void verify_addOne_to_1_2_3() {
        assertArrayEquals(new int[]{ 1, 2, 4 }, AddOne.addOne(new int[] { 1, 2, 3 }));
    }

    @Test
    public void verify_addOne_to_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1() {
        assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
                AddOne.addOne(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));

    }

    @Test
    public void verify_addOne_to_9() {
        assertArrayEquals(new int[]{ 1, 0 }, AddOne.addOne(new int[] { 9 }));
    }


    @Test
    public void verify_addOne_to_199() {
        assertArrayEquals(new int[]{ 2, 0, 0 }, AddOne.addOne(new int[] { 1, 9, 9 }));
    }

    @Test
    public void verify_addOne_to_999() {
        assertArrayEquals(new int[]{ 1, 0, 0, 0 }, AddOne.addOne(new int[] { 9, 9, 9 }));
    }
}
