package io.sampadadubey.java.hackerrank.strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class Java02SubStringsTest {

    private final Java02SubStrings fixture = new Java02SubStrings();

    @Test
    public void defaultCase() {

        final String string = "Helloworld";
        final int startPosition = 3;
        final int endPosition = 7;

        final String expected = "lowo";

        final String actual = fixture.run(string, startPosition, endPosition);

        assertThat(actual).isEqualTo(expected);
    }
}
