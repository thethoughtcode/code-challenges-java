package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class StringBits {

    public String stringBits(final String str) {

        final String input = Optional.ofNullable(str).orElse(EMPTY);

        final StringBuilder result = new StringBuilder();

        for (int index = 0; index < input.length(); index += 2) {
            result.append(input.charAt(index));
        }

        return result.toString();
    }
}
