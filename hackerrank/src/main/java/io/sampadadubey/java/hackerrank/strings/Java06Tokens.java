package io.sampadadubey.java.hackerrank.strings;

public class Java06Tokens {

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
