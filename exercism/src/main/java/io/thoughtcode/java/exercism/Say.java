package io.thoughtcode.java.exercism;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Say {

    static final int TWENTY = 20;

    static final List<NamedNumber> NUMBERS = new ArrayList<>() {
        {
            add(NamedNumber.QUINTILLION);
            add(NamedNumber.QUADRILLION);
            add(NamedNumber.TRILLION);
            add(NamedNumber.BILLION);
            add(NamedNumber.MILLION);
            add(NamedNumber.THOUSAND);
        }
    };

    public String say(final long number) {

        validate(number);

        final String result;

        if (number != 0) {
            result = sayNumber(number);
        } else {
            result = NamedNumber.getString(number);
        }

        return result;
    }

    private void validate(final long number) {

        if (number < 0) {
            throw new IllegalArgumentException("negative numbers not allowed");
        }

        if (number >= NamedNumber.TRILLION.getNumber()) {
            throw new IllegalArgumentException("number too big");
        }
    }

    private String sayNumber(final long number) {

        final StringBuilder result = new StringBuilder();

        long value = number;

        for (int index = 0; value != 0 && index < NUMBERS.size(); index++) {

            final long divisor = NUMBERS.get(index).getNumber();

            final long currentNumber = value / divisor;

            value = value % divisor;

            if (currentNumber != 0) {
                if (currentNumber >= NamedNumber.HUNDRED.getNumber()) {
                    result.append(
                            format("%s %s ", sayThreeDigitNumber(currentNumber), NamedNumber.getString(divisor)));
                } else {
                    result.append(
                            format("%s %s ", sayTwoDigitNumber(currentNumber), NamedNumber.getString(divisor)));
                }
            } else if (value < NamedNumber.THOUSAND.getNumber()) {
                result.append(sayThreeDigitNumber(number) + " ");
                value = 0;
            }
        }

        if (value != 0) {
            result.append(sayThreeDigitNumber(value));
        }

        return result.toString().trim();
    }

    private String sayThreeDigitNumber(final long number) {

        final int hundred = (int) NamedNumber.HUNDRED.getNumber();

        // final int hundredsValue = ((int) Math.floor(number / hundred)) * hundred;
        final int hundredsDigit = (int) (number / hundred);
        final int twoDigitNumber = (int) (number % NamedNumber.HUNDRED.getNumber());

        final StringBuilder result = new StringBuilder();

        if (hundredsDigit != 0) {
            result.append(NamedNumber.getString(hundredsDigit) + " hundred ");
        }

        if (twoDigitNumber != 0) {
            result.append(sayTwoDigitNumber(twoDigitNumber));
        }

        return result.toString().trim();
    }

    private String sayTwoDigitNumber(final long number) {

        final StringBuilder result = new StringBuilder();

        if (number >= TWENTY) {
            final int tensValue = ((int) Math.floor(number / 10.0)) * 10;
            final int unitsValue = (int) number % 10;

            final String tensString = NamedNumber.getString(tensValue);
            final String unitsString = unitsValue != 0 ? "-" + NamedNumber.getString(unitsValue) : "";

            result.append(format(" %s%s", tensString, unitsString).trim());
        } else {
            result.append(NamedNumber.getString(number));
        }

        return result.toString().trim();
    }
}

enum NamedNumber {

    QUINTILLION(1_000_000_000_000_000_000L),

    QUADRILLION(1_000_000_000_000_000L),

    TRILLION(1_000_000_000_000L),

    BILLION(1_000_000_000L),

    MILLION(1_000_000L),

    THOUSAND(1_000L),

    HUNDRED(100),

    NINETY(90),

    EIGHTY(80),

    SEVENTY(70),

    SIXTY(60),

    FIFTY(50),

    FORTY(40),

    THIRTY(30),

    TWENTY(20),

    NINETEEN(19),

    EIGHTEEN(18),

    SEVENTEEN(17),

    SIXTEEN(16),

    FIFTEEN(15),

    FOURTEEN(14),

    THIRTEEN(13),

    TWELVE(12),

    ELEVEN(11),

    TEN(10),

    NINE(9),

    EIGHT(8),

    SEVEN(7),

    SIX(6),

    FIVE(5),

    FOUR(4),

    THREE(3),

    TWO(2),

    ONE(1),

    ZERO(0);

    static final Map<Long, String> VALUES = new HashMap<Long, String>() {
        {
            Arrays.stream(NamedNumber.values())
                    .forEach(number -> put(number.getNumber(), number.name().toLowerCase(Locale.getDefault())));
        }
    };

    static String getString(final long number) {
        return VALUES.getOrDefault(number, "");
    }

    private final long number;

    private NamedNumber(final long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}
