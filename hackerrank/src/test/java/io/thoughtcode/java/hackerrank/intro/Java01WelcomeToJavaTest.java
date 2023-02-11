package io.thoughtcode.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java01WelcomeToJavaTest {

    private ByteArrayOutputStream output;

    private final Java01WelcomeToJava fixture = new Java01WelcomeToJava();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String expected = "Hello, World.\nHello, Java.\n";

        fixture.print();

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}
