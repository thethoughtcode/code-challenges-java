package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.TEN;

public class Close10 {

    public final int close10(final int value1, final int value2) {

        final int closeA = Math.abs(TEN - value1);
        final int closeB = Math.abs(TEN - value2);

        int returnValue = 0;

        if (closeA < closeB) {
            returnValue = value1;
        }

        if (closeA > closeB) {
            returnValue = value2;
        }

        return returnValue;
    }
}
