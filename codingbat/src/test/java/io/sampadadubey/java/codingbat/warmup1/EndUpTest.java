package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EndUpTest {

    private EndUp fixture;

    @BeforeEach
    void setUp() {
        fixture = new EndUp();
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnAllUpperCaseStringWhenStringLengthIsLessThanEqualTo3() {

        final String str = "abc";

        final String expected = "ABC";

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLast3UpperCaseStringWhenStringLengthIsGreaterThan3() {

        final String str = "abcd";

        final String expected = "aBCD";

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }
}
