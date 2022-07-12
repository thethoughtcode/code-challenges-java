package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoFerTest {

    private TwoFer twofer;

    @BeforeEach
    void setup() {
        twofer = new TwoFer();
    }

    @Test
    void noNameGiven() {
        assertThat(twofer.twofer(null))
                .isEqualTo("One for you, one for me.");
    }

    @Test
    void aNameGiven() {
        assertThat(twofer.twofer("Alice"))
                .isEqualTo("One for Alice, one for me.");
    }

    @Test
    void anotherNameGiven() {
        assertThat(twofer.twofer("Bob"))
                .isEqualTo("One for Bob, one for me.");
    }
}
