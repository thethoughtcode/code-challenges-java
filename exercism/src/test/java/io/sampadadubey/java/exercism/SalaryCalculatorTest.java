package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    SalaryCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new SalaryCalculator();
    }

    @Test
    void regularSalary() {
        assertThat(calculator.finalSalary(0, 0)).isEqualTo(1000.0);
    }

    @Test
    void skippedBelowThreshold() {
        assertThat(calculator.finalSalary(3, 0)).isEqualTo(1000.0);
    }

    @Test
    void skippedAboveThreshold() {
        assertThat(calculator.finalSalary(7, 0)).isEqualTo(850.0);
    }

    @Test
    void soldBelowThreshold() {
        assertThat(calculator.finalSalary(0, 10)).isEqualTo(1100.0);
    }

    @Test
    void soldAboveThreshold() {
        assertThat(calculator.finalSalary(0, 25)).isEqualTo(1325.0);
    }

    @Test
    void skippedBelowThresholdAndSoldBelowThreshold() {
        assertThat(calculator.finalSalary(2, 5)).isEqualTo(1050.0);
    }

    @Test
    void skippedBelowThresholdAndSoldAboveThreshold() {
        assertThat(calculator.finalSalary(4, 40)).isEqualTo(1520.0);
    }

    @Test
    void skippedAboveThresholdAndSoldBelowThreshold() {
        assertThat(calculator.finalSalary(10, 2)).isEqualTo(870.0);
    }

    @Test
    void skippedAboveThresholdAndSoldAboveThreshold() {
        assertThat(calculator.finalSalary(7, 50)).isEqualTo(1500.0);
    }

    @Test
    void salaryCanReachCloseToMaximum() {
        assertThat(calculator.finalSalary(0, 76)).isEqualTo(1988.0);
    }

    @Test
    void salaryRespectMaximum() {
        assertThat(calculator.finalSalary(0, 77)).isEqualTo(2000.0);
    }
}
