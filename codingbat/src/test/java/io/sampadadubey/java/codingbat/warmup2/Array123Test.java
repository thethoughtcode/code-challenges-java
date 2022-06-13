package io.sampadadubey.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Array123Test {

    private Array123 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Array123();
    }

    @Test
    void shouldReturnFalseWhenArrayIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayIsEmpty() {

        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsLessThan3() {

        final int[] nums1 = {1};
        final int[] nums2 = {1, 2};

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.array123(nums1);
        final boolean actual2 = fixture.array123(nums2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnTrueWhenArrayLengthIs3And123InSequence() {

        final int[] nums = {1, 2, 3};

        final boolean expected = true;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnFalseWhenArrayLengthIs3And123NotInSequence() {

        final int[] nums = {3, 1, 2};

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnFalseWhenArrayLengthIs3And123DoesntExist() {

        final int[] nums = {7, 8, 9};

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsGreaterThan3And123DoesntExist() {

        final int[] nums = {7, 8, 9, 1, 5};

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsGreaterThan3And123NotInSequence() {

        final int[] nums = {7, 8, 3, 1, 2};

        final boolean expected = false;

        final boolean actual = fixture.array123(nums);

        assertThat(actual).isEqualTo(expected);

    }

    @Test
    void shouldReturnTrueWhenArrayLengthIsGreaterThan3And123InSequence() {

        final int[] nums1 = {7, 8, 3, 1, 2, 3};
        final int[] nums2 = {1, 2, 3, 4, 5, 6};
        final int[] nums3 = {1, 2, 1, 2, 3, 4};
        final int[] nums4 = {1, 2, 1, 2, 3, 1, 2, 3, 4};

        final boolean expected1 = true;
        final boolean expected2 = true;
        final boolean expected3 = true;
        final boolean expected4 = true;

        final boolean actual1 = fixture.array123(nums1);
        final boolean actual2 = fixture.array123(nums2);
        final boolean actual3 = fixture.array123(nums3);
        final boolean actual4 = fixture.array123(nums4);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
    }
}
