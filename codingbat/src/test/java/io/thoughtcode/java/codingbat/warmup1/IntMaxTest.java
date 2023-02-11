package io.thoughtcode.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntMaxTest {

    private IntMax fixture;

    @BeforeEach
    void setUp() {
        fixture = new IntMax();
    }

    @Test
    void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2IsGreaterThanNum3() {

        final int num1 = 10;
        final int num2 = 5;
        final int num3 = 1;

        final int expected = num1;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2IsLessThanNum3() {

        final int num1 = 10;
        final int num2 = 1;
        final int num3 = 5;

        final int expected = num1;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum1WhenNum1IsLargestAndNum2AndNum3AreEqual() {

        final int num1 = 10;
        final int num2 = 5;
        final int num3 = 5;

        final int expected = num1;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1IsGreaterThanNum3() {

        final int num1 = 5;
        final int num2 = 10;
        final int num3 = 1;

        final int expected = num2;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1IsLessThanNum3() {

        final int num1 = 1;
        final int num2 = 10;
        final int num3 = 5;

        final int expected = num2;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum2WhenNum2IsLargestAndNum1AndNum3AreEqual() {

        final int num1 = 5;
        final int num2 = 10;
        final int num3 = 5;

        final int expected = num2;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1IsGreaterThanNum2() {

        final int num1 = 5;
        final int num2 = 1;
        final int num3 = 10;

        final int expected = num3;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1IsLessThanNum2() {

        final int num1 = 5;
        final int num2 = 1;
        final int num3 = 10;

        final int expected = num3;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsNum3WhenNum3IsLargestAndNum1AndNum2AreEqual() {

        final int num1 = 5;
        final int num2 = 5;
        final int num3 = 10;

        final int expected = num3;

        final int actual = fixture.intMax(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
