package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Max1020Test {

    private Max1020 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Max1020();
    }

    @Test
    void shouldReturnMaxAs0WhenAIsLessThan10AndBIsLessThan10() {

        final int value1 = 9;
        final int value2 = 9;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo10() {

        final int value1 = 9;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan10() {

        final int value1 = 9;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo20() {

        final int value1 = 9;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan20() {

        final int value1 = 9;
        final int value2 = 21;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsLessThan10() {

        final int value1 = 10;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo10() {

        final int value1 = 10;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsGreaterThan10() {

        final int value1 = 10;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo20() {

        final int value1 = 10;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsGreaterThan20() {

        final int value1 = 10;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsLessThan10() {

        final int value1 = 19;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsEqualTo10() {

        final int value1 = 19;
        final int value2 = 10;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsGreaterThan10() {

        final int value1 = 19;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsEqualTo20() {

        final int value1 = 19;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsGreaterThan20() {

        final int value1 = 19;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsLessThan10() {

        final int value1 = 20;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsEqualTo10() {

        final int value1 = 20;
        final int value2 = 10;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsGreaterThan10() {

        final int value1 = 20;
        final int value2 = 19;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsEqualTo20() {

        final int value1 = 20;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsGreaterThan20() {

        final int value1 = 20;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsLessThan10() {

        final int value1 = 21;
        final int value2 = 9;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo10() {

        final int value1 = 21;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsGreaterThan10() {

        final int value1 = 21;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo20() {

        final int value1 = 21;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsGreaterThan20() {

        final int value1 = 21;
        final int value2 = 21;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }
}
