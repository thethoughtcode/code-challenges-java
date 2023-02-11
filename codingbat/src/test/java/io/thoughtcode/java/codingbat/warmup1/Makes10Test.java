package io.thoughtcode.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Makes10Test {

    private Makes10 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Makes10();
    }

    @Test
    void shouldReturnTrueWhenFirstNumberIs10() {

        final boolean shouldMake10 = true;

        final int value1 = 10;
        final int value2 = 20;

        final boolean isMakes10 = fixture.makes10(value1, value2);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    void shouldReturnTrueWhenSecondNumberIs10() {

        final boolean shouldMake10 = true;

        final int value1 = 20;
        final int value2 = 10;

        final boolean isMakes10 = fixture.makes10(value1, value2);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    void shouldReturnTrueWhenSumIs10() {

        final boolean shouldMake10 = true;

        final int value1 = 7;
        final int value2 = 3;

        final boolean isMakes10 = fixture.makes10(value1, value2);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    void shouldReturnFalseWhenOtherwise() {

        final boolean shouldMake10 = false;

        final int value1 = 11;
        final int value2 = 9;

        final boolean isMakes10 = fixture.makes10(value1, value2);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }
}
