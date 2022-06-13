package io.sampadadubey.java.hackerrank.intro;

import static java.lang.Math.random;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java04StdinStdout2Test {

    private ByteArrayOutputStream output;

    private final Java04StdinStdout2 fixture = new Java04StdinStdout2();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String intValue = String.valueOf((int) (random() * 100));
        final String doubleValue = String.valueOf(random() * 100);
        final String stringValue = randomUUID().toString();

        final String input = String.join("\n", intValue, doubleValue, stringValue);

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(intValue).contains(doubleValue).contains(stringValue);
    }
}
