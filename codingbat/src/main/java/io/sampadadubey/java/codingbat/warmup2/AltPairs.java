package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.NumberConstants.TWO;
import static io.sampadadubey.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class AltPairs {

    public String altPairs(final String input) {

        final String str = Optional.ofNullable(input).orElse(EMPTY);

        final StringBuilder result = new StringBuilder();

        if (str.length() <= TWO) {
            result.append(str);
        } else {
            int count = 0;
            int currentCharPos = TWO * count;
            int nextCharPos = currentCharPos + 1;
            final int stringLength = str.length();

            do {

                result.append(str.charAt(currentCharPos));

                if (nextCharPos < stringLength) {
                    result.append(str.charAt(nextCharPos));
                }

                count += TWO;

                currentCharPos = TWO * count;
                nextCharPos = currentCharPos + 1;

            } while (currentCharPos < stringLength);
        }

        return result.toString();
    }
}
