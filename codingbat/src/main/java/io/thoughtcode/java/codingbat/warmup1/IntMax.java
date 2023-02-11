package io.thoughtcode.java.codingbat.warmup1;

public class IntMax {

    public final int intMax(final int value1, final int value2, final int value3) {

        int max = value1 > value2 ? value1 : value2;

        if (value3 > max) {
            max = value3;
        }

        return max;
    }
}
