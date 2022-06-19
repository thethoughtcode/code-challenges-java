package io.sampadadubey.java.hackerrank.strings;

public class Java03SubstringComparisons {

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
