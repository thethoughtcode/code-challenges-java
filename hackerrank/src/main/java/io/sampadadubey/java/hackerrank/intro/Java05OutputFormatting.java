package io.sampadadubey.java.hackerrank.intro;

import static io.sampadadubey.java.common.NumberConstants.THREE;

import java.io.InputStream;
import java.util.Scanner;

public class Java05OutputFormatting {

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);

        System.out.println("================================");

        for (int index = 0; index < THREE; index++) {
            final String string = scanner.next();
            final int integer = scanner.nextInt();
            System.out.printf("%-15s%03d\n", string, integer);
        }

        System.out.println("================================");

        scanner.close();
    }
}
