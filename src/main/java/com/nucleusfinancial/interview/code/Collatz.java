package com.nucleusfinancial.interview.code;

// Write an algorithm that solves the Collatz Conjecture for x and returns the number of iterations taken.
// A Collatz Conjecture is computed by the following formula:

// if x is even then (x / 2) otherwise (3 * x + 1)

//1. Given starting value x
// 2. If x is 0 or 1 exit returning the number of iterations
// 3. If x is even then set x to (x / 2) otherwise set x to (3 * x + 1)
// 4. Repeat until x is 0 or 1

// The result of the formula is fed back into the formula until the formula returns 1.
// Return the number of iterations taken.

public class Collatz {
    public static long getNumberOfIterations(int x) {
        long numberOfIterations = 0;

        while( x > 1 ) {
            numberOfIterations++;
            if(x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
        }

        return numberOfIterations;
    }

}
