package io.sampadadubey.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Array667Test {

    private Array667 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Array667();
    }

    @Test
    void testcase1() {

        final int[] nums = {6, 6, 2};

        final int expectedCount = 1;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void testcase2() {

        final int[] nums = {6, 6, 2, 6};

        final int expectedCount = 1;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void testcase3() {

        final int[] nums = {6, 7, 2, 6};

        final int expectedCount = 1;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void testcase4() {

        final int[] nums = {6, 7, 2, 6, 7};

        final int expectedCount = 2;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void testcase5() {

        final int[] nums = {6, 7, 6, 6, 7};

        final int expectedCount = 3;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsNull() {

        final int[] nums = null;

        final int expectedCount = 0;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsEmpty() {

        final int[] nums = {};

        final int expectedCount = 0;

        final int actualCount = fixture.array667(nums);

        assertThat(actualCount).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsSingleElement() {

        final int[] nums1 = {1};
        final int[] nums2 = {6};
        final int[] nums3 = {7};

        final int expectedCount = 0;

        final int actualCount1 = fixture.array667(nums1);
        final int actualCount2 = fixture.array667(nums2);
        final int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsDoubleElementAndNotMatching() {

        final int[] nums1 = {1, 2};
        final int[] nums2 = {6, 5};
        final int[] nums3 = {6, 8};
        final int[] nums4 = {7, 6};
        final int[] nums5 = {7, 7};

        final int expectedCount = 0;

        final int actualCount1 = fixture.array667(nums1);
        final int actualCount2 = fixture.array667(nums2);
        final int actualCount3 = fixture.array667(nums3);
        final int actualCount4 = fixture.array667(nums4);
        final int actualCount5 = fixture.array667(nums5);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
        assertThat(actualCount4).isEqualTo(expectedCount);
        assertThat(actualCount5).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsDoubleElementAndMatching() {

        final int[] nums1 = {6, 6};
        final int[] nums2 = {6, 7};

        final int expectedCount = 1;

        final int actualCount1 = fixture.array667(nums1);
        final int actualCount2 = fixture.array667(nums2);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsMultiElementAndNotMatching() {

        final int[] nums1 = {6, 5, 4};
        final int[] nums2 = {6, 5, 7, 6};
        final int[] nums3 = {6, 8, 7, 6, 8};

        final int expectedCount = 0;

        final int actualCount1 = fixture.array667(nums1);
        final int actualCount2 = fixture.array667(nums2);
        final int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturn0WhenArrayIsMultiElementAndMatching() {

        final int[] nums1 = {6, 6, 4};
        final int[] nums2 = {6, 7, 6, 6, 5};
        final int[] nums3 = {6, 6, 6, 7};

        final int expectedCount1 = 1;
        final int expectedCount2 = 2;
        final int expectedCount3 = 3;

        final int actualCount1 = fixture.array667(nums1);
        final int actualCount2 = fixture.array667(nums2);
        final int actualCount3 = fixture.array667(nums3);

        assertThat(actualCount1).isEqualTo(expectedCount1);
        assertThat(actualCount2).isEqualTo(expectedCount2);
        assertThat(actualCount3).isEqualTo(expectedCount3);
    }
}
