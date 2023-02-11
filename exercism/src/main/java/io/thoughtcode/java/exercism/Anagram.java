package io.thoughtcode.java.exercism;

import static java.util.stream.Collectors.toList;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class Anagram {

    private final String word;

    Anagram(final String word) {
        this.word = word;
    }

    List<String> match(final List<String> possibles) {
        return possibles.stream().filter(this::match).collect(toList());
    }

    private boolean match(final String matchAgainst) {

        final int wordLength = word.length();

        boolean match = false;

        if (!word.equalsIgnoreCase(matchAgainst) && wordLength == matchAgainst.length()) {

            final String caseInsensitiveWord = word.toLowerCase(Locale.getDefault());
            final String caseInsensitiveMatchAgainst = matchAgainst.toLowerCase(Locale.getDefault());

            final Map<Character, Integer> wordCharacters = new HashMap<>(wordLength);
            final Map<Character, Integer> matchCharacters = new HashMap<>(wordLength);

            for (int index = 0; index < wordLength; index++) {

                final Character wordCharacter = caseInsensitiveWord.charAt(index);
                final Character matchCharacter = caseInsensitiveMatchAgainst.charAt(index);

                final int wordCharacterCount = wordCharacters.getOrDefault(wordCharacter, 0);
                final int matchCharacterCount = matchCharacters.getOrDefault(matchCharacter, 0);

                wordCharacters.put(wordCharacter, wordCharacterCount + 1);
                matchCharacters.put(matchCharacter, matchCharacterCount + 1);
            }

            match = wordCharacters.keySet()
                                  .stream()
                                  .noneMatch(it -> !matchCharacters.containsKey(it)
                                          || wordCharacters.get(it).equals(matchCharacters.get(it)) != true);
        }

        return match;
    }
}
