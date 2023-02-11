package io.thoughtcode.java.codingbat.warmup1;

public class MissingChar {

    public final String missingChar(final String str, final int number) {
        return str.substring(0, number) + str.substring(number + 1, str.length());
    }
}
