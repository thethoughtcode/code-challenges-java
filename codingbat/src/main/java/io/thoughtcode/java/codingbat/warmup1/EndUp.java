package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.THREE;
import static java.util.Locale.ROOT;

public class EndUp {

    public final String endUp(final String str) {

        final String output;

        if (str.length() < THREE) {
            output = str.toUpperCase(ROOT);
        } else {
            output = str.substring(0, str.length() - THREE) + str.substring(str.length() - THREE).toUpperCase(ROOT);
        }

        return output;
    }
}
