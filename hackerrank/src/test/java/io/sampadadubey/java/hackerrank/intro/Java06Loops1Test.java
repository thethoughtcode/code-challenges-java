package io.sampadadubey.java.hackerrank.intro;

import static java.lang.Math.random;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.sampadadubey.java.common.NumberConstants;

class Java06Loops1Test {

    private ByteArrayOutputStream output;

    private final Java06Loops1 fixture = new Java06Loops1();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void run_PrintsMultipleTable_ForGivenNumber() {

        final int number = (int) (random() * NumberConstants.HUNDRED);

        fixture.run(number);

        final String actual = output.toString(StandardCharsets.UTF_8);

        for (int index = 1; index <= NumberConstants.TEN; index++) {
            assertThat(actual).contains(String.format("%d x %d = %d", number, index, number * index));
        }
    }
}
