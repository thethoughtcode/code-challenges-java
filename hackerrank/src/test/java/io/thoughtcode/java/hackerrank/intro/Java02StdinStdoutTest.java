package io.thoughtcode.java.hackerrank.intro;

import static java.lang.Math.random;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java02StdinStdoutTest {

    private ByteArrayOutputStream output;

    private final Java02StdinStdout fixture = new Java02StdinStdout();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String number1 = String.valueOf((int) (random() * 100));
        final String number2 = String.valueOf((int) (random() * 100));
        final String number3 = String.valueOf((int) (random() * 100));

        final String input = String.join("\n", number1, number2, number3);

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(number1).contains(number2).contains(number3);
    }
}
