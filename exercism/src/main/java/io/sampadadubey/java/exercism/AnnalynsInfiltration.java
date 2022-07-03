package io.sampadadubey.java.exercism;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(final boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(final boolean knightIsAwake, final boolean archerIsAwake,
            final boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(final boolean archerIsAwake, final boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(final boolean knightIsAwake, final boolean archerIsAwake,
            final boolean prisonerIsAwake, final boolean petDogIsPresent) {

        boolean result = false;

        if (petDogIsPresent) {
            result = !archerIsAwake;
        } else {
            result = prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }

        return result;
    }
}
