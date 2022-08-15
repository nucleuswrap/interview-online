package com.nucleusfinancial.interview.code;

import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CountDistinctWordsTest {

    @Test
    public void empty_string_returns_empty_map() {
        assertTrue(CountDistinctWords.countDistinctWords("").size() == 0);
    }

    @Test
    public void string_with_one_distinct_word() {
        Map<String, Integer> map = CountDistinctWords.countDistinctWords("foo");
        assertTrue(map.size() == 1);
        assertTrue(map.get("foo") ==  1);
    }

    @Test
    public void string_with_two_distinct_words() {
        Map<String, Integer> map = CountDistinctWords.countDistinctWords("foo bar");
        assertTrue(map.size() == 2);
        assertTrue(map.get("foo") ==  1);
        assertTrue(map.get("bar") ==  1);
    }

    @Test
    public void string_with_two_same_words() {
        Map<String, Integer> map = CountDistinctWords.countDistinctWords("foo foo");
        assertTrue(map.size() == 1);
        assertTrue(map.get("foo") ==  2);
    }

    @Test
    public void string_with_multiple_combinations_of_words() {
        Map<String, Integer> map = CountDistinctWords.countDistinctWords("foo foo flibble bar baz wiz flibble boom chai chai foo");
        assertTrue(map.size() == 7);
        assertTrue(map.get("foo") ==  3);
        assertTrue(map.get("bar") ==  1);
        assertTrue(map.get("baz") ==  1);
        assertTrue(map.get("wiz") ==  1);
        assertTrue(map.get("flibble") ==  2);
        assertTrue(map.get("boom") ==  1);
        assertTrue(map.get("chai") ==  2);
    }

}
