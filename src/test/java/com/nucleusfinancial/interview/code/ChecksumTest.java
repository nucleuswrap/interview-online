package com.nucleusfinancial.interview.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChecksumTest {

    @Test
    public void checksum_array_item() {
        assertEquals(8921379L, Checksum.computeChecksum(new int[] { 3, 1, 4, 1, 5, 9 }));
    }

    @Test
    public void checksum_array_of_1() {
        assertEquals(113L, Checksum.computeChecksum(new int[] { 1 }));
    }

    @Test
    public void checksum_array_of_0() {
        assertEquals(0L, Checksum.computeChecksum(new int[] { 0 }));
    }

    @Test
    public void checksum_empty_array() {
        assertEquals(0L, Checksum.computeChecksum(new int[] {}));
    }

    @Test
    public void checksum_array_of_1s() {
        assertEquals(2499715L, Checksum.computeChecksum(new int[] { 1, 1, 1, 1, 1, 1, 1 }));
    }

}
