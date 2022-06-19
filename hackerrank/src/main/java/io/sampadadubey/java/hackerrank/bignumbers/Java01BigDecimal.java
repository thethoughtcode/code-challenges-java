package io.sampadadubey.java.hackerrank.bignumbers;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Java01BigDecimal {

    public static void main(final String[] args) {

        final String input = String.join("\n", Arrays.asList(
            "9",
            "-100",
            "50",
            "0",
            "56.6",
            "90",
            "0.12",
            ".12",
            "02.34",
            "000.000"
        ));

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Java01BigDecimal object = new Java01BigDecimal();

        final Scanner scanner = new Scanner(System.in);

        final int inputCount = scanner.nextInt();

        final String[] numbers = new String[inputCount];
        for (int index = 0; index < inputCount; index ++) {
            numbers[index] = scanner.next();
        }

        scanner.close();

        object.sortNumbers(numbers);

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }

    void sortNumbers(final String[] numbers) {

        Arrays.sort(numbers, (number1, number2) -> {

            if (number1 != null && number2 != null) {
                final BigDecimal bigDecimalNumber1 = BigDecimal.valueOf(Double.parseDouble(number1));
                final BigDecimal bigDecimalNumber2 = BigDecimal.valueOf(Double.parseDouble(number2));

                return bigDecimalNumber2.compareTo(bigDecimalNumber1);
            }

            return 0;
        });
    }
}
