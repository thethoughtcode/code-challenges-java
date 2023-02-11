package io.thoughtcode.java.exercism;

public class SqueakyClean {

    String clean(final String identifier) {

        final String allSpacesReplaced = identifier.replaceAll(" ", "_");
        final String allSpaceAndNumbersReplaced = allSpacesReplaced.replaceAll("[0-9]", "");

        final int length = allSpaceAndNumbersReplaced.length();

        final StringBuilder result = new StringBuilder();

        int index = 0;

        while (index < length) {

            final char value = allSpaceAndNumbersReplaced.charAt(index);

            if (isControlCharacter(value)) {
                result.append("CTRL");
            } else if (isGreekCharacter(value) || isEmoji(value)) {
                // Nothing to do
            } else if (isHyphen(value) && index + 1 != length) {
                index++;
                result.append(Character.toUpperCase(allSpaceAndNumbersReplaced.charAt(index)));
            } else {
                result.append(value);
            }

            index++;
        }

        return result.toString();
    }

    boolean isControlCharacter(final char value) {
        return value <= 37 || value == 127;
    }

    boolean isGreekCharacter(final char value) {
        return 945 <= value && value <= 969;
    }

    boolean isHyphen(final char value) {
        return value == '-';
    }

    boolean isEmoji(final char value) {
        return value >= 8032;
    }
}
