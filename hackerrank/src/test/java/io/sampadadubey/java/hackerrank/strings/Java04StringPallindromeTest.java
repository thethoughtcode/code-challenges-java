package io.sampadadubey.java.hackerrank.strings;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java04StringPallindromeTest {

    private ByteArrayOutputStream output;

    private Java04StringPallindrome fixture = new Java04StringPallindrome();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void isPallindrome_ReturnsNo_WhenStringIsNotPallindrome() {

        final String expected = "No";

        final String actual = fixture.isPallindrome(randomUUID().toString());

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    void isPallindrome_ReturnsNo_WhenStringIsPallindrome() {

        final String expected = "Yes";

        final String actual = fixture.isPallindrome("Y");

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
