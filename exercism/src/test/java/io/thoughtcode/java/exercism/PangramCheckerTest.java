package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PangramCheckerTest {

    private PangramChecker pangramChecker;

    @BeforeEach
    void setup() {
        pangramChecker = new PangramChecker();
    }

    @Test
    void emptySentenceIsNotPangram() {
        assertThat(pangramChecker.isPangram("")).isFalse();
    }

    @Test
    void perfectLowerCasePhraseIsPangram() {
        assertThat(pangramChecker.isPangram("abcdefghijklmnopqrstuvwxyz")).isTrue();
    }

    @Test
    void phraseWithOnlyLowerCaseIsPangram() {
        assertThat(pangramChecker.isPangram("the quick brown fox jumps over the lazy dog")).isTrue();
    }

    @Test
    void phraseMissingCharacterXIsNotPangram() {
        assertThat(pangramChecker.isPangram("a quick movement of the enemy will jeopardize five gunboats")).isFalse();
    }

    @Test
    void phraseMissingCharacterHIsNotPangram() {
        assertThat(pangramChecker.isPangram("five boxing wizards jump quickly at it")).isFalse();
    }

    @Test
    void phraseWithUnderscoresIsPangram() {
        assertThat(pangramChecker.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog")).isTrue();
    }

    @Test
    void phraseWithNumbersIsPangram() {
        assertThat(pangramChecker.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs")).isTrue();
    }

    @Test
    void phraseWithMissingLettersReplacedByNumbersIsNotPangram() {
        assertThat(pangramChecker.isPangram("7h3 qu1ck brown fox jumps ov3r 7h3 lazy dog")).isFalse();
    }

    @Test
    void phraseWithMixedCaseAndPunctuationIsPangram() {
        assertThat(pangramChecker.isPangram("\"Five quacking Zephyrs jolt my wax bed.\"")).isTrue();
    }

    @Test
    void caseInsensitivePhraseIsNotPangram() {
        assertThat(pangramChecker.isPangram("the quick brown fox jumps over with lazy FX")).isFalse();
    }
}
