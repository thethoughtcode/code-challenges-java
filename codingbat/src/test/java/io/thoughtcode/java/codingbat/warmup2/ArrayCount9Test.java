package io.thoughtcode.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayCount9Test {

    private ArrayCount9 fixture;

    @BeforeEach
    void setUp() {
        fixture = new ArrayCount9();
    }

    @Test
    void shouldReturnZeroWhenArrayIsNull() {

        final int[] nums = null;

        final int expectedCount = 0;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnZeroWhenArrayIsEmpty() {

        final int[] nums = {};

        final int expectedCount = 0;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnZeroWhenArrayHasNo9() {

        final int[] nums = {1, 2, 3, 4, 5};

        final int expectedCount = 0;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnOneWhenArrayHasOnlyOne9Front() {

        final int[] nums = {9, 2, 3, 4, 5};

        final int expectedCount = 1;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnOneWhenArrayHasOnlyOne9Mid() {

        final int[] nums = {1, 2, 9, 4, 5};

        final int expectedCount = 1;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnOneWhenArrayHasOnlyOne9End() {

        final int[] nums = {1, 2, 4, 9};

        final int expectedCount = 1;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnCorrectCountWhenArrayHasMultiple() {

        final int[] nums = {1, 2, 9, 9, 6, 7, 8, 3, 9, 2};

        final int expectedCount = 3;

        final int actualCount = fixture.arrayCount9(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }
}
