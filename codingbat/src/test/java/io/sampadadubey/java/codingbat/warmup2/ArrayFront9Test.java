package io.sampadadubey.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayFront9Test {

    private ArrayFront9 fixture;

    @BeforeEach
    void setUp() {
        fixture = new ArrayFront9();
    }

    @Test
    void shouldReturnFalseWhenArrayIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.arrayFront9(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayIsEmpty() {

        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.arrayFront9(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsLessThanEqualTo4AndHasNo9() {

        final int[] nums1 = {1};
        final int[] nums2 = {1, 2};
        final int[] nums3 = {1, 2, 3};
        final int[] nums4 = {1, 2, 3, 4};

        final boolean expected1 = false;
        final boolean expected2 = false;
        final boolean expected3 = false;
        final boolean expected4 = false;

        final boolean actual1 = fixture.arrayFront9(nums1);
        final boolean actual2 = fixture.arrayFront9(nums2);
        final boolean actual3 = fixture.arrayFront9(nums3);
        final boolean actual4 = fixture.arrayFront9(nums4);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
    }

    @Test
    void shouldReturnTrueWhenArrayLengthIsLessThanEqualTo4AndA9() {

        final int[] nums1 = {9};
        final int[] nums2 = {1, 9};
        final int[] nums3 = {1, 9, 3};
        final int[] nums4 = {1, 9, 3, 4};

        final boolean expected1 = true;
        final boolean expected2 = true;
        final boolean expected3 = true;
        final boolean expected4 = true;

        final boolean actual1 = fixture.arrayFront9(nums1);
        final boolean actual2 = fixture.arrayFront9(nums2);
        final boolean actual3 = fixture.arrayFront9(nums3);
        final boolean actual4 = fixture.arrayFront9(nums4);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsGreaterThan5AndNo9() {

        final int[] nums1 = {1, 2, 3, 4, 5};
        final int[] nums2 = {1, 2, 3, 4, 5, 6};

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.arrayFront9(nums1);
        final boolean actual2 = fixture.arrayFront9(nums2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnFalseWhenArrayLengthIsGreaterThan5AndHas9AfterPosition4() {

        final int[] nums1 = {1, 2, 3, 4, 9};
        final int[] nums2 = {1, 2, 3, 4, 9, 6};

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.arrayFront9(nums1);
        final boolean actual2 = fixture.arrayFront9(nums2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnTrueWhenArrayLengthIsGreaterThan5AndHas9BeforePosition4() {

        final int[] nums1 = {9, 2, 3, 4, 5};
        final int[] nums2 = {1, 9, 3, 4, 5, 6};
        final int[] nums3 = {1, 2, 9, 4, 5, 6};
        final int[] nums4 = {1, 2, 3, 9, 5, 6};
        final int[] nums5 = {9, 2, 3, 4, 5, 9};
        final int[] nums6 = {1, 2, 9, 4, 5, 9};
        final int[] nums7 = {1, 2, 3, 9, 5, 9};

        final boolean expected1 = true;
        final boolean expected2 = true;
        final boolean expected3 = true;
        final boolean expected4 = true;
        final boolean expected5 = true;
        final boolean expected6 = true;
        final boolean expected7 = true;

        final boolean actual1 = fixture.arrayFront9(nums1);
        final boolean actual2 = fixture.arrayFront9(nums2);
        final boolean actual3 = fixture.arrayFront9(nums3);
        final boolean actual4 = fixture.arrayFront9(nums4);
        final boolean actual5 = fixture.arrayFront9(nums5);
        final boolean actual6 = fixture.arrayFront9(nums6);
        final boolean actual7 = fixture.arrayFront9(nums7);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
        assertThat(actual5).isEqualTo(expected5);
        assertThat(actual6).isEqualTo(expected6);
        assertThat(actual7).isEqualTo(expected7);
    }
}
