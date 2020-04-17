package com.amouchere.duplicates;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        return (int) text.toLowerCase().chars()
                .filter(v -> text.toLowerCase().chars().filter(c -> c == v).count() > 1)
                .distinct()
                .count();
    }
}
