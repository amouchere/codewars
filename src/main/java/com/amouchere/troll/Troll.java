package com.amouchere.troll;

import java.util.Arrays;

public class Troll {
    public static String disemvowel(String str) {
        String[] split = str.split("(?i)a|e|i|u|o");
        return Arrays.asList(split).stream().reduce("", String::concat);

    }
}
