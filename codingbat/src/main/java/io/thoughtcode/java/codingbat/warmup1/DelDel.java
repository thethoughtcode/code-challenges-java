package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.FOUR;

public class DelDel {

    static final String DEL = "del";

    public final String delDel(final String str) {

        final String output;

        if (str.length() >= FOUR && DEL.equals(str.substring(1, FOUR))) {
            output = str.substring(0, 1) + str.substring(FOUR);
        } else {
            output = str;
        }

        return output;
    }
}
