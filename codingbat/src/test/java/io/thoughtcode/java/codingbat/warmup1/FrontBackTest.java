package io.thoughtcode.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrontBackTest {

    private FrontBack fixture;

    @BeforeEach
    void setUp() {
        fixture = new FrontBack();
    }

    @Test
    void shouldReturnEmptyWhenStringIsEmpty() {

        final String str = "";
        final String expected = str;

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameStringWhenStringIsSingleChar() {

        final String str = "a";
        final String expected = str;

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontBackStringWhenStringMultiChar() {

        final String str = "code";
        final String expected = "eodc";

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }
}
