package io.sampadadubey.java.hackerrank.bignumbers;

import java.math.BigInteger;

public class Java02BigIntegerPrime {

    public static void main(String[] args) {

        final String number = args[0];

        if (new BigInteger(number).isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
