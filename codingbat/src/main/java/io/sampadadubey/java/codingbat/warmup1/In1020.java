package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.TEN;
import static io.sampadadubey.java.common.NumberConstants.TWENTY;

public class In1020 {

    public final boolean in1020(final int value1, final int value2) {
        return isBetween(value1, TEN, TWENTY) || isBetween(value2, TEN, TWENTY);
    }

    private boolean isBetween(final int value, final int lower, final int upper) {
        return lower <= value && value <= upper;
    }
}
