package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.ONE;

public class FrontBack {

    public final String frontBack(final String str) {

        final String output;

        if (str.length() <= ONE) {
            output = str;
        } else {
            output = str.substring(str.length() - ONE) + str.substring(ONE, str.length() - ONE) + str.substring(0, ONE);
        }

        return output;
    }
}
