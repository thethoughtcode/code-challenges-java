package io.sampadadubey.java.exercism;

public class LeapYear {

    boolean isLeapYear(final int year) {

        boolean leapYear = false;

        if (year % 100 == 0) {
            leapYear = year % 400 == 0;
        } else {
            leapYear = year % 4 == 0;
        }

        return leapYear;
    }
}
