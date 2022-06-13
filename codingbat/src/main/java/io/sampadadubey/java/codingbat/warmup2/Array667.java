package io.sampadadubey.java.codingbat.warmup2;

import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Array667 {

    static final Pattern PATTERN = Pattern.compile("6[67]");

    public int array667(final int[] input) {

        final int[] nums = Optional.ofNullable(input).orElse(new int[]{});

        final StringBuilder numString = new StringBuilder();

        Arrays.stream(nums).forEach(num -> numString.append(num));

        final Matcher matcher = PATTERN.matcher(numString);

        int count = 0;
        int startIndex = 0;

        while (matcher.find(startIndex)) {
            startIndex = matcher.end() - 1;
            count++;
        }

        return count;
    }
}
