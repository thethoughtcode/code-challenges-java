package io.sampadadubey.java.hackerrank.strings;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java01StringIntroductionTest {

    private ByteArrayOutputStream output;

    private final Java01StringIntroduction fixture = new Java01StringIntroduction();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String firstWord = "hello";
        final String secondWord = "java";

        final String expected = "9\nNo\nHello Java";

        fixture.run(firstWord, secondWord);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    void run_PrintsComparisonResultAsYes_WhenFirstWordIsLexicographicallyGreatherThanSecondWord() {

        final String firstWord = "hello";
        final String secondWord = "cat";

        final String expected = "8\nYes\nHello Cat";

        fixture.run(firstWord, secondWord);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
