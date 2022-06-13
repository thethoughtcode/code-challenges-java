package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringETest {

    private StringE fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringE();
    }

    @Test
    void shouldReturnFalseWhenStringIsEmpty() {

        final String str = "";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenStringIsNotEmptyAndHasZeroE() {

        final String str = "a";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenStringIsNotEmptyAndHasOneE() {

        final String str = "ae";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenStringIsNotEmptyAndHasTwoE() {

        final String str = "aee";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenStringIsNotEmptyAndHasThreeE() {

        final String str = "aebece";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenStringIsNotEmptyAndHasFourE() {

        final String str = "aebecede";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }
}
