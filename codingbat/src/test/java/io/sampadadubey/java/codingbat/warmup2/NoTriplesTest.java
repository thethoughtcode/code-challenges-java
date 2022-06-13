package io.sampadadubey.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NoTriplesTest {

    private NoTriples fixture;

    @BeforeEach
    void setUp() {
        fixture = new NoTriples();
    }

    @Test
    void testcase1() {

        final int[] nums = {1, 1, 2, 2, 1};

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final int[] nums = {1, 1, 2, 2, 2, 1};

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final int[] nums = {1, 1, 1, 2, 2, 2, 1};

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumIsNull() {

        final int[] nums = null;

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumIsEmpty() {

        final int[] nums = {};

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumsHasLessThan3Elements() {

        final int[] nums = {1, 1};

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumsHas3Elements() {

        final int[] nums = {1, 1, 1};

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
