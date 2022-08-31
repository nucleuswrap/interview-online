package com.nucleusfinancial.interview.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 1. Given a string of words split by the space character
// 2. Return a map containing each distinct word and the number of occurrences
// E.G.
// "foo foo bar" will return a map of foo: 2, bar: 1

public class CountDistinctWords {

    public static Map<String, Integer> countDistinctWords(String words) {
        if (words.length() == 0) {
            return Map.of();
        }
        List<String> wordList = Arrays.asList(words.split(" "));
        return wordList.stream().collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));
    }

}
