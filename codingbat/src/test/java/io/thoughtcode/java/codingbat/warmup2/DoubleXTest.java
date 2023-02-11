package io.thoughtcode.java.codingbat.warmup2;

import static io.thoughtcode.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoubleXTest {

    private DoubleX fixture;

    @BeforeEach
    void setUp() {
        fixture = new DoubleX();
    }

    @Test
    void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInFront() {

        final String str = "xxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInEnd() {

        final String str = "axx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInMiddle() {

        final String str = "axxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNoXExists() {

        final String str = "abcdef";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenXExistsAlone() {

        final String str = "axcxefx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstXIsAlone() {

        final String str = "xcxx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenAllX() {

        final String str = "xxx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenSingleX() {

        final String str = "x";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenTwoX() {

        final String str = "xx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenEmpty() {

        final String str = EMPTY;

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
