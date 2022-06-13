package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LastDigitTest {

    private LastDigit fixture;

    @BeforeEach
    void setUp() {
        fixture = new LastDigit();
    }

    @Test
    void shouldReturnTrueWhenLastDigitsAreSame() {

        final int num1 = 17;
        final int num2 = 7;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenLastDigitsAreNotSame() {

        final int num1 = 17;
        final int num2 = 13;

        final boolean expected = false;

        final boolean actual = fixture.lastDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
