package io.sampadadubey.java.hackerrank.bignumbers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class Java02BigIntegerPrimeTest {

    @Test
    void defaultCasePrime() {

        final String number = "2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983";
        final String[] args = new String[] { number };

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Java02BigIntegerPrime.main(args);

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        Assertions.assertThat(actual).isEqualTo("prime");
    }

    @Test
    void defaultCaseNotPrime() {

        final String number = "4";
        final String[] args = new String[] { number };

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Java02BigIntegerPrime.main(args);

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        Assertions.assertThat(actual).isEqualTo("not prime");
    }
}
