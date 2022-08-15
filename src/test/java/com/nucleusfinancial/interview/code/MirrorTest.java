package com.nucleusfinancial.interview.code;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MirrorTest {

    @Test
    public void empty_array_returns_true() {
        assertTrue(Mirror.isMirror(new char[]{}));
    }

    @Test
    public void array_with_even_elements_that_is_mirrored_returns_true() {
        assertTrue(Mirror.isMirror(new char[]{'a', 'b', 'c', 'c', 'b', 'a'}));
    }

    @Test
    public void array_with_odd_elements_that_is_mirrored_returns_true() {
        assertTrue(Mirror.isMirror(new char[]{'a', 'b', 'c', 'b', 'a'}));
    }

    @Test
    public void array_with_even_elements_that_is_not_mirrored_returns_false() {
        assertFalse(Mirror.isMirror(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }

    @Test
    public void array_with_odd_elements_that_is_not_mirrored_returns_true() {
        assertFalse(Mirror.isMirror(new char[]{'a', 'b', 'c', 'd'}));
    }
}
