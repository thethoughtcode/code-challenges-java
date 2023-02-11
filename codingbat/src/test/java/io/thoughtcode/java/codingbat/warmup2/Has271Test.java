package io.thoughtcode.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Has271Test {

    private Has271 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Has271();
    }

    @Test
    void testcase1() {

        final int[] nums = {1, 2, 7, 1};

        final boolean expected = true;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final int[] nums = {1, 2, 8, 1};

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final int[] nums = {2, 7, 1};

        final boolean expected = true;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase4() {

        final int[] nums = {1, 2, 7, 5};

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayIsEmpty() {

        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsLessThanEqualTo2() {

        final int[] nums1 = {1};
        final int[] nums2 = {1, 2};

        final boolean expected = false;

        final boolean actual1 = fixture.has271(nums1);
        final boolean actual2 = fixture.has271(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
