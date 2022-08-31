package com.nucleusfinancial.interview.code;

// Write an algorithm that returns a string which represents a staircase such that "staircase(4)" will give the following result:
// 
//    #
//   ##
//  ###
// ####
// 
// N.B. the last line does not have any cr/lf or spaces.

public class StairCase {

    private static final String SPACE=" ";

    public static String stairCase(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            int spaces = number - i;
            // builder.append(String.format());
        }
        return "";
    }

}
