package io.thoughtcode.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class Java12DateAndTimeTest {

    private final Java12DateAndTime fixture = new Java12DateAndTime();

    @Test
    void defaultCase() {

        final String expected = "WEDNESDAY";

        final String actual = fixture.findDay(8, 5, 2015);

        assertThat(actual).isEqualTo(expected);
    }
}
