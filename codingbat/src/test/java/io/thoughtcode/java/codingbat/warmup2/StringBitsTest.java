package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringBitsTest {

    private StringBits fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringBits();
    }

    @Test
    void testScenario1() {

        final String str = "Hello";

        final String expected = "Hlo";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testScenario2() {

        final String str = "Hi";

        final String expected = "H";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testScenario3() {

        final String str = "Heeololeo";

        final String expected = "Hello";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBlankStringWhenStringIsEmpty() {

        final String str = EMPTY;

        final String expected = EMPTY;

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBlankStringWhenStringIsNull() {

        final String str = null;

        final String expected = EMPTY;

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }
}
