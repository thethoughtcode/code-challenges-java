package io.sampadadubey.java.exercism;

public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(final int actualMinutesInOver) {
        return expectedMinutesInOven() - actualMinutesInOver;
    }

    public int preparationTimeInMinutes(final int layersCount) {
        return layersCount * 2;
    }

    public int totalTimeInMinutes(final int layersCount, final int actualMinutesInOver) {
        return preparationTimeInMinutes(layersCount) + actualMinutesInOver;
    }
}
