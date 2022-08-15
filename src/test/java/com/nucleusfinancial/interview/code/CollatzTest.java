package com.nucleusfinancial.interview.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollatzTest {

    @Test
    public void compute_2() {
        assertEquals(1L, Collatz.getNumberOfIterations(2));
    }

    @Test
    public void compute_0() {
        assertEquals(0L, Collatz.getNumberOfIterations(0));
    }

    @Test
    public void compute_14328() {
        assertEquals(102L, Collatz.getNumberOfIterations(14328));
    }

    @Test
    public void compute_321211() {
        assertEquals(215L, Collatz.getNumberOfIterations(321211));
    }
}
