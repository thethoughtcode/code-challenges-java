package io.thoughtcode.java.exercism;

import io.thoughtcode.java.common.NumberConstants;

public class NaturalNumber {

    private final int number;

    public NaturalNumber(final int number) {

        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }

        this.number = number;
    }

    public Classification getClassification() {

        final Classification result;

        if (number == NumberConstants.ONE) {
            result = Classification.DEFICIENT;
        } else {
            final int sum = getSumOfDivisors(number);

            if (sum < number) {
                result = Classification.DEFICIENT;
            } else if (sum > number) {
                result = Classification.ABUNDANT;
            } else {
                result = Classification.PERFECT;
            }
        }

        return result;
    }

    private int getSumOfDivisors(final int number) {

        int loopNumber = number;
        int sum = 1;
        int divisor = 2;

        while (divisor < loopNumber) {

            final double dividendWithDecimal = ((double) number) / divisor;
            final double dividendWithoutDecimal = Math.floor(dividendWithDecimal);

            if (dividendWithDecimal == dividendWithoutDecimal) {
                loopNumber = (int) dividendWithDecimal;
                if (divisor == loopNumber) {
                    sum = sum + divisor;
                } else {
                    sum = sum + divisor + loopNumber;
                }
            }

            divisor++;
        }

        return sum;
    }
}

enum Classification {
    DEFICIENT, PERFECT, ABUNDANT
}
