package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotStringTest {

    private NotString fixture;

    @BeforeEach
    void setUp() {
        fixture = new NotString();
    }

    @Test
    void shouldReturnStringWithNotPrefixWhenStringDoesntStartWithNot() {

        final String expected = "not candy";

        final String str = "candy";

        final String actual = fixture.notString(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringAsItIsWhenStringStartWithNot() {

        final String expected = "not bad";

        final String str = expected;

        final String actual = fixture.notString(str);

        assertThat(actual).isEqualTo(expected);
    }
}
