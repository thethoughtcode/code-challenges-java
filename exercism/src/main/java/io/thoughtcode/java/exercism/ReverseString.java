package io.thoughtcode.java.exercism;

import java.util.Optional;

public class ReverseString {

    String reverse(final String inputString) {

        final String input = Optional.ofNullable(inputString).orElseGet(() -> "").trim();

        final StringBuilder reverse = new StringBuilder();

        for (int index = input.length() - 1; index >= 0; index--) {
            reverse.append(input.charAt(index));
        }

        return reverse.toString();
    }
}
