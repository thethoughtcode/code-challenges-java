package io.sampadadubey.java.exercism;

public class ResistorColorDuo {

    int value(final String[] colors) {

        final StringBuilder code = new StringBuilder();

        final int length = Math.min(1, colors.length);

        for (int index = 0; index <= length; index++) {
            code.append(ResistorColorCode.getColorCodeByName(colors[index]).getColorCode());
        }

        return Integer.parseInt(code.toString(), 10);
    }
}
