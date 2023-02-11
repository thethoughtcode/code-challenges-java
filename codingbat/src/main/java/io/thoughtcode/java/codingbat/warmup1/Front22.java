package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.TWO;

public class Front22 {

    public final String front22(final String str) {

        final String prefixSuffix;

        if (str.length() >= TWO) {
            prefixSuffix = str.substring(0, TWO);
        } else {
            prefixSuffix = str;
        }

        return String.format("%s%s%s", prefixSuffix, str, prefixSuffix);
    }
}
