package com.nucleusfinancial.interview.code;

import java.util.List;

//Example to help the candidate with the process

public class Foo {

    public long countElements(List<Integer> ints) {
        if (ints == null) {
            return 0;
        }
        return ints.stream().count();
    }
}