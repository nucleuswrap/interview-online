package com.nucleusfinancial.interview.code;

import java.util.HashMap;
import java.util.Map;

// 1. Given a string of words split by the space character
// 2. Return a map containing each distinct word and the number of occurrences
// E.G.
// "foo foo bar" will return a map of foo: 2, bar: 1

public class CountDistinctWords {

    public static Map<String, Integer> countDistinctWords(String words) {
        Map<String, Integer> result = new HashMap<>();

        String[] stringsList = words.split(" ");

        for (String currentString : stringsList) {
            if(currentString.isEmpty())
                continue;
            if(result.containsKey(currentString)) {
                result.put(currentString, result.get(currentString) + 1);
            } else {
                result.put(currentString, 1);
            }
        }
        return result;
    }

}
