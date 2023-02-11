package io.thoughtcode.java.codingbat.warmup1;

public class PosNeg {

    public final boolean posNeg(final int value1, final int value2, final boolean negative) {

        final boolean result;

        if (negative) {
            result = value1 < 0 && value2 < 0;
        } else {
            result = value1 < 0 && value2 >= 0 || value1 >= 0 && value2 < 0;
        }

        return result;
    }
}
