package com.amouchere.findodd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] a) {
        Set<Integer> set = new HashSet<>();

        Arrays.stream(a).forEach(i -> {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        });
        return set.stream().findFirst().get();
    }
}