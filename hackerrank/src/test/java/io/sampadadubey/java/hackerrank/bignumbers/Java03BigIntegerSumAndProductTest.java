package io.sampadadubey.java.hackerrank.bignumbers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Java03BigIntegerSumAndProductTest {

    @Test
    void defaultCase() {

        final ByteArrayInputStream input = new ByteArrayInputStream("1234\n20\n".getBytes());
        System.setIn(input);

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "1254\n24680";

        Java03BigIntegerSumAndProduct.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
