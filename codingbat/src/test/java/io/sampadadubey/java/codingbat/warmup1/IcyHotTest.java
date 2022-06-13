package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IcyHotTest {

    private IcyHot fixture;

    @BeforeEach
    void setUp() {
        fixture = new IcyHot();
    }

    @Test
    void shouldReturnTrueWhenFirstIsLessThanZeroAndSecondIsGreaterThan100() {

        final int temp1 = -1;
        final int temp2 = 101;

        final boolean expected = true;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsLessThanZeroAndSecondIsLessThan100() {

        final int temp1 = -1;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsLessThanZeroAndSecondIsEqualTo100() {

        final int temp1 = -1;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsGreaterThan100() {

        final int temp1 = 0;
        final int temp2 = 101;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsLessThan100() {

        final int temp1 = 0;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsEqualToZeroAndSecondIsEqualTo100() {

        final int temp1 = 0;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsLessThan100() {

        final int temp1 = 0;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsEqualTo100() {

        final int temp1 = 0;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstIsGreaterThanZeroAndSecondIsGreaterThan100() {

        final int temp1 = 1;
        final int temp2 = 101;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenSecondIsLessThan0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = -1;

        final boolean expected = true;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsLessThan0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = -1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsLessThan0AndFirstIsLessThan100() {

        final int temp1 = 99;
        final int temp2 = -1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsEqualTo0AndFirstIsLessThan100() {

        final int temp1 = 99;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSecondIsGreaterThan0AndFirstIsLessThan100() {
        final int temp1 = 99;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }
}
