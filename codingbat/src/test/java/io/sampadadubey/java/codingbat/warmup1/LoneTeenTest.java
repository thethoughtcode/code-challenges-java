package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoneTeenTest {

    private LoneTeen fixture;

    @BeforeEach
    void setUp() {
        fixture = new LoneTeen();
    }

    @Test
    void shouldReturnFalseWhenNum1IsLessThan13AndNum2IsLessThan13() {

        final int num1 = 12;
        final int num2 = 12;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsEqualTo13AndNum2IsLessThan13() {

        final int num1 = 13;
        final int num2 = 12;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRangeAndNum2IsLessThan13() {

        final int num1 = 15;
        final int num2 = 12;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInEqualTo19AndNum2IsLessThan13() {

        final int num1 = 19;
        final int num2 = 12;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsGreaterThan19AndNum2IsLessThan13() {

        final int num1 = 20;
        final int num2 = 12;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsEqualTo13() {

        final int num1 = 12;
        final int num2 = 13;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsEqualTo13() {

        final int num1 = 13;
        final int num2 = 13;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRangeAndNum2IsEqualTo13() {

        final int num1 = 15;
        final int num2 = 13;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsEqualTo13() {

        final int num1 = 19;
        final int num2 = 13;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsEqualTo13() {

        final int num1 = 20;
        final int num2 = 13;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsInRange() {

        final int num1 = 12;
        final int num2 = 15;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsInRange() {

        final int num1 = 13;
        final int num2 = 15;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRangeAndNum2IsInRange() {

        final int num1 = 15;
        final int num2 = 15;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsInRange() {

        final int num1 = 19;
        final int num2 = 15;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsInRange() {

        final int num1 = 20;
        final int num2 = 15;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsLessThan13AndNum2IsEqualTo19() {

        final int num1 = 12;
        final int num2 = 19;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsEqualTo13AndNum2IsEqualTo19() {

        final int num1 = 13;
        final int num2 = 19;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRangeAndNum2IsEqualTo19() {

        final int num1 = 15;
        final int num2 = 19;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInEqualTo19AndNum2IsEqualTo19() {

        final int num1 = 19;
        final int num2 = 19;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsGreaterThan19AndNum2IsEqualTo19() {

        final int num1 = 20;
        final int num2 = 19;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsLessThan13AndNum2IsGreaterThan19() {

        final int num1 = 12;
        final int num2 = 20;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsEqualTo13AndNum2IsGreaterThan19() {

        final int num1 = 13;
        final int num2 = 20;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRangeAndNum2IsGreaterThan19() {

        final int num1 = 15;
        final int num2 = 20;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInEqualTo19AndNum2IsGreaterThan19() {

        final int num1 = 19;
        final int num2 = 20;

        final boolean expected = true;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsGreaterThan19AndNum2IsGreaterThan19() {

        final int num1 = 20;
        final int num2 = 20;

        final boolean expected = false;

        final boolean actual = fixture.loneTeen(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
