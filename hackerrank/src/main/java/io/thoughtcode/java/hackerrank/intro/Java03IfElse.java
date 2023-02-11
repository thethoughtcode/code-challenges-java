package io.thoughtcode.java.hackerrank.intro;

import static io.thoughtcode.java.common.NumberConstants.FIVE;
import static io.thoughtcode.java.common.NumberConstants.ONE;
import static io.thoughtcode.java.common.NumberConstants.SIX;
import static io.thoughtcode.java.common.NumberConstants.TWENTY;
import static io.thoughtcode.java.common.NumberConstants.TWO;

import java.io.InputStream;
import java.util.Scanner;

public class Java03IfElse {

    static final String WEIRD = "Weird";

    static final String NOT_WEIRD = "Not Weird";

    public void run(final InputStream input) {

        final Scanner scanner = new Scanner(input);

        final int number = scanner.nextInt();

        final String ans;

        if (isOdd(number)) {
            ans = WEIRD;
        } else if (TWO <= number && number <= FIVE) {
            ans = NOT_WEIRD;
        } else if (SIX <= number && number <= TWENTY) {
            ans = WEIRD;
        } else {
            ans = NOT_WEIRD;
        }

        System.out.println(ans);

        scanner.close();
    }

    private boolean isOdd(final int number) {
        // Bitwise AND(&) of Number and 1
        return (number & ONE) == ONE;
    }
}
