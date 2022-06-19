package io.sampadadubey.java.hackerrank.strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Java05AnagramsTest {

    private final Java05Anagrams fixture = new Java05Anagrams();

    @Test
    void isAnagram_ReturnsTrue_WhenStringsAreAnagrams() {

        final String string1 = "anagram";
        final String string2 = "margana";

        final boolean actual = fixture.isAnagram(string1, string2);

        assertThat(actual).isTrue();
    }

    @Test
    void isAnagram_ReturnsTrue_WhenStringsAreAnagramsCaseMismatch() {

        final String string1 = "Hello";
        final String string2 = "hello";

        final boolean actual = fixture.isAnagram(string1, string2);

        assertThat(actual).isTrue();
    }

    @Test
    void isAnagram_ReturnsFalse_WhenStringsAreNotAnagrams() {

        final String string1 = "anagramm";
        final String string2 = "marganaa";

        final boolean actual = fixture.isAnagram(string1, string2);

        assertThat(actual).isFalse();
    }

    @Test
    void isAnagram_ReturnsFalse_WhenStringsAreNotOfSameLength() {

        final String string1 = "anagramm";
        final String string2 = "margana";

        final boolean actual = fixture.isAnagram(string1, string2);

        assertThat(actual).isFalse();
    }
}
