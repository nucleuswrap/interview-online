package com.nucleusfinancial.interview.code;

// 1. Given an array of ints
// 2. Count the positive numbers
// 3. Sum the negative numbers
// 4. Return an int array size 2 with array[0] = count of positive numbers, array[1] = sum the negative numbers

import java.util.Arrays;
import java.util.List;

public class CountAndSum {
    public static int[] countPositivesSumNegatives(int[] arr) {
        int positiveCount = 0;
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int theNumber = arr[i];
            if (theNumber > 0) {
                positiveCount++;
            } else {
                negativeSum = negativeSum + theNumber;
            }
        }

        return new int[] { positiveCount, negativeSum };
    }
}
