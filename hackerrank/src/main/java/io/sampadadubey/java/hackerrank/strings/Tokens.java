package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Tokens {

    public static void main(String[] args) {

        final String input = "He is a very very good boy, isn't he?";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final String string = scan.nextLine();

        scan.close();

        new Tokens().processToken(string);
    }

    public void processToken(final String string) {

        final String[] tokens = string.split("[^A-Za-z]");

        int finalCount = 0;

        final StringBuilder output = new StringBuilder();

        for (String token : tokens) {
            if (!"".equals(token.trim())) {
                finalCount++;
                output.append(token.trim() + "\n");
            }
        }

        System.out.println(finalCount);
        System.out.print(output.toString());
    }
}
