package io.sampadadubey.java.hackerrank.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Java03BigIntegerSumAndProduct {

    public static void main(final String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final String number1 = scanner.nextLine();
        final String number2 = scanner.nextLine();

        scanner.close();

        final Java03BigIntegerSumAndProduct object = new Java03BigIntegerSumAndProduct();

        final String[] result = object.bigIntegerSumAndProduct(number1, number2);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    String[] bigIntegerSumAndProduct(final String number1, final String number2) {

        final BigInteger bigInteger1 = new BigInteger(number1);
        final BigInteger bigInteger2 = new BigInteger(number2);

        final BigInteger sum1And2 = bigInteger1.add(bigInteger2);
        final BigInteger product1And2 = bigInteger1.multiply(bigInteger2);

        return new String[] { sum1And2.toString(), product1And2.toString() };
    }
}
