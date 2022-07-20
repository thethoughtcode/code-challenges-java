package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AnnalynsInfiltrationTest {

    private final AnnalynsInfiltration fixture = new AnnalynsInfiltration();

    @Test
    void cannot_execute_fast_attack_if_knight_is_awake() {
        final boolean knightIsAwake = true;
        assertThat(fixture.canFastAttack(knightIsAwake)).isFalse();
    }

    @Test
    void can_execute_fast_attack_if_knight_is_sleeping() {
        final boolean knightIsAwake = false;
        assertThat(fixture.canFastAttack(knightIsAwake)).isTrue();
    }

    @Test
    void cannot_spy_if_everyone_is_sleeping() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isFalse();
    }

    @Test
    void can_spy_if_everyone_but_knight_is_sleeping() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_everyone_but_archer_is_sleeping() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_everyone_but_prisoner_is_sleeping() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_only_knight_is_sleeping() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_only_archer_is_sleeping() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_only_prisoner_is_sleeping() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_spy_if_everyone_is_awake() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void can_signal_prisoner_if_archer_is_sleeping_and_prisoner_is_awake() {
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isTrue();
    }

    @Test
    void cannot_signal_prisoner_if_archer_is_awake_and_prisoner_is_sleeping() {
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
    }

    @Test
    void cannot_signal_prisoner_if_archer_and_prisoner_are_both_sleeping() {
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        assertThat(fixture.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
    }

    @Test
    void cannot_signal_prisoner_if_archer_and_prisoner_are_both_awake() {
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        assertThat(fixture.canSignalPrisoner(archerIsAwake, prisonerIsAwake)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_present() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_absent() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void can_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_present() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isTrue();
    }

    @Test
    void cannot_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_absent() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_present() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isTrue();
    }

    @Test
    void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_absent() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isTrue();
    }

    @Test
    void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_present() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_absent() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void can_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_present() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isTrue();
    }

    @Test
    void cannot_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_absent() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_present() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_absent() {
        final boolean knightIsAwake = false;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void can_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_present() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isTrue();
    }

    @Test
    void cannot_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_absent() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = false;
        final boolean prisonerIsAwake = true;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_present() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = true;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }

    @Test
    void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_absent() {
        final boolean knightIsAwake = true;
        final boolean archerIsAwake = true;
        final boolean prisonerIsAwake = false;
        final boolean petDogIsPresent = false;
        assertThat(fixture.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent)).isFalse();
    }
}
