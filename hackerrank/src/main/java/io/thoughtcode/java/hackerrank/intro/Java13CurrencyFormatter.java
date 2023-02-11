package io.thoughtcode.java.hackerrank.intro;

import java.text.NumberFormat;
import java.util.Locale;

public class Java13CurrencyFormatter {

    public void format(final double payment) {

        final NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        final NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        final NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        final NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + usFormatter.format(payment));
        System.out.println("India: " + indiaFormatter.format(payment));
        System.out.println("China: " + chinaFormatter.format(payment));
        System.out.println("France: " + franceFormatter.format(payment));
    }
}
