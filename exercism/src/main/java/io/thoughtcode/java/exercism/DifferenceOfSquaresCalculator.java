package io.thoughtcode.java.exercism;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(final int input) {
        // Mathematical Formula = [(n x (n + 1)) / 2] ^ 2
        final int sumTo = (input * (input + 1)) / 2;
        return (int) Math.pow((double) sumTo, 2.0);
    }

    int computeSumOfSquaresTo(final int input) {
        // Mathematical Formula = (n x n+1 x 2n+1) / 6
        return (input * (input + 1) * (2 * input + 1)) / 6;
    }

    int computeDifferenceOfSquares(final int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
