package com.nucleusfinancial.interview.code;

// Write an algorithm that computes the checksum for an array of numbers as follows:

// 1. given a seed of 113
// 2. given a limit of 10000007
// 3. initialise the result to 0
// 4. For each element of the array (numberArray):
// 5. add the array element to the result
// 6. multiply the result by the seed
// 7. set the result to the result by modulo limit (I.E. the remainder after dividing the result by the limit)
// 8. if the array is not exhausted, return to step 5

public class Checksum {

    private static final int SEED = 113;
    private static final int LIMIT = 10000007;

    public static long computeChecksum(int[] numberArray) {
        long result = 0;
        for (int currentNumber : numberArray) {
            result += currentNumber;
            result *= SEED;
            result = (result % LIMIT);
        }

        return result;
    }

}
