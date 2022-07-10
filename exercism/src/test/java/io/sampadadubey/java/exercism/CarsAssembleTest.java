package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarsAssembleTest {

    private CarsAssemble carsAssemble;

    @BeforeEach
    void setUp() {
        carsAssemble = new CarsAssemble();
    }

    @Test
    void productionRatePerHourForSpeedZero() {
        assertThat(carsAssemble.productionRatePerHour(0)).isEqualTo(0.0);
    }

    @Test
    void productionRatePerHourForSpeedOne() {
        assertThat(carsAssemble.productionRatePerHour(1)).isEqualTo(221.0);
    }

    @Test
    void productionRatePerHourForSpeedFour() {
        assertThat(carsAssemble.productionRatePerHour(4)).isEqualTo(884.0);
    }

    @Test
    void productionRatePerHourForSpeedSeven() {
        assertThat(carsAssemble.productionRatePerHour(7)).isEqualTo(1392.3);
    }

    @Test
    void productionRatePerHourForSpeedNine() {
        assertThat(carsAssemble.productionRatePerHour(9)).isEqualTo(1591.2);
    }

    @Test
    void productionRatePerHourForSpeedTen() {
        assertThat(carsAssemble.productionRatePerHour(10)).isEqualTo(1701.7);
    }

    @Test
    void workingItemsPerMinuteForSpeedZero() {
        assertThat(carsAssemble.workingItemsPerMinute(0)).isEqualTo(0);
    }

    @Test
    void workingItemsPerMinuteForSpeedOne() {
        assertThat(carsAssemble.workingItemsPerMinute(1)).isEqualTo(3);
    }

    @Test
    void workingItemsPerMinuteForSpeedFive() {
        assertThat(carsAssemble.workingItemsPerMinute(5)).isEqualTo(16);
    }

    @Test
    void workingItemsPerMinuteForSpeedEight() {
        assertThat(carsAssemble.workingItemsPerMinute(8)).isEqualTo(26);
    }

    @Test
    void workingItemsPerMinuteForSpeedNine() {
        assertThat(carsAssemble.workingItemsPerMinute(9)).isEqualTo(26);
    }

    @Test
    void workingItemsPerMinuteForSpeedTen() {
        assertThat(carsAssemble.workingItemsPerMinute(10)).isEqualTo(28);
    }
}
