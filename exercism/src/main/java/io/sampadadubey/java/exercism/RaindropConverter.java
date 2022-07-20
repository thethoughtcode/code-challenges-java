package io.sampadadubey.java.exercism;

public class RaindropConverter {

    static final int THREE = 3;

    static final int FIVE = 5;

    static final int SEVEN = 7;

    String convert(final int number) {

        final StringBuilder result = new StringBuilder();

        if (number % THREE == 0) {
            result.append("Pling");
        }

        if (number % FIVE == 0) {
            result.append("Plang");
        }

        if (number % SEVEN == 0) {
            result.append("Plong");
        }

        if (result.length() == 0) {
            result.append(String.valueOf(number));
        }

        return result.toString();
    }
}
