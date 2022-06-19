package io.sampadadubey.java.hackerrank.bignumbers;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.nio.charset.StandardCharsets;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Java01BigDecimalTest {

    private final Java01BigDecimal fixture = new Java01BigDecimal();

    @Test
    void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = String.join("\n", Arrays.asList(
            "90",
            "56.6",
            "50",
            "02.34",
            "0.12",
            ".12",
            "0",
            "000.000",
            "-100"
        ));

        Java01BigDecimal.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void returnsSamePositionsWhenNumber1IsNull() {

        final String[] numbers = new String[] {null, "1"};

        fixture.sortNumbers(numbers);

        assertThat(numbers).containsExactlyInAnyOrderElementsOf(Arrays.asList(null, "1"));
    }

    @Test
    void returnsSamePositionsWhenNumber2IsNull() {

        final String[] numbers = new String[] {"1", null};

        fixture.sortNumbers(numbers);

        assertThat(numbers).containsExactlyInAnyOrderElementsOf(Arrays.asList("1", null));
    }

    @Test
    void returnsSamePositionsWhenBothNumber1AndNumber2AreNull() {

        final String[] numbers = new String[] {null, null};

        fixture.sortNumbers(numbers);

        assertThat(numbers).containsExactlyInAnyOrderElementsOf(Arrays.asList(null, null));
    }
}
