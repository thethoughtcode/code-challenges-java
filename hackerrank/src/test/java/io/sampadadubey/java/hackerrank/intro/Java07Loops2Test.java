package io.sampadadubey.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java07Loops2Test {

    private ByteArrayOutputStream output;

    private final Java07Loops2 fixture = new Java07Loops2();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String line1 = "2";
        final String line2 = "0 2 10";
        final String line3 = "5 3 5";

        final String input = String.join("\n", line1, line2, line3);

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String outputLine1 = "2 6 14 30 62 126 254 510 1022 2046";
        final String outputLine2 = "8 14 26 50 98";

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(outputLine1).contains(outputLine2);
    }
}
