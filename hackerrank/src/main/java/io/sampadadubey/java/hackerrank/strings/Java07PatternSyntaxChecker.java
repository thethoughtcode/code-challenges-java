package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Java07PatternSyntaxChecker {

    public static void main(final String[] args) {

        final String input = "5\n([A-Z])(.+)\n[AZ[a-z](a-z)\nbatcatpat(nat\n[ ]*\n[AAAAAAAA]*\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        int patternCount = scanner.nextInt();

        final Java07PatternSyntaxChecker checker = new Java07PatternSyntaxChecker();

        while (patternCount > 0) {
            final String pattern = scanner.nextLine();
            if (!pattern.trim().isEmpty()) {
                checker.isValid(pattern);
                patternCount--;
            }
        }

        scanner.close();
    }

    private void isValid(final String pattern) {
        try {
            Pattern.compile(pattern);
            System.out.println("Valid");
        } catch (final PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }
}
