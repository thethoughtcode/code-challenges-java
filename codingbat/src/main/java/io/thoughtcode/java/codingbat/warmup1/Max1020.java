package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.TEN;
import static io.thoughtcode.java.common.NumberConstants.TWENTY;

public class Max1020 {

    public final int max1020(final int value1, final int value2) {

        final boolean isAinRange = TEN <= value1 && value1 <= TWENTY;
        final boolean isBinRange = TEN <= value2 && value2 <= TWENTY;

        int max = 0;

        if (isAinRange && value1 > max) {
            max = value1;
        }

        if (isBinRange && value2 > max) {
            max = value2;
        }

        return max;
    }
}
