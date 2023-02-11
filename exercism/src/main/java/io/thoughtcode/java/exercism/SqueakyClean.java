package io.thoughtcode.java.exercism;

public class SqueakyClean {

    String clean(final String identifier) {

        String allSpacesReplaced = identifier.replaceAll(" ", "_");
        String allSpaceAndNumbersReplaced = allSpacesReplaced.replaceAll("[0-9]", "");

        final int length = allSpaceAndNumbersReplaced.length();

        final StringBuilder result = new StringBuilder();

        for (int index = 0; index < length; index++) {

            final char value = allSpaceAndNumbersReplaced.charAt(index);

            if (isControlCharacter(value)) {
                result.append("CTRL");
            } else if (isGreekCharacter(value)) {
                continue;
            } else if (isHyphen(value) && (index + 1 != length)) {
                index++;
                result.append(Character.toUpperCase(allSpaceAndNumbersReplaced.charAt(index)));
            } else if (isEmoji(value)) {
                continue;
            } else {
                result.append(value);
            }
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
