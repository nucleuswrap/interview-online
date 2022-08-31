package com.nucleusfinancial.interview.code;

// Write an algorithm that adds one to the input.The input is an array representing an integer(ex:[1,2,3]=>123).

// For instance:
// [1,2,3]=>[1,2,4]
// [1,9]=>[2,0]

public class AddOne {

    public static int[] addOne(int[] figures) {
        validateArray(figures);
        return addOneWithIndex(figures, figures.length - 1);
        // int[] result = figures;
        // return result;
    }

    private static int[] addOneWithIndex(int[] figures, int index) {
        int figureAtIndex = figures[index];
        if (figureAtIndex < 9) {
            figures[index] = figureAtIndex + 1;
            return figures;
        }
        figures[index] = 0;
        if (index == 0) {
            int[] temp = new int[figures.length + 1];
            System.arraycopy(figures, 0, temp, 1, figures.length);
            temp[0] = 1;
            return temp;
        }
        return addOneWithIndex(figures, index - 1);
    }

    private static void validateArray(int[] figures) {
        for (int figure : figures) {
            if (figure < 0 || figure > 9) {
                throw new IllegalArgumentException("Array items should be between 0 and 9");
            }
        }
    }
}
