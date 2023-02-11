package io.thoughtcode.java.exercism;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnagramTest {

    @Test
    void testNoMatches() {

        final String word = "diaper";
        final List<String> matches = Arrays.asList("hello", "world", "zombies", "pants");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testDetectMultipleAnagrams() {

        final String word = "master";
        final List<String> matches = Arrays.asList("stream", "pigeon", "maters");
        final List<String> expected = Arrays.asList("stream", "maters");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testEliminateAnagramSubsets() {

        final String word = "good";
        final List<String> matches = Arrays.asList("dog", "goody");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testDetectLongerAnagram() {

        final String word = "listen";
        final List<String> matches = Arrays.asList("enlists", "google", "inlets", "banana");
        final List<String> expected = Arrays.asList("inlets");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testDetectMultipleAnagramsForLongerWord() {

        final String word = "allergy";
        final List<String> matches = Arrays.asList("gallery", "ballerina", "regally", "clergy", "largely", "leading");
        final List<String> expected = Arrays.asList("gallery", "regally", "largely");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testDetectsMultipleAnagramsWithDifferentCase() {

        final String word = "nose";
        final List<String> matches = Arrays.asList("Eons", "ONES");
        final List<String> expected = Arrays.asList("Eons", "ONES");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testEliminateAnagramsWithSameChecksum() {

        final String word = "mass";
        final List<String> matches = Arrays.asList("last");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testCaseInsensitiveWhenBothAnagramAndSubjectStartWithUpperCaseLetter() {

        final String word = "Orchestra";
        final List<String> matches = Arrays.asList("cashregister", "Carthorse", "radishes");
        final List<String> expected = Arrays.asList("Carthorse");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testCaseInsensitiveWhenSubjectStartsWithUpperCaseLetter() {

        final String word = "Orchestra";
        final List<String> matches = Arrays.asList("cashregister", "carthorse", "radishes");
        final List<String> expected = Arrays.asList("carthorse");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testCaseInsensitiveWhenAnagramStartsWithUpperCaseLetter() {

        final String word = "orchestra";
        final List<String> matches = Arrays.asList("cashregister", "Carthorse", "radishes");
        final List<String> expected = Arrays.asList("Carthorse");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testIdenticalWordRepeatedIsNotAnagram() {

        final String word = "go";
        final List<String> matches = Arrays.asList("go Go GO");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testAnagramMustUseAllLettersExactlyOnce() {

        final String word = "tapper";
        final List<String> matches = Arrays.asList("patter");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testWordsAreNotAnagramsOfThemselvesCaseInsensitive() {

        final String word = "BANANA";
        final List<String> matches = Arrays.asList("BANANA", "Banana", "banana");
        final List<String> expected = emptyList();

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }

    @Test
    void testWordsOtherThanThemselvesCanBeAnagrams() {

        final String word = "LISTEN";
        final List<String> matches = Arrays.asList("Listen", "Silent", "LISTEN");
        final List<String> expected = Arrays.asList("Silent");

        final Anagram detector = new Anagram(word);

        assertThat(detector.match(matches)).containsExactlyElementsOf(expected);
    }
}
