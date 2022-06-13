package io.sampadadubey.java.hackerrank.intro;

import static io.sampadadubey.java.hackerrank.intro.Java03IfElse.NOT_WEIRD;
import static io.sampadadubey.java.hackerrank.intro.Java03IfElse.WEIRD;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java03IfElseTest {

    private ByteArrayOutputStream output;

    private final Java03IfElse fixture = new Java03IfElse();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String input = "3";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs2() {

        final String input = "2";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(NOT_WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs4() {

        final String input = "4";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(NOT_WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIs6() {

        final String input = "6";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIs20() {

        final String input = "20";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIs22() {

        final String input = "22";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(NOT_WEIRD);
    }

    @Test
    void run_LogsWierd_WhenInputStringIsNegativeOdd() {

        final String input = "-3";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(WEIRD);
    }

    @Test
    void run_LogsNotWierd_WhenInputStringIsNegativeEven() {

        final String input = "-2";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(NOT_WEIRD);
    }
}
