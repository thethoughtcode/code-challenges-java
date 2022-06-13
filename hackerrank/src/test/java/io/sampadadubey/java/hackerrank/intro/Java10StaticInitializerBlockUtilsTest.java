package io.sampadadubey.java.hackerrank.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Java10StaticInitializerBlockUtilsTest {

    @BeforeAll
    static void loadClass() {
        final String input = "1\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    void main_PrintsArea_WhenBreadthAndHeightArePositive() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Java10StaticInitializerBlockUtils.run();

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).isEqualTo("3");
    }
}
