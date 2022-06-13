package io.sampadadubey.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java11IntToStringTest {

    private ByteArrayOutputStream output;

    private final Java11IntToString fixture = new Java11IntToString();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void run_PrintsGoodJob_WhenInputMatchesToInt() {

        fixture.run(new ByteArrayInputStream("100".getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(Java11IntToString.GOOD_JOB);
    }

    @Test
    void run_PrintsWrongAnswer_WhenInputMisMatchesToInt() {

        fixture.run(new ByteArrayInputStream("a".getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8).trim();

        assertThat(actual).isEqualTo(Java11IntToString.WRONG_ANSWER);
    }
}
