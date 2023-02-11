package io.thoughtcode.java.hackerrank.intro;

import static io.thoughtcode.java.common.NumberConstants.TEN;

public class Java06Loops1 {

    public void run(final int number) {
        for (int index = 1; index <= TEN; index++) {
            System.out.printf("%d x %d = %d\n", number, index, number * index);
        }
    }
}
