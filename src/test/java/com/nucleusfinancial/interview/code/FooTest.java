package com.nucleusfinancial.interview.code;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FooTest {
    @Test
    public void test_1_2_3_4() {
        assertEquals(4, new Foo().countElements(List.of(1, 2, 3, 4)));
    }

    @Test
    public void test_empty() {
        assertEquals(0, new Foo().countElements(Collections.emptyList()));
    }

    @Test
    public void test_null() {
        assertEquals(0, new Foo().countElements(null));
    }
}