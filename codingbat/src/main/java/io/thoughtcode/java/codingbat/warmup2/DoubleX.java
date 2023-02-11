package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class DoubleX {

    static final char CHAR_X = 'x';

    public boolean doubleX(final String str) {

        final String input = Optional.ofNullable(str).orElse(EMPTY);

        boolean result = false;

        final int strLength = input.length();

        for (int index = 0; index < strLength - 1; index++) {
            if (input.charAt(index) == CHAR_X) {
                result = input.charAt(index + 1) == CHAR_X;
                break;
            }
        }

        return result;
    }
}
