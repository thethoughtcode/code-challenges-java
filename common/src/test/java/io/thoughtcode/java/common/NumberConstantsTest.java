package io.thoughtcode.java.common;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class NumberConstantsTest {

    @Test
    void defaultCase() {

        final Map<Integer, String> values = new HashMap<>();

        values.put(NumberConstants.ZERO, "0");
        values.put(NumberConstants.ONE, "1");
        values.put(NumberConstants.TWO, "2");
        values.put(NumberConstants.THREE, "3");
        values.put(NumberConstants.FOUR, "4");
        values.put(NumberConstants.FIVE, "5");
        values.put(NumberConstants.SIX, "6");
        values.put(NumberConstants.SEVEN, "7");
        values.put(NumberConstants.EIGHT, "8");
        values.put(NumberConstants.NINE, "9");
        values.put(NumberConstants.TEN, "10");
        values.put(NumberConstants.TEEN_START, "13");
        values.put(NumberConstants.TEEN_END, "19");
        values.put(NumberConstants.TWENTY, "20");
        values.put(NumberConstants.THIRTY, "30");
        values.put(NumberConstants.FORTY, "40");
        values.put(NumberConstants.FIFTY, "50");
        values.put(NumberConstants.HUNDRED, "100");

        for (final Entry<Integer, String> entry : values.entrySet()) {
            assertThat(entry.getKey().intValue() == Integer.parseInt(entry.getValue())).isTrue();
        }
    }
}
