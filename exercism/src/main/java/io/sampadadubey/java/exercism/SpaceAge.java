package io.sampadadubey.java.exercism;

class SpaceAge {

    static final double EARTH_YEAR_IN_SECONDS = 31557600.0;

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

    MERCURY(0.2408467),

    VENUS(0.61519726),

    EARTH(1.0),

    MARS(1.8808158),

    JUPITER(11.862615),

    SATURN(29.447498),

    URANUS(84.016846),

    NEPTURE(164.79132),
    ;

    private final double yearConversion;

    private Planet(final double yearConversion) {
        this.yearConversion = yearConversion;
    }

    public double getYearConversion() {
        return yearConversion;
    }
}
