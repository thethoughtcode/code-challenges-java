package io.thoughtcode.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Java08DataTypesTest {

    private ByteArrayOutputStream output;

    private final Java08DataTypes fixture = new Java08DataTypes();

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void defaultCase() {

        final String input = "5\n-150\n150000\n1500000000\n213333333333333333333333333333333333\n-100000000000000";

        final String expected = "-150 can be fitted in:\n* short\n* int\n* long\n"
                              + "150000 can be fitted in:\n* int\n* long\n"
                              + "1500000000 can be fitted in:\n* int\n* long\n"
                              + "213333333333333333333333333333333333 can't be fitted anywhere.\n"
                              + "-100000000000000 can be fitted in:\n* long\n";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkType_PrintFitTypeByteShortIntegerLong_WhenValueIsByte() {

        final String input = "1";

        final String expected = "1 can be fitted in:\n* byte\n* short\n* int\n* long\n";

        fixture.checkType(input);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkType_PrintFitTypeShortIntegerLong_WhenValueIsShort() {

        final String input = "1000";

        final String expected = "1000 can be fitted in:\n* short\n* int\n* long\n";

        fixture.checkType(input);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkType_PrintFitTypeIntegerLong_WhenValueIsInteger() {

        final String input = "100000";

        final String expected = "100000 can be fitted in:\n* int\n* long\n";

        fixture.checkType(input);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkType_PrintFitTypeLong_WhenValueIsLong() {

        final String input = "10000000000";

        final String expected = "10000000000 can be fitted in:\n* long\n";

        fixture.checkType(input);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void checkType_PrintFitTypeNone_WhenValueCannotFitByteShortIntegerLong() {

        final String input = "1000000000000000000000000";

        final String expected = "1000000000000000000000000 can't be fitted anywhere.\n";

        fixture.checkType(input);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}
