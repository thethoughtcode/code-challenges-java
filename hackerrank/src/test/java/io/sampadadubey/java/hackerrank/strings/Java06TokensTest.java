package io.sampadadubey.java.hackerrank.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class Java06TokensTest {

    private final Java06Tokens fixture = new Java06Tokens();

    @Test
    void defaultCase() {

        final String string = "He is a very very good boy, isn't he?";

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "10\nHe\nis\na\nvery\nvery\ngood\nboy\nisn\nt\nhe";

        fixture.processToken(string);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
