package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @BeforeEach
    void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    void testEmptyRnaSequence() {
        assertThat(rnaTranscription.transcribe("")).isEmpty();
    }

    @Test
    void testRnaTranscriptionOfCytosineIsGuanine() {
        assertThat(rnaTranscription.transcribe("C")).isEqualTo("G");
    }

    @Test
    void testRnaTranscriptionOfGuanineIsCytosine() {
        assertThat(rnaTranscription.transcribe("G")).isEqualTo("C");
    }

    @Test
    void testRnaTranscriptionOfThymineIsAdenine() {
        assertThat(rnaTranscription.transcribe("T")).isEqualTo("A");
    }

    @Test
    void testRnaTranscriptionOfAdenineIsUracil() {
        assertThat(rnaTranscription.transcribe("A")).isEqualTo("U");
    }

    @Test
    void testRnaTranscription() {
        assertThat(rnaTranscription.transcribe("ACGTGGTCTTAA")).isEqualTo("UGCACCAGAAUU");
    }
}
