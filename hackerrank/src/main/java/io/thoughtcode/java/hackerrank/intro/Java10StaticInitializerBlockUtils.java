package io.thoughtcode.java.hackerrank.intro;

import java.util.Scanner;

public final class Java10StaticInitializerBlockUtils {

    static final String ERROR = "java.lang.Exception: Breadth and height must be positive";

    private static int breadth;

    private static int height;

    private static boolean flag = true;

    private Java10StaticInitializerBlockUtils() {
    }

    static {

        final Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        height = scanner.nextInt();

        if (breadth <= 0 || height <= 0) {
            System.out.println(ERROR);
            flag = false;
        }

        scanner.close();
    }

    public static void run() {
        if (flag) {
            final int area = breadth * height;
            System.out.print(area);
        }
    }
}
