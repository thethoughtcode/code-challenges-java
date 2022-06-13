package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Front3Test {

    private Front3 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Front3();
    }

    @Test
    void shouldReturnCorrectStringWhenStringLengthIsLessThan3() {

        final String expected = "aaa";
        final String str = "a";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectStringWhenStringLengthIsGreaterThan3() {

        final String expected = "ChoChoCho";
        final String str = "Chocolate";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectStringWhenStringLengthIsEqualTo3() {

        final String expected = "JavJavJav";
        final String str = "Jav";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectStringWhenStringIsBlank() {

        final String expected = "";
        final String str = "";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }
}
