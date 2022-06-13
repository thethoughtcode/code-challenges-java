package io.sampadadubey.java.hackerrank.strings;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    // @formatter:off
    private static final Pattern DUPLICATE_WORD_REGEX = Pattern.compile("\\b(\\w+)(?:\\W+\\1\\b)+", CASE_INSENSITIVE);

    public static void main(final String[] args) {

        final String input = "5\n"
                           + "Goodbye bye bye world world world\n"
                           + "Sam went went to to to his business\n"
                           + "Reya is is the the best player in eye eye game\n"
                           + "in inthe\n"
                           + "Hello hello Ab aB";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        // @formatter:on

        final Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        final DuplicateWords object = new DuplicateWords();

        while (testCases > 0) {

            final String sentence = in.nextLine();

            System.out.println(object.removeDuplicateWords(sentence));

            testCases--;
        }

        in.close();
    }

    public String removeDuplicateWords(final String sentence) {

        String result = sentence;

        final Matcher matcher = DUPLICATE_WORD_REGEX.matcher(sentence);

        while (matcher.find()) {
            result = result.replaceAll(matcher.group(), matcher.group(1));
        }

        return result;
    }
}
