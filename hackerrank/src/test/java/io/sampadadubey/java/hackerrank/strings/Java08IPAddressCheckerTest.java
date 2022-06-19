package io.sampadadubey.java.hackerrank.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Java08IPAddressCheckerTest {

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "true\ntrue\ntrue\nfalse\nfalse\nfalse\ntrue\nfalse";

        Java08IPAddressChecker.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
