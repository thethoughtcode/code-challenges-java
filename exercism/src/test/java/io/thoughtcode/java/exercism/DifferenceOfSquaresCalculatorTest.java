package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DifferenceOfSquaresCalculatorTest {

    private DifferenceOfSquaresCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DifferenceOfSquaresCalculator();
    }

    @Test
    void testSquareOfSumUpToOne() {
        final int expected = 1;
        final int actual = calculator.computeSquareOfSumTo(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSquareOfSumUpToFive() {
        final int expected = 225;
        final int actual = calculator.computeSquareOfSumTo(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSquareOfSumUpToHundred() {
        final int expected = 25502500;
        final int actual = calculator.computeSquareOfSumTo(100);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSumOfSquaresUpToOne() {
        final int expected = 1;
        final int actual = calculator.computeSumOfSquaresTo(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSumOfSquaresUpToFive() {
        final int expected = 55;
        final int actual = calculator.computeSumOfSquaresTo(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testSumOfSquaresUpToHundred() {
        final int expected = 338350;
        final int actual = calculator.computeSumOfSquaresTo(100);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testDifferenceOfSquaresUpToOne() {
        final int expected = 0;
        final int actual = calculator.computeDifferenceOfSquares(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testDifferenceOfSquaresUpToFive() {
        final int expected = 170;
        final int actual = calculator.computeDifferenceOfSquares(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testDifferenceOfSquaresUpToHundred() {
        final int expected = 25164150;
        final int actual = calculator.computeDifferenceOfSquares(100);
        assertThat(actual).isEqualTo(expected);
    }
}
