package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.HUNDRED;
import static io.thoughtcode.java.common.NumberConstants.ZERO;

public class IcyHot {

    static final int TEMP_ICY = ZERO;

    static final int TEMP_HOT = HUNDRED;

    public final boolean icyHot(final int temp1, final int temp2) {
        return temp1 < TEMP_ICY && temp2 > TEMP_HOT || temp2 < TEMP_ICY && temp1 > TEMP_HOT;
    }
}
