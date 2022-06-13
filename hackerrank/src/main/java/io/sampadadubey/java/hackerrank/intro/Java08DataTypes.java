package io.sampadadubey.java.hackerrank.intro;

import java.io.InputStream;
import java.util.Scanner;

public class Java08DataTypes {

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);
        final int totalInputs = scanner.nextInt();

        scanner.nextLine();

        for (int index = 0; index < totalInputs; index++) {

            final String inputValue = scanner.nextLine();

            checkType(inputValue);
        }

        scanner.close();
    }

    public void checkType(final String inputValue) {

        try {

            final long value = Long.parseLong(inputValue);

            System.out.println(value + " can be fitted in:");

            canFitInTypeByte(value);
            canFitInTypeShort(value);
            canFitInTypeInteger(value);

            System.out.println("* long");

        } catch (final NumberFormatException e) {
            System.out.println(inputValue + " can't be fitted anywhere.");
        }
    }

    private void canFitInTypeByte(final long value) {
        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
    }

    private void canFitInTypeShort(final long value) {
        if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
    }

    private void canFitInTypeInteger(final long value) {
        if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
    }
}
