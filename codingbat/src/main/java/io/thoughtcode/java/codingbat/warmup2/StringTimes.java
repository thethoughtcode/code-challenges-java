package io.thoughtcode.java.codingbat.warmup2;

public final class StringTimes {

    public String stringTimes(final String str, final int number) {

        final StringBuilder result = new StringBuilder();

        for (int index = 1; index <= number; index++) {
            result.append(str);
        }

        return result.toString();
    }
}
