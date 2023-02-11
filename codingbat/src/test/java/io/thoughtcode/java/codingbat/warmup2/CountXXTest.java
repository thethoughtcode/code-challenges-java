package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountXXTest {

    private CountXX fixture;

    @BeforeEach
    void setUp() {
        fixture = new CountXX();
    }

    @Test
    void shouldReturnZeroWhenStringIsNull() {

        final String str = null;

        final int expected = 0;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroWhenStringIsEmpty() {

        final String str = EMPTY;

        final int expected = 0;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroWhenStringIsNotEmptyAndNoOccurrence() {

        final String str = "abcd";

        final int expected = 0;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOneWhenStringIsNotEmptyAndSingleOccurrence() {

        final String str = "axxd";

        final int expected = 1;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceNonOverlapping() {

        final String str = "abxxcdxx";

        final int expected = 2;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceOverlapping() {

        final String str = "xxxx";

        final int expected = 3;

        final int actual = fixture.countXXValues(str);

        assertThat(actual).isEqualTo(expected);
    }
}
