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

    public static String stairCase(int number) {
        String staircase = "";

        for (int i = 1; i <= number; i++) {
            int spacesToAdd = number - i;
            String currentLine = "";
            for (int j = 0; j < spacesToAdd; j++) {
                currentLine += " ";
            }
            for (int j = 0; j < i; j++) {
                currentLine += "#";
            }
            staircase += (currentLine + (i < number ? "\n" : ""));
        }
        return staircase;
    }

}
