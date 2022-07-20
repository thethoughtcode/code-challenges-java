package io.sampadadubey.java.exercism;

public class LeapYear {

    boolean isLeapYear(final int year) {

        final boolean leapYear;

        if (year % 100 == 0) {
            leapYear = year % 400 == 0;
        } else {
            leapYear = year % 4 == 0;
        }

        return leapYear;
    }
}
