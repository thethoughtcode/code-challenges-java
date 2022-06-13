package io.sampadadubey.java.codingbat.warmup2;

import static io.sampadadubey.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.sampadadubey.java.common.NumberConstants;

class StringMatchTest {

    static final String INPUT_ABC = "abc";

    private StringMatch fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringMatch();
    }

    @Test
    void testcase1() {

        final String inputA = "xxcaazz";
        final String inputB = "xxbaaz";

        final int expectedCount = NumberConstants.THREE;

        final int actualCount = fixture.stringMatch(inputA, inputB);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    void testcase2() {

        final String inputA = INPUT_ABC;
        final String inputB = INPUT_ABC;

        final int expectedCount = NumberConstants.TWO;

        final int actualCount = fixture.stringMatch(inputA, inputB);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    void testcase3() {

        final String inputA = INPUT_ABC;
        final String inputB = "axc";

        final int expectedCount = 0;

        final int actualCount = fixture.stringMatch(inputA, inputB);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    void shouldReturnZeroWhenStringIsNull() {

        final String inputA1 = null;
        final String inputB1 = INPUT_ABC;

        final String inputA2 = INPUT_ABC;
        final String inputB2 = null;

        final String inputA3 = null;
        final String inputB3 = null;

        final int expectedCount = 0;

        final int actualCount1 = fixture.stringMatch(inputA1, inputB1);
        final int actualCount2 = fixture.stringMatch(inputA2, inputB2);
        final int actualCount3 = fixture.stringMatch(inputA3, inputB3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }

    @Test
    void shouldReturnZeroWhenStringIsEmpty() {

        final String inputA1 = EMPTY;
        final String inputB1 = INPUT_ABC;

        final String inputA2 = INPUT_ABC;
        final String inputB2 = EMPTY;

        final String inputA3 = EMPTY;
        final String inputB3 = EMPTY;

        final int expectedCount = 0;

        final int actualCount1 = fixture.stringMatch(inputA1, inputB1);
        final int actualCount2 = fixture.stringMatch(inputA2, inputB2);
        final int actualCount3 = fixture.stringMatch(inputA3, inputB3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }
}
