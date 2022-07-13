package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ScrabbleScoreTest {

    @Test
    void testALowerCaseLetter() {
        final ScrabbleScore scrabble = new ScrabbleScore("a");
        assertThat(scrabble.getScore()).isEqualTo(1);
    }

    @Test
    void testAUpperCaseLetter() {
        final ScrabbleScore scrabble = new ScrabbleScore("A");
        assertThat(scrabble.getScore()).isEqualTo(1);
    }

    @Test
    void testAValuableLetter() {
        final ScrabbleScore scrabble = new ScrabbleScore("f");
        assertThat(scrabble.getScore()).isEqualTo(4);
    }

    @Test
    void testAShortWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("at");
        assertThat(scrabble.getScore()).isEqualTo(2);
    }

    @Test
    void testAShortValuableWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("zoo");
        assertThat(scrabble.getScore()).isEqualTo(12);
    }

    @Test
    void testAMediumWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("street");
        assertThat(scrabble.getScore()).isEqualTo(6);
    }

    @Test
    void testAMediumValuableWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("quirky");
        assertThat(scrabble.getScore()).isEqualTo(22);
    }

    @Test
    void testALongMixCaseWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("OxyphenButazone");
        assertThat(scrabble.getScore()).isEqualTo(41);
    }

    @Test
    void testAEnglishLikeWord() {
        final ScrabbleScore scrabble = new ScrabbleScore("pinata");
        assertThat(scrabble.getScore()).isEqualTo(8);
    }

    @Test
    void testAnEmptyInput() {
        final ScrabbleScore scrabble = new ScrabbleScore("");
        assertThat(scrabble.getScore()).isEqualTo(0);
    }

    @Test
    void testEntireAlphabetAvailable() {
        final ScrabbleScore scrabble = new ScrabbleScore("abcdefghijklmnopqrstuvwxyz");
        assertThat(scrabble.getScore()).isEqualTo(87);
    }
}
