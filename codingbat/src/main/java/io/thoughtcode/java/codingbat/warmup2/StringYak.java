package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.NumberConstants.THREE;
import static io.thoughtcode.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class StringYak {

    public String stringYak(final String str) {

        final String input = Optional.ofNullable(str).orElse(EMPTY);

        String output = input;

        if (input.length() >= THREE) {
            output = str.replaceAll("y[a-zA-Z0-9]{1}k", "");
        }

        return output;
    }
}
