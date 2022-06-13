package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringSplosionTest {

    private StringSplosion fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringSplosion();
    }

    @Test
    void scenario1() {

        final String str = "Code";

        final String expected = "CCoCodCode";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario2() {

        final String str = "abc";

        final String expected = "aababc";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario3() {

        final String str = "ab";

        final String expected = "aab";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;

        final String expected = EMPTY;

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = EMPTY;

        final String expected = EMPTY;

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }
}
