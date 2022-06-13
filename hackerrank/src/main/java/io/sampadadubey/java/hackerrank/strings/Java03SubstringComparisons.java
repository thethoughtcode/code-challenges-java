package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Java03SubstringComparisons {

    public static void main(final String[] args) {

        final String input = "welcometojava\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String string = scanner.next();
        final int splitSize = scanner.nextInt();

        scanner.close();

        new Java03SubstringComparisons().run(string, splitSize);
    }

    public void run(final String string, final int splitSize) {

        if (splitSize >= string.length()) {
            System.out.printf("%s\n%s\n", string, string);
            return;
        }

        int startIndex = 0;
        int endIndex = splitSize;

        String min = "";
        String max = "";

        while (endIndex <= string.length()) {

            final String currentSplit = string.substring(startIndex, endIndex);

            if ("".equals(min)) {
                min = currentSplit;
            }

            if ("".equals(max)) {
                max = currentSplit;
            }

            if (min.compareTo(currentSplit) > 0) {
                min = currentSplit;
            }

            if (max.compareTo(currentSplit) < 0) {
                max = currentSplit;
            }

            startIndex++;
            endIndex++;
        }

        System.out.printf("%s\n%s\n", min, max);
    }
}
