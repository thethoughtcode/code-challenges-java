package io.thoughtcode.java.codingbat.warmup1;

public class NotString {

    public final String notString(final String str) {

        final String output;

        if (str.startsWith("not")) {
            output = str;
        } else {
            output = "not " + str;
        }

        return output;
    }
}
