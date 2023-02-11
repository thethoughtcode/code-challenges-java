package io.thoughtcode.java.codingbat.warmup1;

public class SumDouble {

    public final int sumDouble(final int value1, final int value2) {

        final int sum;

        if (value1 == value2) {
            sum = 2 * (value1 + value2);
        } else {
            sum = value1 + value2;
        }

        return sum;
    }
}
