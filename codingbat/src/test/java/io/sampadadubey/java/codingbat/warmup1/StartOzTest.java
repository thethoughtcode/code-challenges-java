package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StartOzTest {

    private StartOz fixture;

    @BeforeEach
    void setUp() {
        fixture = new StartOz();
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameStringWhenStringIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyStringWhenStringIsMultiCharAndDoesntStartWithOZ() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringOWhenStringIsMultiCharAndStartWithOAndNoZAtSecondPlace() {

        final String str = "obvious";

        final String expected = "o";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringOWhenStringIsMultiCharAndDoesntStartWithOAndZAtSecondPlace() {

        final String str = "aztec";

        final String expected = "z";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringOWhenStringIsMultiCharAndStartWithOZ() {

        final String str = "oznic";

        final String expected = "oz";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }
}
