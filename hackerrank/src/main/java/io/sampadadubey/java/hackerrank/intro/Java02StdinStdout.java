package io.sampadadubey.java.hackerrank.intro;

import java.io.InputStream;
import java.util.Scanner;

public class Java02StdinStdout {

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);

        final int number1 = scanner.nextInt();
        final int number2 = scanner.nextInt();
        final int number3 = scanner.nextInt();

        scanner.close();

        System.out.printf("%d%n%d%n%d%n", number1, number2, number3);
    }
}
