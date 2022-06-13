package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.TWO;

public class Diff21 {

    static final int TWENTY_ONE = 21;

    public final int diff21(final int number) {

        final int diff = number - TWENTY_ONE;

        final int result;

        if (diff >= 0) {
            result = TWO * diff;
        } else {
            result = -diff;
        }

        return result;
    }
}
