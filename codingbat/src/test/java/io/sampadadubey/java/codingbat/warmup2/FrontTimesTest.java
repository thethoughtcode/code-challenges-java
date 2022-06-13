package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrontTimesTest {

    private FrontTimes fixture;

    @BeforeEach
    void setUp() {
        fixture = new FrontTimes();
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;
        final int number = 5;

        final String expected = EMPTY;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = EMPTY;
        final int number = 5;

        final String expected = EMPTY;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthLessThan3() {

        final String str = "a";
        final int number = 3;

        final String expected = "aaa";

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthGreaterThan3() {

        final String str = "abcd";
        final int number = 2;

        final String expected = "abcabc";

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontStringWhenStringIsNotEmptyAndNumberIsZero() {

        final String str = "abcd";
        final int number = 0;

        final String expected = EMPTY;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }
}
