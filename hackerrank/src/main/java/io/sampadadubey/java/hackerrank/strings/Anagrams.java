package io.sampadadubey.java.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Anagrams {

    public boolean isAnagram(final String string1, final String string2) {

        final int string1Length = string1.length();

        if (string1Length != string2.length()) {
            return false;
        }

        final Map<Character, Integer> string1CharacterCounts = new HashMap<>(string1Length);
        final Map<Character, Integer> string2CharacterCounts = new HashMap<>(string1Length);

        for (int index = 0; index < string1Length; index++) {

            final char currentCharString1 = Character.toLowerCase(string1.charAt(index));
            final char currentCharString2 = Character.toLowerCase(string2.charAt(index));

            string1CharacterCounts.merge(currentCharString1, 1, (oldCount, currentCount) -> oldCount + currentCount);
            string2CharacterCounts.merge(currentCharString2, 1, (oldCount, currentCount) -> oldCount + currentCount);
        }

        for (final Entry<Character, Integer> string1CharacterCountEntry : string1CharacterCounts.entrySet()) {

            final Character currentCharString1 = string1CharacterCountEntry.getKey();
            final int currentCharCountString1 = string1CharacterCountEntry.getValue();

            final int currentCharCountString2 = string2CharacterCounts.getOrDefault(currentCharString1, -1);

            if (currentCharCountString1 != currentCharCountString2) {
                return false;
            }
        }

        return true;
    }
}
