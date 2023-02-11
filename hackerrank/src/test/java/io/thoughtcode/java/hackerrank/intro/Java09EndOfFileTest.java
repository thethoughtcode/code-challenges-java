package io.thoughtcode.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class Java09EndOfFileTest {

    private final Java09EndOfFile fixture = new Java09EndOfFile();

    @Test
    void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String input = "Hello world\nI am a file\nRead me until end-of-file.\n";

        final String expected = "1 Hello world\n2 I am a file\n3 Read me until end-of-file.\n";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}
