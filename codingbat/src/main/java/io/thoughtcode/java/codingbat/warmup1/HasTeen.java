package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.TEEN_END;
import static io.thoughtcode.java.common.NumberConstants.TEEN_START;

public class HasTeen {

    public final boolean hasTeen(final int value1, final int value2, final int value3) {
        return isTeen(value1) || isTeen(value2) || isTeen(value3);
    }

    private boolean isTeen(final int value) {
        return TEEN_START <= value && value <= TEEN_END;
    }
}
