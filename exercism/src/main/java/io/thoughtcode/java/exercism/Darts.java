package io.thoughtcode.java.exercism;

import io.thoughtcode.java.common.NumberConstants;

public class Darts {

    private final double hypotenuse;

    Darts(final double xPoint, final double yPoint) {
        this.hypotenuse = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));
    }

    int score() {

        final int score;

        if (hypotenuse <= NumberConstants.ONE) {
            score = NumberConstants.TEN;
        } else if (hypotenuse <= NumberConstants.FIVE) {
            score = NumberConstants.FIVE;
        } else if (hypotenuse <= NumberConstants.TEN) {
            score = NumberConstants.ONE;
        } else {
            score = NumberConstants.ZERO;
        }

        return score;
    }
}
