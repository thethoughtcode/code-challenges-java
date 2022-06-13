package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.FIVE;
import static io.sampadadubey.java.common.NumberConstants.THREE;

public class Or35 {

    public final boolean or35(final int number) {
        return number % THREE == 0 || number % FIVE == 0;
    }
}
