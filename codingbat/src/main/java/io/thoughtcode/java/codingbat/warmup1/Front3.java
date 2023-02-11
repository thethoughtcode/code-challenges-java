package io.thoughtcode.java.codingbat.warmup1;

import static io.thoughtcode.java.common.NumberConstants.THREE;

public class Front3 {

    public final String front3(final String str) {

        final String front;

        if (str.length() < THREE) {
            front = str;
        } else {
            front = str.substring(0, THREE);
        }

        return front.repeat(THREE);
    }
}
