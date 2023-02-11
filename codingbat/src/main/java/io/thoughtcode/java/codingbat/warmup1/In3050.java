package io.thoughtcode.java.codingbat.warmup1;

import io.thoughtcode.java.common.NumberConstants;

public class In3050 {

    static final int LOWER1 = NumberConstants.THIRTY;

    static final int UPPER1 = NumberConstants.FORTY;

    static final int LOWER2 = NumberConstants.FORTY;

    static final int UPPER2 = NumberConstants.FIFTY;

    public final boolean in3050(final int value1, final int value2) {
        return isBetween(value1, LOWER1, UPPER1) && (isBetween(value2, LOWER1, UPPER1))
                    || isBetween(value1, LOWER2, UPPER2) && isBetween(value2, LOWER2, UPPER2);
    }

    private boolean isBetween(final int value, final int lower, final int upper) {
        return lower <= value && value <= upper;
    }
}
