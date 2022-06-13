package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SleepInTest {

    private SleepIn fixture;

    @BeforeEach
    void setUp() {
        fixture = new SleepIn();
    }

    @Test
    void shouldNotSleepIfWeekdayAndNotVacation() {

        final boolean shouldSleep = false;

        final boolean isWeekday = true;
        final boolean isVacation = false;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    void shouldSleepIfNotWeekdayAndNotVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = false;
        final boolean isVacation = false;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    void shouldSleepIfNotWeekdayAndVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = false;
        final boolean isVacation = true;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    void shouldSleepIfWeekdayAndVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = true;
        final boolean isVacation = true;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }
}
