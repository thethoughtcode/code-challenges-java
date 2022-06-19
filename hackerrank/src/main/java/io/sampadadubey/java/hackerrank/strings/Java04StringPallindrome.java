package io.sampadadubey.java.hackerrank.strings;

public class Java04StringPallindrome {

    public String isPallindrome(final String string) {
        return string.equals(reverse(string)) ? "Yes" : "No";
    }

    public String reverse(final String string) {

        final int length = string.length();

        if (length == 1) {
            return string;
        }

        return string.substring(length - 1) + reverse(string.substring(0, length - 1));
    }
}
