package io.thoughtcode.java.hackerrank.intro;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Java12DateAndTime {

    public String findDay(final int month, final int day, final int year) {

        final Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);

        final Locale locale = Locale.getDefault();

        return new SimpleDateFormat("EEEE", locale).format(calendar.getTime()).toUpperCase(locale);
    }
}
