package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class StringMatch {

    public int stringMatch(final String input1, final String input2) {

        final String string1 = Optional.ofNullable(input1).orElse(EMPTY);
        final String string2 = Optional.ofNullable(input2).orElse(EMPTY);

        final int loopCounter = Math.min(string1.length(), string2.length());

        int totalMatches = 0;

        for (int i = 0; i < loopCounter - 1; i++) {

            final String subStringA = string1.substring(i, i + 2);
            final String subStringB = string2.substring(i, i + 2);

            if (subStringA.equals(subStringB)) {
                totalMatches++;
            }
        }

        return totalMatches;
    }
}
