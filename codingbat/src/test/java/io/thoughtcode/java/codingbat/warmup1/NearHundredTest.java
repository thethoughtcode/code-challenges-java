package io.thoughtcode.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NearHundredTest {

    private NearHundred fixture;

    @BeforeEach
    void setUp() {
        fixture = new NearHundred();
    }

    @Test
    void shouldReturnTrueWhenNear100Lower() {

        final boolean expected = true;

        final int number = 90;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNear100Upper() {

        final boolean expected = true;

        final int number = 110;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNear100Mid() {

        final boolean expected = true;

        final int number = 100;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNear200Lower() {

        final boolean expected = true;

        final int number = 190;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNear200Upper() {

        final boolean expected = true;

        final int number = 210;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNear200Mid() {

        final boolean expected = true;

        final int number = 200;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNotNear100Lower() {

        final boolean expected = false;

        final int number = 89;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNotNear100Upper() {

        final boolean expected = false;

        final int number = 111;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNotNear200Lower() {

        final boolean expected = false;

        final int number = 189;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNotNear200Upper() {

        final boolean expected = false;

        final int number = 211;

        final boolean actual = fixture.nearHundred(number);

        assertThat(actual).isEqualTo(expected);
    }
}
