package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(final String[] args) {

        final String input = "3\n([A-Z])(.+)\n[AZ[a-z](a-z)\nbatcatpat(nat\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        int patternCount = scanner.nextInt();

        final PatternSyntaxChecker checker = new PatternSyntaxChecker();

        while (patternCount > 0) {
            checker.isValid(scanner.next());
            patternCount--;
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
