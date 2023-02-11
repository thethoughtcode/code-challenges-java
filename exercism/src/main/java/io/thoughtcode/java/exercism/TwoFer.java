package io.thoughtcode.java.exercism;

import java.util.Optional;

public class TwoFer {

    static final String TEMPLATE_RESPONSE = "One for %s, one for me.";

    public String twofer(final String input) {

        final String name = Optional.ofNullable(input).orElseGet(() -> "you").trim();

        return String.format(TEMPLATE_RESPONSE, name);
    }
}
