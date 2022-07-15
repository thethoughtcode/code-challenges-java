package io.sampadadubey.java.exercism;

import java.util.Arrays;

public enum ResistorColorCode {

    BLACK(0),

    BROWN(1),

    RED(2),

    ORANGE(3),

    YELLOW(4),

    GREEN(5),

    BLUE(6),

    VIOLET(7),

    GREY(8),

    WHITE(9);

    private int colorCode;

    private ResistorColorCode(final int colorCode) {
        this.colorCode = colorCode;
    }

    public int getColorCode() {
        return colorCode;
    }

    static ResistorColorCode getColorCodeByName(final String color) {
        return Arrays.stream(ResistorColorCode.values())
                     .filter(it -> it.name().equalsIgnoreCase(color))
                     .findFirst()
                     .orElseThrow(() -> new IllegalArgumentException("Invalid Resistor Color - " + color));
    }

    static String[] colors() {

        final ResistorColorCode[] values = values();

        final String[] colors = new String[values.length];

        for (int index = 0; index < values.length; index++) {
            colors[index] = values[index].name().toLowerCase();
        }

        return colors;
    }
}
