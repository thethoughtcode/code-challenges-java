package io.sampadadubey.java.hackerrank.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Java08IPAddressChecker {

    private static final String IP_ADDRESS_RANGE = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";

    private static final String IP_ADDRESS_PATTERN = String.format("%s.%s.%s.%s", IP_ADDRESS_RANGE, IP_ADDRESS_RANGE,
            IP_ADDRESS_RANGE, IP_ADDRESS_RANGE);

    public static void main(final String[] args) {

        // @formatter:off
        final String input = "000.12.12.034\n"
                           + "121.234.12.12\n"
                           + "23.45.12.56\n"
                           + "00.12.123.123123.123\n"
                           + "122.23\n"
                           + "Hello.IP\n"
                           + "255.255.255.255\n"
                           + "256.255.255.255\n";
        // @formatter:on

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        final Java08IPAddressChecker checker = new Java08IPAddressChecker();

        while (in.hasNext()) {
            final String ipAddress = in.next();
            System.out.println(checker.isIpAddress(ipAddress));
        }

        in.close();
    }

    public boolean isIpAddress(final String input) {
        return input.matches(IP_ADDRESS_PATTERN);
    }
}
