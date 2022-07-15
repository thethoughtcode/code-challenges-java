package io.sampadadubey.java.exercism;

public class Darts {

    private final double hypotenuse;

    Darts(final double xPoint, final double yPoint) {
        this.hypotenuse = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));
    }

    int score() {

        final int score;

        if (hypotenuse <= 1) {
            score = 10;
        } else if (hypotenuse <= 5) {
            score = 5;
        } else if (hypotenuse <= 10) {
            score = 1;
        } else {
            score = 0;
        }

        return score;
    }
}
