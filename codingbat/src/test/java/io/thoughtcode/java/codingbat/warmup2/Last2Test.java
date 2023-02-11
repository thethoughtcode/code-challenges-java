package io.thoughtcode.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Last2Test {

    private Last2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Last2();
    }

    @Test
    void scenario1() {

        final String str = "hixxhi";

        final int expected = 1;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario2() {

        final String str = "xaxxaxaxx";

        final int expected = 1;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario3() {

        final String str = "axxxaaxx";

        final int expected = 2;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0WhenStringIsNull() {

        final String str = null;

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0WhenStringIsEmpty() {

        final String str = "";

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0WhenStringIsSingleString() {

        final String str = "x";

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }
}
