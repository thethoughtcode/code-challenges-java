package io.thoughtcode.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosNegTest {

    private PosNeg fixture;

    @BeforeEach
    void setUp() {
        fixture = new PosNeg();
    }

    @Test
    void shouldReturnTrueWhenNegativeFlagUnsetAndFirstIsNegative() {

        final boolean expected = true;

        final int value1 = -1;
        final int value2 = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNegativeFlagUnsetAndSecondIsNegative() {

        final boolean expected = true;

        final int value1 = 1;
        final int value2 = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNegativeFlagUnsetAndBothAreNegative() {

        final boolean expected = false;

        final int value1 = -1;
        final int value2 = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNegativeFlagUnsetAndBothArePositive() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNegativeFlagIsSetAndFirstIsNegative() {

        final boolean expected = false;

        final int value1 = -1;
        final int value2 = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNegativeFlagIsSetAndSecondIsNegative() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNegativeFlagIsSetAndBothArePositive() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNegativeFlagIsSetAndBothAreNegative() {

        final boolean expected = true;

        final int value1 = -1;
        final int value2 = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }
}
