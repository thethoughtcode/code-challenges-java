package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonkeyTroubleTest {

    private MonkeyTrouble fixture;

    @BeforeEach
    void setUp() {
        fixture = new MonkeyTrouble();
    }

    @Test
    void shouldBeInTroubleIfBothAreSmiling() {

        final boolean shouldBeInTrouble = true;

        final boolean monkeyASmiling = true;
        final boolean monkeyBSmiling = true;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    void shouldBeInTroubleIfBothAreNotSmiling() {

        final boolean shouldBeInTrouble = true;

        final boolean monkeyASmiling = false;
        final boolean monkeyBSmiling = false;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    void shouldNotBeInTroubleIfASmilingAndBNotSmiling() {

        final boolean shouldBeInTrouble = false;

        final boolean monkeyASmiling = true;
        final boolean monkeyBSmiling = false;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    void shouldNotBeInTroubleIfANotSmilingAndASmiling() {

        final boolean shouldBeInTrouble = false;

        final boolean monkeyASmiling = false;
        final boolean monkeyBSmiling = true;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }
}
