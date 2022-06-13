package io.sampadadubey.java.hackerrank.intro;

import java.io.InputStream;
import java.util.Scanner;

public class Java09EndOfFile {

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);

        int lineNo = 1;

        while (scanner.hasNext()) {

            final String line = scanner.nextLine();

            System.out.println(lineNo + " " + line);

            lineNo++;
        }

        scanner.close();
    }
}
