package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DifferenceOfSquaresCalculatorTest {

    private DifferenceOfSquaresCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new DifferenceOfSquaresCalculator();
    }

    @Test
    public void testSquareOfSumUpToOne() {
        final int expected = 1;
        final int actual = calculator.computeSquareOfSumTo(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSquareOfSumUpToFive() {
        final int expected = 225;
        final int actual = calculator.computeSquareOfSumTo(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSquareOfSumUpToHundred() {
        final int expected = 25502500;
        final int actual = calculator.computeSquareOfSumTo(100);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSumOfSquaresUpToOne() {
        final int expected = 1;
        final int actual = calculator.computeSumOfSquaresTo(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSumOfSquaresUpToFive() {
        final int expected = 55;
        final int actual = calculator.computeSumOfSquaresTo(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSumOfSquaresUpToHundred() {
        final int expected = 338350;
        final int actual = calculator.computeSumOfSquaresTo(100);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testDifferenceOfSquaresUpToOne() {
        final int expected = 0;
        final int actual = calculator.computeDifferenceOfSquares(1);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testDifferenceOfSquaresUpToFive() {
        final int expected = 170;
        final int actual = calculator.computeDifferenceOfSquares(5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testDifferenceOfSquaresUpToHundred() {
        final int expected = 25164150;
        final int actual = calculator.computeDifferenceOfSquares(100);
        assertThat(actual).isEqualTo(expected);
    }
}
