package io.thoughtcode.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java05OutputFormattingTest {

    private ByteArrayOutputStream output;

    private final Java05OutputFormatting fixture = new Java05OutputFormatting();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void run_FormatsOutputAsExpected() {

        final String expectedLine1 = "random-value1  001";
        final String expectedLine2 = "random-value2  010";
        final String expectedLine3 = "random-value3  100";

        final String input = "random-value1 1\nrandom-value2 10\nrandom-value3 100";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(expectedLine1).contains(expectedLine2).contains(expectedLine3);
    }
}
