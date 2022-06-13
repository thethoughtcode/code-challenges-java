package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.TEN;

public class Makes10 {

    public final boolean makes10(final int value1, final int value2) {
        return value1 == TEN || value2 == TEN || (value1 + value2) == TEN;
    }
}
