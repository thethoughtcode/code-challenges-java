package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.ONE;

public class BackAround {

    public final String backAround(final String str) {

        final String prefixSuffix;

        if (str.length() >= ONE) {
            prefixSuffix = str.substring(str.length() - ONE);
        } else {
            prefixSuffix = str;
        }

        return String.format("%s%s%s", prefixSuffix, str, prefixSuffix);
    }
}
