package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissingCharTest {

    static final String KITTEN = "kitten";

    private MissingChar fixture;

    @BeforeEach
    void setUp() {
        fixture = new MissingChar();
    }

    @Test
    void shouldReturnStringWithMissingCharAtStart() {

        final String str = KITTEN;
        final int index = 0;
        final String expected = "itten";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringWithMissingCharAtEnd() {

        final String str = KITTEN;
        final int index = 5;
        final String expected = "kitte";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringWithMissingCharAtMid() {

        final String str = KITTEN;
        final int index = 1;
        final String expected = "ktten";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }
}
