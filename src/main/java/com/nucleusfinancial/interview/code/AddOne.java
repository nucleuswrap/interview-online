package com.nucleusfinancial.interview.code;

// Write an algorithm that adds one to the input.The input is an array representing an integer(ex:[1,2,3]=>123).

// For instance:
// [1,2,3]=>[1,2,4]
// [1,9]=>[2,0]

// bla

public class AddOne {

    public static int[] addOne(int[] figures) {
        validateArray(figures);
        int[] result = figures;
        return result;
    }

    private static void validateArray(int[] figures) {
        for (int figure : figures) {
            if (figure < 0 || figure > 9) {
                throw new IllegalArgumentException("Array items should be between 0 and 9");
            }
        }
    }
}
