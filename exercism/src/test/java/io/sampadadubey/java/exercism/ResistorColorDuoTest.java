package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;

    @BeforeEach
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }

    @Test
    public void testBrownAndBlack() {
        final String[] colors = new String[] { "brown", "black" };
        final int expected = 10;
        assertThat(resistorColorDuo.value(colors)).isEqualTo(expected);
    }

    @Test
    public void testBlueAndGrey() {
        final String[] colors = new String[] { "blue", "grey" };
        final int expected = 68;
        assertThat(resistorColorDuo.value(colors)).isEqualTo(expected);
    }

    @Test
    public void testYellowAndViolet() {
        final String[] colors = new String[] { "yellow", "violet" };
        final int expected = 47;
        assertThat(resistorColorDuo.value(colors)).isEqualTo(expected);
    }

    @Test
    public void testOrangeAndOrange() {
        final String[] colors = new String[] { "orange", "orange" };
        final int expected = 33;
        assertThat(resistorColorDuo.value(colors)).isEqualTo(expected);
    }

    @Test
    public void testIgnoreAdditionalColors() {
        final String[] colors = new String[] { "green", "brown", "orange" };
        final int expected = 51;
        assertThat(resistorColorDuo.value(colors)).isEqualTo(expected);
    }
}
