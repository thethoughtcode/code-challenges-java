package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.NumberConstants.TWO;
import static io.sampadadubey.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class Last2 {

    public int last2(final String str) {

        final String input = Optional.ofNullable(str).orElse(EMPTY);

        int count = 0;

        if (input.length() >= TWO) {

            final int strLength = input.length();
            final String last2 = input.substring(strLength - TWO, strLength);


            for (int index = 0; index < strLength - TWO; index++) {
                final String currentSubstring = input.substring(index, index + TWO);

                if (currentSubstring.equals(last2)) {
                    count++;
                }
            }
        }

        return count;
    }
}
