package io.thoughtcode.java.hackerrank.intro;

import java.io.InputStream;
import java.util.Scanner;

public class Java04StdinStdout2 {

    public void run(final InputStream input) {

        final Scanner scan = new Scanner(input);

        final int intValue = scan.nextInt();
        final double doubleValue = scan.nextDouble();
        scan.nextLine();
        final String stringValue = scan.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        scan.close();
    }
}
