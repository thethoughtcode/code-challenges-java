package io.sampadadubey.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParrotTroubleTest {

    private ParrotTrouble fixture;

    @BeforeEach
    void setUp() {
        fixture = new ParrotTrouble();
    }

    @Test
    void shouldBeTroubleWhenParrotTalkingBefore7() {

        final boolean shouldBeInTrouble = true;

        final boolean isParrotTalking = true;
        final int hour = 6;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldBeTroubleWhenParrotTalkingAfter20() {

        final boolean shouldBeInTrouble = true;

        final boolean isParrotTalking = true;
        final int hour = 21;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldNotBeTroubleWhenParrotTalkingAt7() {

        final boolean shouldBeInTrouble = false;

        final boolean isParrotTalking = true;
        final int hour = 7;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldNotBeTroubleWhenParrotTalkingAfter7Before20() {

        final boolean shouldBeInTrouble = false;

        final boolean isParrotTalking = true;
        final int hour = 8;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldNotBeTroubleWhenParrotTalkingAt20() {

        final boolean shouldBeInTrouble = false;

        final boolean isParrotTalking = true;
        final int hour = 19;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldNotBeTroubleWhenParrotNotTalkingAfter20() {

        final boolean shouldBeInTrouble = false;

        final boolean isParrotTalking = false;
        final int hour = 21;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }

    @Test
    void shouldNotBeTroubleWhenParrotNotTalkingBefore7() {

        final boolean shouldBeInTrouble = false;

        final boolean isParrotTalking = false;
        final int hour = 6;

        final boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble).isEqualTo(shouldBeInTrouble);
    }
}
