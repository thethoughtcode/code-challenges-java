package io.sampadadubey.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

class Java13CurrencyFormatterTest {

    static final double PAYMENT = 12_324.134;

    private final Java13CurrencyFormatter fixture = new Java13CurrencyFormatter();

    @Test
    void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "US: $12,324.13\nIndia: ₹ 12,324.13\nChina: ￥12,324.13\nFrance: 12 324,13 €";

        fixture.format(PAYMENT);

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

}
