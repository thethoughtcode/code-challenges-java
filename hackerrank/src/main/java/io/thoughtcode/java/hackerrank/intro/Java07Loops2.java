package io.thoughtcode.java.hackerrank.intro;

import static io.thoughtcode.java.common.NumberConstants.TWO;

import java.io.InputStream;
import java.util.Scanner;

public class Java07Loops2 {

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);

        final int lines = scanner.nextInt();

        for (int index = 0; index < lines; index++) {

            final int number1 = scanner.nextInt();
            final int number2 = scanner.nextInt();
            final int iterations = scanner.nextInt();

            System.out.println(getSequence(number1, number2, iterations));
        }

        scanner.close();
    }

    public String getSequence(final int number1, final int number2, final int iterations) {

        final StringBuilder result = new StringBuilder();

        int value = number1;

        for (int index = 0; index < iterations; index++) {
            value = value + ((int) Math.pow(TWO, index) * number2);
            result.append(Integer.toString(value)).append(' ');
        }

        return result.toString().trim();
    }
}
