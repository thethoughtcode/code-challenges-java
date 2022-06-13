package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.ONE;
import static io.sampadadubey.java.common.NumberConstants.THREE;

public class StringE {

    static final char SMALL_E = 'e';

    public final boolean stringE(final String str) {

        int count = 0;

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == SMALL_E) {
                count++;
            }
        }

        return ONE <= count && count <= THREE;
    }
}
