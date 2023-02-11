package io.thoughtcode.java.exercism;

public class ResistorColor {

    int colorCode(final String color) {
        return ResistorColorCode.getColorCodeByName(color).getColorCode();
    }

    String[] colors() {
        return ResistorColorCode.colors();
    }
}
