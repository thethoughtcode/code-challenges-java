package io.thoughtcode.java.exercism;

class SpaceAge {

    static final double EARTH_YEAR_IN_SECONDS = 31_557_600.0;

    private final double seconds;

    SpaceAge(final double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return (seconds / EARTH_YEAR_IN_SECONDS) * Planet.EARTH.getYearConversion();
    }

    double onMercury() {
        return getAgeOnPlanet(Planet.MERCURY);
    }

    double onVenus() {
        return getAgeOnPlanet(Planet.VENUS);
    }

    double onMars() {
        return getAgeOnPlanet(Planet.MARS);
    }

    double onJupiter() {
        return getAgeOnPlanet(Planet.JUPITER);
    }

    double onSaturn() {
        return getAgeOnPlanet(Planet.SATURN);
    }

    double onUranus() {
        return getAgeOnPlanet(Planet.URANUS);
    }

    double onNeptune() {
        return getAgeOnPlanet(Planet.NEPTURE);
    }

    private double getAgeOnPlanet(final Planet planet) {
        return onEarth() / planet.getYearConversion();
    }
}

enum Planet {

    MERCURY(0.240_846_7),

    VENUS(0.615_197_26),

    EARTH(1.0),

    MARS(1.880_815_8),

    JUPITER(11.862_615),

    SATURN(29.447_498),

    URANUS(84.016_846),

    NEPTURE(164.791_32),
    ;

    private final double yearConversion;

    Planet(final double yearConversion) {
        this.yearConversion = yearConversion;
    }

    public double getYearConversion() {
        return yearConversion;
    }
}
