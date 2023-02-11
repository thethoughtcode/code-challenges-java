package io.thoughtcode.java.exercism;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(final String phrase) {

        final char[] characters = phrase.toLowerCase(Locale.getDefault()).toCharArray();

        final Set<Character> alphabets = new HashSet<>(characters.length);

        boolean isogram = true;

        for (int index = 0; index < characters.length; index++) {

            final char currentCharacter = characters[index];

            if (currentCharacter == ' ' || currentCharacter == '-') {
                continue;
            } else if (alphabets.contains(currentCharacter)) {
                isogram = false;
                break;
            } else {
                alphabets.add(currentCharacter);
            }
        }

        return isogram;
    }
}
