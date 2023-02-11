package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.ONE;
import static io.thoughtcode.java.common.NumberConstants.THREE;

public class MixStart {

    static final String CONTAINS_IX = "ix";

    public final boolean mixStart(final String str) {
        return str.length() >= THREE && CONTAINS_IX.equals(str.substring(ONE, THREE));
    }
}
