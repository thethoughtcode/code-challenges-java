package io.sampadadubey.java.codingbat.warmup2;

import java.util.Arrays;
import java.util.Optional;

public final class Array123 {

    public boolean array123(final int[] input) {

        final int[] nums = Optional.ofNullable(input).orElse(new int[]{});

        final StringBuilder inputStr = new StringBuilder();

        Arrays.stream(nums).forEach(num -> inputStr.append(num));

        return inputStr.toString().contains("123");
    }
}
