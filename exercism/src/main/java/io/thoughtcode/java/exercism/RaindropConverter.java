package io.thoughtcode.java.exercism;

public class RaindropConverter {

    static final int THREE = 3;

    static final int FIVE = 5;

    static final int SEVEN = 7;

    static final String PLING = "Pling";

    static final String PLANG = "Plang";

    static final String PLONG = "Plong";

    String convert(final int number) {

        final StringBuilder result = new StringBuilder();

        if (number % THREE == 0) {
            result.append(PLING);
        }

        if (number % FIVE == 0) {
            result.append(PLANG);
        }

        if (number % SEVEN == 0) {
            result.append(PLONG);
        }

        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }

        return result.toString();
    }
}
