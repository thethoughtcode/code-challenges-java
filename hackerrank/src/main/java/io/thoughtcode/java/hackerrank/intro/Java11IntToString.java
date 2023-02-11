package io.thoughtcode.java.hackerrank.intro;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Java11IntToString {

    static final String GOOD_JOB = "Good job";

    static final String WRONG_ANSWER = "Wrong answer.";

    public void run(final InputStream input) {

        try {

            final Scanner scanner = new Scanner(input);

            final int number = scanner.nextInt();

            scanner.close();

            String.valueOf(number);

            System.out.println(GOOD_JOB);

        } catch (final InputMismatchException e) {
            System.out.println(WRONG_ANSWER);
        }
    }
}
