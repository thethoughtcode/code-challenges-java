package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

class HammingTest {

    @Test
    void testNoDistanceBetweenEmptyStrands() {
        assertThat(new Hamming("", "").getHammingDistance()).isEqualTo(0);
    }

    @Test
    void testNoDistanceBetweenShortIdenticalStrands() {
        assertThat(new Hamming("A", "A").getHammingDistance()).isEqualTo(0);
    }

    @Test
    void testCompleteDistanceInSingleLetterDifferentStrands() {
        assertThat(new Hamming("G", "T").getHammingDistance()).isEqualTo(1);
    }

    @Test
    void testDistanceInLongIdenticalStrands() {
        assertThat(new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance()).isEqualTo(0);
    }

    @Test
    void testDistanceInLongDifferentStrands() {
        assertThat(new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance()).isEqualTo(9);
    }

    @Test
    void testValidatesFirstStrandNotLonger() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Hamming("AATG", "AAA"))
                .withMessage("leftStrand and rightStrand must be of equal length.");
    }

    @Test
    void testValidatesSecondStrandNotLonger() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Hamming("ATA", "AGTG"))
                .withMessage("leftStrand and rightStrand must be of equal length.");
    }

    @Test
    void testDisallowLeftEmptyStrand() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Hamming("", "G"))
                .withMessage("left strand must not be empty.");
    }

    @Test
    void testDisallowRightEmptyStrand() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Hamming("G", ""))
                .withMessage("right strand must not be empty.");
    }
}
