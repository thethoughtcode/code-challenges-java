package io.sampadadubey.java.hackerrank.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringPallindromeTest {

    private ByteArrayOutputStream output;

    private StringPallindrome fixture = new StringPallindrome();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        final String expected = "Yes";

        StringPallindrome.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    public void isPallindrome_ReturnsNo_WhenStringIsNotPallindrome() {

        final String expected = "No";

        final String actual = fixture.isPallindrome(randomUUID().toString());

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
