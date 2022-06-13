package io.sampadadubey.java.codingbat.warmup1;

import static io.sampadadubey.java.common.NumberConstants.ONE;
import static io.sampadadubey.java.common.NumberConstants.TWO;
import static io.sampadadubey.java.common.NumberConstants.ZERO;

public class StartOz {

    public final String startOz(final String str) {

        final StringBuilder output = new StringBuilder();

        if (str.length() >= TWO) {

            final String first = str.substring(ZERO, ONE);
            final String second = str.substring(ONE, TWO);

            if ("o".equals(first)) {
                output.append(first);
            }

            if ("z".equals(second)) {
                output.append(second);
            }

        } else {
            output.append(str);
        }

        return output.toString();
    }
}
