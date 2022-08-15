package com.nucleusfinancial.interview.code;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CountAndSumTest {

    @Test
    public void countAndSumTest_with_empty_array(){
        int result[] = CountAndSum.countPositivesSumNegatives(new int[]{});
        assertTrue(Arrays.equals(result, new int[]{0,0}));
    }

    @Test
    public void countAndSumTest_with_no_postives(){
        int result[] = CountAndSum.countPositivesSumNegatives(new int[] {-1, -2, -12, 0});
        assertTrue(Arrays.equals(result, new int[]{0, -15}));
    }

    @Test
    public void countAndSumTest_with_no_negatives() {
        int result[] = CountAndSum.countPositivesSumNegatives(new int[] {5, 2, 12});
        assertTrue(Arrays.equals(result, new int[]{3, 0}));
    }

    @Test
    public void countAndSumTest_with_values_1(){
        int result[] = CountAndSum.countPositivesSumNegatives(new int[] {-2, -4, -15, 0, 5, 2, 14});
        assertTrue(Arrays.equals(result, new int[]{3, -21}));
    }

    @Test
    public void countAndSumTest_with_values_2(){
        int result[] = CountAndSum.countPositivesSumNegatives(new int[] {0, 1});
        assertTrue(Arrays.equals(result, new int[]{1, 0}));
    }
}
