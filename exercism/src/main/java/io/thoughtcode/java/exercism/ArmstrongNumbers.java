package io.thoughtcode.java.exercism;

public class ArmstrongNumbers {

    boolean isArmstrongNumber(final int numberToCheck) {

        final int numberOfDigits = String.valueOf(numberToCheck).length();

        int number = numberToCheck;

        int numberCalculated = 0;

        while (number != 0) {

            final int currentDigit = number % 10;

            numberCalculated = numberCalculated + (int) Math.pow(currentDigit, numberOfDigits);

            number = number / 10;
        }

        return numberToCheck == numberCalculated;
    }
}
