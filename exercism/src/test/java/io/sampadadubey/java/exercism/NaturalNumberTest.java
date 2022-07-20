package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class NaturalNumberTest {

    @Test
    void testSmallPerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(6).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    void testMediumPerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(28).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    void testLargePerfectNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(33550336).getClassification()).isEqualTo(Classification.PERFECT);
    }

    @Test
    void testSmallAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(12).getClassification()).isEqualTo(Classification.ABUNDANT);

    }

    @Test
    void testMediumAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(30).getClassification()).isEqualTo(Classification.ABUNDANT);
    }

    @Test
    void testLargeAbundantNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(33550335).getClassification()).isEqualTo(Classification.ABUNDANT);
    }

    @Test
    void testSmallestPrimeDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(2).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    void testSmallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(4).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    void testMediumDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(32).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    void testLargeDeficientNumberIsClassifiedCorrectly() {
        assertThat(new NaturalNumber(33550337).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    /*
     * The number 1 has no proper divisors
     * (https://en.wikipedia.org/wiki/Divisor#Further_notions_and_facts), and the
     * additive identity is 0, so the aliquot sum of 1 should be 0. Hence 1 should
     * be classified as deficient.
     */
    void testThatOneIsCorrectlyClassifiedAsDeficient() {
        assertThat(new NaturalNumber(1).getClassification()).isEqualTo(Classification.DEFICIENT);
    }

    @Test
    void testThatNonNegativeIntegerIsRejected() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new NaturalNumber(0))
                .withMessage("You must supply a natural number (positive integer)");
    }

    @Test
    void testThatNegativeIntegerIsRejected() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new NaturalNumber(-1))
                .withMessage("You must supply a natural number (positive integer)");
    }
}
