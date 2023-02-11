package io.thoughtcode.java.exercism;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CarsAssemble {

    static final double CARS_PER_HOUR = 221.0;

    static final double MINUTES_PER_HOUR = 60.0;

    static final double SPEED_ZERO = 0;

    static final double SPEED_FOUR = 4;

    static final double SPEED_EIGHT = 8;

    static final double SPEED_NINE = 9;

    static final double SUCCESS_RATE_ZERO = 0.0;

    static final double SUCCESS_RATE_HUNDRED = 1.0;

    static final double SUCCESS_RATE_EIGHTY = 0.8;

    static final double SUCCESS_RATE_NINETY = 0.9;

    static final double SUCCESS_RATE_DEFAULT = 0.77;

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

        if (speed <= SPEED_ZERO) {
            successRate = SUCCESS_RATE_ZERO;
        } else if (speed <= SPEED_FOUR) {
            successRate = SUCCESS_RATE_HUNDRED;
        } else if (speed <= SPEED_EIGHT) {
            successRate = SUCCESS_RATE_NINETY;
        } else if (speed == SPEED_NINE) {
            successRate = SUCCESS_RATE_EIGHTY;
        } else {
            successRate = SUCCESS_RATE_DEFAULT;
        }

        return successRate;
    }
}
