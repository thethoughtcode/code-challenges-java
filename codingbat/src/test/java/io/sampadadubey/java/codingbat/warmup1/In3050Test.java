package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class In3050Test {

    private In3050 fixture;

    @BeforeEach
    void setUp() {
        fixture = new In3050();
    }

    @Test
    void shouldReturnFalseWhenNum1IsNotInRange3040LowerAndNum2IsNotInRange3040Lower() {

        final int num1 = 29;
        final int num2 = 29;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRange3040LowerAndNum2IsNotInRange3040Lower() {

        final int num1 = 30;
        final int num2 = 29;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Lower() {

        final int num1 = 30;
        final int num2 = 30;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Mid() {

        final int num1 = 30;
        final int num2 = 35;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRange3040LowerAndNum2IsInRange3040Upper() {

        final int num1 = 30;
        final int num2 = 40;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRange3040LowerAndNum2IsNotInRange3040Upper() {

        final int num1 = 30;
        final int num2 = 41;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum2IsInRange3040LowerAndNum1IsNotInRange3040Lower() {

        final int num1 = 29;
        final int num2 = 30;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Lower() {

        final int num1 = 30;
        final int num2 = 30;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Mid() {

        final int num1 = 30;
        final int num2 = 35;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange3040LowerAndNum1IsInRange3040Upper() {

        final int num1 = 40;
        final int num2 = 30;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum2IsInRange3040LowerAndNum2IsNotInRange3040Upper() {

        final int num1 = 41;
        final int num2 = 30;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRange4050LowerAndNum2IsInRange4050Lower() {

        final int num1 = 40;
        final int num2 = 40;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum1IsInRange4050LowerAndNum2IsInRange4050Mid() {

        final int num1 = 40;
        final int num2 = 45;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFWhenNum1IsInRange4050LowerAndNum2IsInRange4050Upper() {

        final int num1 = 40;
        final int num2 = 50;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum1IsInRange4050LowerAndNum2IsNotInRange4050Upper() {

        final int num1 = 40;
        final int num2 = 51;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Lower() {

        final int num1 = 40;
        final int num2 = 40;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Mid() {

        final int num1 = 40;
        final int num2 = 45;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNum2IsInRange4050LowerAndNum1IsInRange4050Upper() {

        final int num1 = 50;
        final int num2 = 40;

        final boolean expected = true;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum2IsInRange4050LowerAndNum2IsNotInRange4050Upper() {

        final int num1 = 51;
        final int num2 = 40;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNum2IsNotInRange4050LowerAndNum2IsNotInRange4050Upper() {

        final int num1 = 51;
        final int num2 = 51;

        final boolean expected = false;

        final boolean actual = fixture.in3050(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
