package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsogramCheckerTest {

    private IsogramChecker isogramChecker;

    @BeforeEach
    void setUp() {
        isogramChecker = new IsogramChecker();
    }

    @Test
    void testEmptyString() {
        assertThat(isogramChecker.isIsogram("")).isTrue();
    }

    @Test
    void testLowercaseIsogram() {
        assertThat(isogramChecker.isIsogram("isogram")).isTrue();
    }

    @Test
    void testNotIsogram() {
        assertThat(isogramChecker.isIsogram("eleven")).isFalse();
    }

    @Test
    void testDuplicateEndAlphabet() {
        assertThat(isogramChecker.isIsogram("zzyzx")).isFalse();
    }

    @Test
    void testMediumLongIsogram() {
        assertThat(isogramChecker.isIsogram("subdermatoglyphic")).isTrue();
    }

    @Test
    void testCaseInsensitive() {
        assertThat(isogramChecker.isIsogram("Alphabet")).isFalse();
    }

    @Test
    void testDuplicatMixedCase() {
        assertThat(isogramChecker.isIsogram("alphAbet")).isFalse();
    }

    @Test
    void testIsogramWithHyphen() {
        assertThat(isogramChecker.isIsogram("thumbscrew-japingly")).isTrue();
    }

    @Test
    void testIsogramWithDuplicatedCharAfterHyphen() {
        assertThat(isogramChecker.isIsogram("thumbscrew-jappingly")).isFalse();
    }

    @Test
    void testIsogramWithDuplicatedHyphen() {
        assertThat(isogramChecker.isIsogram("six-year-old")).isTrue();
    }

    @Test
    void testMadeUpNameThatIsAnIsogram() {
        assertThat(isogramChecker.isIsogram("Emily Jung Schwartzkopf")).isTrue();
    }

    @Test
    void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        assertThat(isogramChecker.isIsogram("accentor")).isFalse();
    }

    @Test
    void testSameFirstAndLast() {
        assertThat(new IsogramChecker().isIsogram("angola")).isFalse();
    }
}
