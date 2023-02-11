package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResistorColorTest {

    private ResistorColor resistorColor;

    @BeforeEach
    void setup() {
        resistorColor = new ResistorColor();
    }

    @Test
    void testBlackColorCode() {
        assertThat(resistorColor.colorCode("black")).isEqualTo(0);
    }

    @Test
    void testWhiteColorCode() {
        assertThat(resistorColor.colorCode("white")).isEqualTo(9);
    }

    @Test
    void testOrangeColorCode() {
        assertThat(resistorColor.colorCode("orange")).isEqualTo(3);
    }

    @Test
    void testColors() {
        assertThat(resistorColor.colors()).containsExactly(
                "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");
    }
}
