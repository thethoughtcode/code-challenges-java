package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringPallindrome {

    public static void main(final String[] args) {

        final String input = "madam";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String string = scanner.next();

        scanner.close();

        System.out.println(new StringPallindrome().isPallindrome(string));
    }

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
