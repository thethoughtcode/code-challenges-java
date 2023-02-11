package io.thoughtcode.java.codingbat.warmup1;

public class EveryNth {

    public final String everyNth(final String str, final int number) {

        final StringBuilder output = new StringBuilder();

        if (str.length() < number) {
            output.append(Character.toString(str.charAt(0)));
        } else {

            output.append(Character.toString(str.charAt(0)));

            for (int iteration = 1; (iteration * number) < str.length(); iteration++) {
                output.append(str.charAt(iteration * number));
            }
        }

        return output.toString();
    }
}
