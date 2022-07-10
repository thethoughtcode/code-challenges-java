package io.sampadadubey.java.exercism;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarsAssemble {

    static final int CARS_PER_HOUR = 221;

    static final int MINUTES_PER_HOUR = 60;

    public double productionRatePerHour(final int speed) {
        final BigDecimal totalCars = BigDecimal.valueOf(CARS_PER_HOUR * speed);
        return BigDecimal.valueOf(getSuccessRate(speed)).multiply(totalCars).doubleValue();
    }

    public int workingItemsPerMinute(final int speed) {
        final BigDecimal workingItemsPerHour = BigDecimal.valueOf(productionRatePerHour(speed));
        return workingItemsPerHour.divide(BigDecimal.valueOf(MINUTES_PER_HOUR), RoundingMode.FLOOR).intValue();
    }

    private double getSuccessRate(final int speed) {

        final double successRate;

        if (speed <= 0) {
            successRate = 0.0;
        } else if (speed <= 4) {
            successRate = 1.0;
        } else if (speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }

        return successRate;
    }
}
