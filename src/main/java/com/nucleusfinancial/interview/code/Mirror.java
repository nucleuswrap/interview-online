package com.nucleusfinancial.interview.code;

// 1. Given an array of chars
// 2. Return true if the values are mirrored around the centre of the array.
// E.G.
// 'a', 'b', 'a' will return true
// 'a', 'b', 'b', 'a' will return true
// 'a', 'b', 'c', 'a' will return false

public class Mirror {
    public static boolean isMirror(char[] values) {
        for (int i = 0, j = values.length - 1; i < j; i++, j--) {
            if (values[i] != values[j]) {
                return false;
            }
        }
        return true;
    }
}
