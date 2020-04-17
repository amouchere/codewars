package com.amouchere.max;

public class Max {
    /**
     * @param a array
     * @return the max sub sum sequence
     */
    public static int sequence(int[] a) {
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for (int value : a) {
            maxEndingHere += value;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}