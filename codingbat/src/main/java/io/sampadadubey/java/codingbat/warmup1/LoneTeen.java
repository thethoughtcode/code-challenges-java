package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.TEEN_END;
import static io.sampadadubey.java.common.NumberConstants.TEEN_START;

public class LoneTeen {

    public final boolean loneTeen(final int value1, final int value2) {
        return isTeen(value1) ^ isTeen(value2);
    }

    private boolean isTeen(final int value) {
        return TEEN_START <= value && value <= TEEN_END;
    }
}
