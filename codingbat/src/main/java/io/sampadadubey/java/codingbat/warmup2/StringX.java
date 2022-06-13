package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.NumberConstants.THREE;
import static io.sampadadubey.java.common.StringConstants.EMPTY;

import java.util.Optional;
import java.util.stream.IntStream;

public final class StringX {

    static final char CHAR_X = 'x';

    public String stringX(final String str) {

        final String input = Optional.ofNullable(str).orElse(EMPTY);

        final StringBuilder result = new StringBuilder();

        if (input.length() >= THREE) {

            result.append(input.charAt(0));

            IntStream.range(1, input.length() - 1).forEach(i -> {

                final char currentChar = input.charAt(i);

                if (currentChar != CHAR_X) {
                    result.append(currentChar);
                }
            });

            result.append(input.charAt(input.length() - 1));

        } else {
            result.append(input);
        }

        return result.toString();
    }
}
