package io.sampadadubey.java.exercism;

class RotationalCipher {

    static final String POSITIONS = "abcdefghijklmnopqrstuvwxyz";

    private final int shiftKey;

    RotationalCipher(final int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(final String data) {

        final StringBuilder result = new StringBuilder(data.length());

        for (int index = 0; index < data.length(); index++) {

            final char currentCharacter = data.charAt(index);
            final boolean upper = isUpper(currentCharacter);
            final char lower = upper ? toLower(currentCharacter) : currentCharacter;

            if (isLower(lower)) {
                final char rotated = getRotatedCharacter(lower);
                result.append(upper ? toUpper(rotated) : rotated);
            } else {
                result.append(lower);
            }
        }

        return result.toString();
    }

    private boolean isUpper(final char character) {
        return 'A' <= character && character <= 'Z';
    }

    private boolean isLower(final char character) {
        return 'a' <= character && character <= 'z';
    }

    private char toLower(final char character) {
        return (char) (((int) character) + 32);
    }

    private char toUpper(final char character) {
        return (char) (((int) character) - 32);
    }

    private char getRotatedCharacter(final char character) {

        final int currentPosition = POSITIONS.indexOf(character);

        int rotatedPosition = currentPosition + shiftKey;

        if (rotatedPosition >= POSITIONS.length()) {
            rotatedPosition = rotatedPosition - POSITIONS.length();
        }

        return POSITIONS.charAt(rotatedPosition);
    }
}
