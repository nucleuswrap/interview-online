package com.nucleusfinancial.interview.code;

import java.util.HashMap;
import java.util.Map;

// Write an algorithm that implements a bubble sort and outputs a map containing the following keys:
// Bubble sort uses the following algorithm:

// 1. given an array containing [5,2,1]
// 2. given index x = 0
// 3. if ary[x] > ary[x+1] then swap the values
// 4. Continue to loop through the array until no more swaps occur
// 5. Return the number of swaps "swaps", the number of times to loop through the array "itor", and the sorted array "list

// swaps - the total number of swaps that took place
// itor - the total amount of iterations required
// list - the sorted list

public class BubbleSort {

    public static Map<String, Object> sort(int[] numberArray) {
        int totalSwaps = 0;
        int totalIterations = 0;
        // Implementation goes here
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("itor", totalIterations);
        result.put("swaps", totalSwaps);
        result.put("array", numberArray);
        return result;
    }

}