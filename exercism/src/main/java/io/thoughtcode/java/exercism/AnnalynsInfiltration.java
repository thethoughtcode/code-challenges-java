package io.thoughtcode.java.exercism;

public class AnnalynsInfiltration {

    boolean canFastAttack(final boolean knightIsAwake) {
        return !knightIsAwake;
    }

    boolean canSpy(final boolean knightIsAwake, final boolean archerIsAwake,
            final boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    boolean canSignalPrisoner(final boolean archerIsAwake, final boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    boolean canFreePrisoner(final boolean knightIsAwake, final boolean archerIsAwake,
            final boolean prisonerIsAwake, final boolean petDogIsPresent) {

        boolean result;

        if (petDogIsPresent) {
            result = !archerIsAwake;
        } else {
            result = prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }

        return result;
    }
}
