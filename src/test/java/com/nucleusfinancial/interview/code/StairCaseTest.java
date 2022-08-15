package com.nucleusfinancial.interview.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairCaseTest {

    @Test
    public void ten_stairs() {
        assertEquals("         #\n"
                + "        ##\n"
                + "       ###\n"
                + "      ####\n"
                + "     #####\n"
                + "    ######\n"
                + "   #######\n"
                + "  ########\n"
                + " #########\n"
                + "##########", StairCase.stairCase(10));
    }

    @Test
    public void one_stair() {
        assertEquals("#", StairCase.stairCase(1));
    }

    @Test
    public void no_stair() {
        assertEquals("", StairCase.stairCase(0));
    }
}
